package main

import (
    "fmt"
)

/*
 * Complete the 'simpleArraySum' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY ar as parameter.
 */

func simpleArraySum(ar []int32) int32 {
    var total int32 = 0
		for _, it := range ar {
			total += it
		}	
		return total
}

func main() {

		ar := make([]int32, 4)
		ar[0] = 5
		ar[1] = 7
		ar[2] = 3
		ar[3] = 9

    result := simpleArraySum(ar)

    fmt.Printf("%d\n", result)
}
