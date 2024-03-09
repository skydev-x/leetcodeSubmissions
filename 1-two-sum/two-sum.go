func twoSum(nums []int, target int) []int {
	restult := make([]int, 2)
	mapNums := make(map[int]int)
	for i, num := range nums {
		val, ok := mapNums[target-num]
		if ok {
			restult[0] = val
			restult[1] = i
			return restult
		} else {
			mapNums[num] = i
		}
	}
	return restult
}
