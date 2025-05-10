package main

import (
    "fmt"
)

func firstNonRepeatingCharacter(s string) int {
  characters := make(map[rune]bool)
  for _, c := range s {
    if _, exists := characters[c]; exists {
      characters[c] = false
    } else {
      characters[c] = true
    }
  }
  for idx, c := range s {
    if characters[c] {
      return idx
    }
  }
  return -1
}

func main() {
  fmt.Println(firstNonRepeatingCharacter("abcdcaf"))
}
