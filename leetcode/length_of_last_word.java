class Solution {

	/// returns the length of last word of the string "s"
	public int lengthOfLastWord(String s) {
		String[] array = s.split(" ");
		return array[array.length - 1].length();
	}
}