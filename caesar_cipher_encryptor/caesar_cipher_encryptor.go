package main

import (
	"fmt"
)

func caesarCipherEncryptor(str string, key int) string {
	newLetters := []rune{}
	newKey := key % 26

	for _, letter := range str {
		newLetter := getNewLetter(letter, newKey)
		newLetters = append(newLetters, newLetter)
	}

	return string(newLetters)
}

func getNewLetter(letter rune, key int) rune {
	newCharCode := int(letter) + key
	if newCharCode <= 'z' {
		return rune(newCharCode)
	}
	return rune('a' + (newCharCode - 'z' - 1))
}

func main() {
	fmt.Println(caesarCipherEncryptor("xyz", 2))
}
