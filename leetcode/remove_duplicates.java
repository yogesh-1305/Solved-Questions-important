class Solution {

	/// remove every duplicate entry from array and return size of new array;
	public int removeDuplicates(int[] nums) {
		int insertIndex = 1;

		for (int i = 1; i < nums.length; i++) {
			if (nums[i-1] != nums[i]) {
				nums[insertIndex] = nums[i];
				insertIndex++;
			}
		}
		return insertIndex;
	}

	public int[] removeDuplicates(int[] nums) {
		List<Integer> newList = new List<Integer>();
		List<Integer> numsList = Arrays.asList(nums);

		for (int item: numsList) {
			if (!newList.contains(item)) {
				newList.add(item);
			} 
		}

		return newList.toArray();
	}

	public int[] removeDuplicates(int[] nums) {
		Set<Integer> set = new Set<Integer>();

		for (int i: nums) {
			set.add(i);
		}

		return set.toArray();
	}
}