package main

import (
  "fmt"
)

func isPalindrome(s string) bool {
  firstIdx := 0
  lastIdx := len(s) - 1
  for firstIdx <= lastIdx {
    if s[firstIdx] != s[lastIdx] {
      return false
    }
    firstIdx++
    lastIdx--
  }
  return true
}

func main() {
  fmt.Println(isPalindrome("aba"))
}
