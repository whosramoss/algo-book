package main

import "fmt"

func spiralTraverse(array [][]int) []int {
	output := []int{}
	startCol := 0
	startRow := 0
	endCol := len(array[0]) - 1
	endRow := len(array) - 1

	for startCol <= endCol && startRow <= endRow {
		for col := startCol; col <= endCol; col++ {
			output = append(output, array[startRow][col])
		}
		for row := startRow + 1; row <= endRow; row++ {
			output = append(output, array[row][endCol])
		}
		for col := endCol - 1; col >= startCol; col-- {
			if startRow == endRow {
				break
			}
			output = append(output, array[endRow][col])
		}
		for row := endRow - 1; row > startRow; row-- {
			if startCol == endCol {
				break
			}
			output = append(output, array[row][startCol])
		}
		startCol++
		endCol--
		startRow++
		endRow--
	}

	return output
}

func main() {
	matrix := [][]int{
		{1, 2, 3},
		{8, 9, 4},
		{7, 6, 5},
	}
	fmt.Println(spiralTraverse(matrix)) // Output: [1 2 3 4 5 6 7 8 9]
}
