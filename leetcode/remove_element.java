import java.util.*;

class Solution {

	public int[] removeElement(int[] nums, int val) {
		List<Integer> list = Arrays.asList(nums);

		for (int i: list) {
			if (i == val) {
				list.remove(i);
			}
		}

		return list.toArray();
	}

}