/*
 A postfix expression is a mathematical expression but with the operators written after the 
 operands rather than before.
1 + 1 becomes 1 1 +
1 + 2 * 3 + 4 becomes 1 2 3 * + 4 +
Write a method postfixEvaluate that accepts a postfix expression string, evaluates it, 
and returns the result. The method must make use of queue not stack. 
All operands are integers; legal operators are +, -, *, and /
postFixEvaluate"5 2 4 * + 7 -”) returns 6
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		String exp = "5 2 4 * + 7 -";
		
		int result =  postfixEvaluate(exp);
		System.out.println("Result is " + result);
	}
	
	public static int postfixEvaluate(String expression) {
		Queue<Integer> qTemp = new LinkedList<Integer>();
		Queue<Integer> qNew = new LinkedList<Integer>();
		Scanner input = new Scanner(expression);
		int counter = 0;
		
		while (input.hasNext()) {
			if (input.hasNextInt()) {
				qTemp.add(input.nextInt());
				counter++;
			} else {
				String operator = input.next();

				while (counter>2) {
					qNew.add(qTemp.remove());
					counter--;
				} 
				int operand1 = qTemp.remove();
				int operand2 = qTemp.remove();
				if (operator.equals("+")) {
					qNew.add(operand1 + operand2);
					counter--;
				} else if (operator.equals("-")) {
					qNew.add(operand1 - operand2);
					counter--;
				} else if (operator.equals("*")) {
					qNew.add(operand1 * operand2);
					counter--;
				} else {
					qNew.add(operand1 / operand2);
					counter--;
				}
				}
				while(!qNew.isEmpty()) {
					qTemp.add(qNew.remove());
				}
			}
		return qTemp.remove();
		}
	}

