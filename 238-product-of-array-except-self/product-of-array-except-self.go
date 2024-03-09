func productExceptSelf(nums []int) []int {
	prefix := make([]int, len(nums))
	suffix := make([]int, len(nums))

	result := make([]int, len(nums))
	prefix_cur, suffix_cur := 1, 1

	for i, num := range nums {
		prefix[i] = prefix_cur
		prefix_cur *= num
	}

	for j := range nums {
		suffix[len(nums)-1-j] = suffix_cur
		suffix_cur *= nums[len(nums)-1-j]
	}

	for i := range prefix {
		result[i] = prefix[i] * suffix[i]
	}

	return result
}