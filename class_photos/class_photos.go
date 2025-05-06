package main

import (
	"fmt"
	"sort"
)

func classPhotos(redShirtHeights []int, blueShirtHeights []int) bool {
	sort.Sort(sort.Reverse(sort.IntSlice(redShirtHeights)))
	sort.Sort(sort.Reverse(sort.IntSlice(blueShirtHeights)))

	firstRowColor := "RED"
	if blueShirtHeights[0] < redShirtHeights[0] {
		firstRowColor = "BLUE"
	}

	for i := range redShirtHeights {
		redHeight := redShirtHeights[i]
		blueHeight := blueShirtHeights[i]
		if firstRowColor == "RED" {
			if redHeight >= blueHeight {
				return false
			}
		} else {
			if redHeight <= blueHeight {
				return false
			}
		}
	}
	return true
}

func main() {
	redShirtHeights := []int{5, 8, 1, 3, 4}
	blueShirtHeights := []int{6, 9, 2, 4, 5}
	fmt.Println(classPhotos(redShirtHeights, blueShirtHeights))
}
