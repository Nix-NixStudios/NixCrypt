#!/bin/bash
# NixCrypt v1.0 - Combined
# © 2025 NixStudios / Nix

# Encrypt mapping
declare -A enc=(
  ["a"]="@" ["s"]="#" ["h"]="-" ["k"]="(" ["u"]="7" ["d"]="$"
  ["e"]="3" ["p"]="0" ["r"]="4" ["i"]="8" ["o"]="9"
  ["A"]="@" ["B"]=";" ["C"]="'" ["D"]="$" ["E"]="3"
  ["F"]="_" ["G"]="&" ["H"]="-"
  ["I"]="8" ["J"]="+" ["K"]="(" ["L"]=")" ["M"]="?" ["N"]="!"
  ["O"]="9" ["P"]="0" ["Q"]="1" ["R"]="4" ["S"]="#"
  ["T"]="5" ["U"]="7" ["V"]=":" ["W"]="2" ["X"]="\"" ["Y"]="6"
  ["Z"]="*" ["g"]="&" ["t"]="5"
)

# Auto-generate decrypt mapping
declare -A dec
for k in "${!enc[@]}"; do
  dec["${enc[$k]}"]=$k
done

function encrypt() {
  local input="$1" output=""
  for ((i=0; i<${#input}; i++)); do
    c="${input:$i:1}"
    output+="${enc[$c]:-$c}"
  done
  echo "$output"
}

function decrypt() {
  local input="$1" output=""
  for ((i=0; i<${#input}; i++)); do
    c="${input:$i:1}"
    output+="${dec[$c]:-$c}"
  done
  echo "$output"
}

echo "=============================="
echo "   NixCrypt v1.0 (Bash)"
echo "=============================="
echo "1) Encrypt / Enkripsi"
echo "2) Decrypt / Dekripsi"
read -p "Choose (1/2) / Pilih (1/2): " mode
echo

read -p "Enter Text / Masukkan Teks: " text
if [[ "$mode" == "1" ]]; then
  echo "Result / Hasil: $(encrypt "$text")"
elif [[ "$mode" == "2" ]]; then
  echo "Result / Hasil: $(decrypt "$text")"
else
  echo "Invalid option / Pilihan salah!"
fi