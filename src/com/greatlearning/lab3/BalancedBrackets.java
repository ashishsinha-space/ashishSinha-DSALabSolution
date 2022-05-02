/**
 * 
 */
package com.greatlearning.lab3;

import java.util.Stack;

/**
 * @author AshishSinha
 *
 */
public class BalancedBrackets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bracketExpression = "( [ [ { } ] ] )";
		if (checkBalance(bracketExpression)) {
			System.out.println("Balance Brackets");
		} else {
			System.out.println("Not Balance Brackets");
		}
	}

	static boolean checkBalance(String bracketExpression) {

		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < bracketExpression.length(); i++) {

			char a = bracketExpression.charAt(i);
			if (a == '(' || a == '[' || a == '{') {
				stack.push(a);
				continue;
			}
			if (stack.isEmpty())
				return false;
			char c;
			switch (a) {
			case '}':
				c = stack.pop();
				if (c == '(' || c == '[')
					return false;

				break;
			case ')':
				c = stack.pop();
				if (c == '{' || c == '[')
					return false;
				break;
			case ']':
				c = stack.pop();
				if (c == '(' || c == '{')
					return false;
				break;
			default:
				break;
			}
		}
		return stack.isEmpty();
	}

}
