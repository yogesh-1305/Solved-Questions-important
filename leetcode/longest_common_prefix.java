class Solution {

	String longestCommonPrefix(String[] strs) {
		// if strs is empty, return empty string
		if (strs.isEmpty()) return "";

		// let's assume the the prefix we're looking for is the first element
		String prefix = strs[0];

		// iterating the list from 2nd element to last
		for (int i = 1; i < strs.length ; i++) {
			// inside a while loop, shorten the [prefix] bt one char from last 
			// untill it matches the character at 0th index if item at strs[i]
			while (strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);

				// also, if prefix is empty, return empty string, this means, 
				// there is atleast one word which doesn't match with others
				if (prefix.isEmpty()) return "";
			}
		}
		// return [prefix] as at this point of time, we've found our common prefix
		return prefix;
	}
}