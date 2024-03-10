func strStr(haystack string, needle string) int {
	if len(needle) > len(haystack) {
		return -1
	}
	i := 0
	for i < len(haystack) {
		if haystack[i] == needle[0] {
			found := false
			for j, _ := range needle {
				if i+j >= len(haystack) {
					found = false
					break
				}
				if needle[j] != haystack[i+j] {
					found = false
					break
				} else {
					found = true
					j++
				}
			}
			if found {
				return i
			}
		}
		i++
	}
	return -1
}