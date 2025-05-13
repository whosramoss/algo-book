package main

import (
	"fmt"
)

func convertToTitle(columnNumber int) string {
	result := ""
	totalLetters := 26
	asciiInitCode := 65

	for columnNumber > 0 {
		columnNumber--
		charCode := (columnNumber % totalLetters) + asciiInitCode
		result = string(rune(charCode)) + result
		columnNumber /= totalLetters
	}

	return result
}

func main() {
	fmt.Println(convertToTitle(1))   // "A"
	fmt.Println(convertToTitle(28))  // "AB"
	fmt.Println(convertToTitle(701)) // "ZY"
}
