package main

import "fmt"

/**
 * Try out of the bubble sort algorithm in golang
 * Given to list of integers, merge them and sort the array in ascending order using the Bubble Sort algorithm above.
 * Repetition is permited.
 *
 */

func main() {
	a := []int{1, 3, 5}
	b := []int{4, 6, 2}
	d := bubbleSort(a, b)
	fmt.Println("Sorted Array:", d)
}

func bubbleSort(a, b []int) []int {
	c := append(a, b...)
	fmt.Println(c)

	var swapped bool
	for i := 0; i <= len(c)-1; i++ {
	swapped = false	
		for j:= 0; j < len(c)-1-i; j++ {
			if c[j] > c[j + 1] {
				temp := c[j]
				c[j] = c[j + 1]
				c[j + 1] = temp
				swapped = true
			}

		}
		if !swapped {
			break
		}

	}

	return c
}
