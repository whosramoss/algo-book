package main

import (
	"fmt"
)

func lengthAfterTransformations(s string, t int) int {
	const MOD = 1_000_000_007
	count := make([]int, 26)
	for _, ch := range s {
		count[ch-'a']++
	}

	for step := 0; step < t; step++ {
		newCount := make([]int, 26)
		for i := 0; i < 26; i++ {
			if i == 25 {
				newCount[0] = (newCount[0] + count[i]) % MOD
				newCount[1] = (newCount[1] + count[i]) % MOD
			} else {
				newCount[i+1] = (newCount[i+1] + count[i]) % MOD
			}
		}
		count = newCount
	}

	sum := 0
	for _, c := range count {
		sum = (sum + c) % MOD
	}
	return sum
}

func main() {
	fmt.Println(lengthAfterTransformations("abcyy", 2)) // 7
	fmt.Println(lengthAfterTransformations("azbk", 1))  // 5
}
