package algorithms;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Parantheses {
	
	public static void main(String [] args) {
		//initialise Stack of type char
		Stack<Character> stack = new Stack<>();
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		char openTarget = '(';
		char closeTarget = ')';
		
		//If first bracket is ')', java will throw stackException. So catch exception and throw printed error instead 
		try {
			//iterate over input's length, and push element into stack at occurrence of open bracket.
			//A closing bracket pops the stack because it marks 'an end' to the open bracket
			for(int i=0; i < input.length(); i++) {	
				char c = input.charAt(i);
				if(c == openTarget) {
					stack.push(c);
				}
				else if(c == closeTarget) {
					stack.pop();
				}
			}
		} catch(EmptyStackException e) {
			System.err.println("Cannot start with ')' ");
		}
		//If stack is NOT empty, the input is invalid, otherwise the phrase is valid
		if(!stack.empty()) {
			System.err.println("Invalid ");
		}
		else {
			System.out.println("Valid");
		}
	}
}
