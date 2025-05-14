package main

import (
	"fmt"
	"sort"
)

func findThreeDigitEvenNumbers(digits []int) []int {
	res := map[int]bool{}
	n := len(digits)

	for i := 0; i < n; i++ {
		if digits[i] == 0 {
			continue
		}
		for j := 0; j < n; j++ {
			if j == i {
				continue
			}
			for k := 0; k < n; k++ {
				if k == i || k == j {
					continue
				}
				if digits[k]%2 != 0 {
					continue
				}
				num := digits[i]*100 + digits[j]*10 + digits[k]
				res[num] = true
			}
		}
	}

	var result []int
	for num := range res {
		result = append(result, num)
	}
	sort.Ints(result)
	return result
}

func main() {
	fmt.Println(findThreeDigitEvenNumbers([]int{2, 1, 3, 0})) // [102 120 130 132 210 230 302 310 312 320]
}
