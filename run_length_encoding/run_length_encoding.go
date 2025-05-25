package main

import (
	"fmt"
	"strings"
)

func runLengthEncoding(s string) string {
	currentRunLength := 1
	encodedStringCharacters := []string{}
	for i := 1; i < len(s); i++ {
		previousCharacter := s[i-1]
		currentCharacter := s[i]
		if currentCharacter != previousCharacter || currentRunLength == 9 {
			encodedStringCharacters = append(encodedStringCharacters, fmt.Sprintf("%d", currentRunLength))
			encodedStringCharacters = append(encodedStringCharacters, string(previousCharacter))
			currentRunLength = 0
		}
		currentRunLength++
	}

	encodedStringCharacters = append(encodedStringCharacters, fmt.Sprintf("%d", currentRunLength))
	encodedStringCharacters = append(encodedStringCharacters, string(s[len(s)-1]))
	return strings.Join(encodedStringCharacters, "")
}

func main() {
	input := "aaaaaaaaaaaaaaaaabbbbbbbbbbbbbccccccccccc"
	encoded := runLengthEncoding(input)
	fmt.Println(encoded)
}
