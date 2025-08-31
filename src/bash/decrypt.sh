#!/bin/bash
# NixCrypt v1.0 - Decrypt Only
# © 2025 NixStudios / Nix

declare -A dec=(
  ["@"]="a" ["#"]="s" ["-"]="h" ["("]="k" ["7"]="u" ["$"]="d"
  ["3"]="e" ["0"]="p" ["4"]="r" ["8"]="i" ["9"]="o"
  [";"]="B" ["'"]="C" ["_"]="F" ["&"]="G" ["+"]"="J"
  [")"]="L" ["?"]="M" ["!"]="N" ["1"]="Q" ["2"]="W"
  ["\""]="X" ["6"]="Y" ["*"]="Z" ["5"]="t"
)

function decrypt() {
  local input="$1" output=""
  for ((i=0; i<${#input}; i++)); do
    c="${input:$i:1}"
    output+="${dec[$c]:-$c}"
  done
  echo "$output"
}

read -p "Enter Text / Masukkan Teks: " text
echo "Result / Hasil: $(decrypt "$text")"