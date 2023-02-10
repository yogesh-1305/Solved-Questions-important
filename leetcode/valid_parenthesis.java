class Solution {

	public boolean isValid(String s) {
		// create a stack to store characters
		Stack<Character> stack = new Stack();

		// iterating every character of 's'
		for (char c: s.toCharArray()) {
			switch (c) {
			case '(':
			case '[':
			case '{': 
				// if c is any opening bracket, insert it in the stack
				stack.push(c);
				break;

			/// for every closing bracket, the topmost element in the stack has to be its corresponding
			/// opening bracket, otherwise, the brackets are not in order, hence we return false
			case ')':
				if (stack.isEmpty() || stack.pop() != '(') return false;
				break;
			case ']':
				if (stack.isEmpty() || stack.pop() != '[') return false;
				break;
			case '}':
				if (stack.isEmpty() || stack.pop() != '{') return false;
				break;
			}
		}

		// if stack is empty, means that for every opening bracket we've 
		//found a closing bracket and popped them out,
		// means we're good, 
		// else,
		// if stack is not empty, means we have some opening brackets whose 
		//corresponding closing brackets were not there in the string.
		return stack.isEmpty();
	}
}