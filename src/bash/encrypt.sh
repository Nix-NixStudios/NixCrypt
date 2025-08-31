#!/bin/bash
# NixCrypt v1.0 - Encrypt Only
# © 2025 NixStudios / Nix

declare -A enc=(
  ["a"]="@" ["s"]="#" ["h"]="-"
  ["k"]="(" ["u"]="7" ["d"]="$" ["e"]="3" ["p"]="0" ["r"]="4"
  ["i"]="8" ["o"]="9"
  ["A"]="@" ["B"]=";" ["C"]="'" ["D"]="$" ["E"]="3"
  ["F"]="_" ["G"]="&" ["H"]="-"
  ["I"]="8" ["J"]="+" ["K"]="(" ["L"]=")" ["M"]="?" ["N"]="!"
  ["O"]="9" ["P"]="0" ["Q"]="1" ["R"]="4" ["S"]="#"
  ["T"]="5" ["U"]="7" ["V"]=":" ["W"]="2" ["X"]="\"" ["Y"]="6"
  ["Z"]="*" ["g"]="&" ["t"]="5"
)

function encrypt() {
  local input="$1" output=""
  for ((i=0; i<${#input}; i++)); do
    c="${input:$i:1}"
    output+="${enc[$c]:-$c}"
  done
  echo "$output"
}

read -p "Enter Text / Masukkan Teks: " text
echo "Result / Hasil: $(encrypt "$text")"   