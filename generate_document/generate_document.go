package main

import (
    "fmt"
)

func generateDocument(characters, document string) bool {
  charCount := make(map[rune]int)

  for _, c := range characters {
    charCount[c]++
  }

  for _, c := range document {
    if count, ok := charCount[c]; !ok || count == 0 {
        return false
    }
    charCount[c]--
  }

  return true
}

func main() {
    fmt.Println(generateDocument("abc", "cab"))
}
