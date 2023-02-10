class Solution {

	public int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >=0; i--) {

			/*
			if the last element is less than 9, then we just increment it by 1
			and return.
			*/
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			`
			/*
			if the element is 9, then we replace it with a 0
			*/
			digits[i] = 0;
		}

		/*
		at this point, if the original array was [9,9,9,9], then it would have become [0,0,0,0],
		but we need the resultant array as [1,0,0,0,0],
		so,
		we again initialize the array with original length + 1 size,
		and replace its 1 first element with 1
		*/
		digits = new int[digits.length+1];
		digits[0] = 1;
		return digits;
	}

}