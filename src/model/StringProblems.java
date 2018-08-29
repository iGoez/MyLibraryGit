package model;

import TDA.IStack;

public class StringProblems{
	
	public boolean isBalance (String text) {
		char value1 = '{';
		char value2 = '[';
		char value3 = '(';
		
		char ovalue1 = '}';
		char ovalue2 = ']';
		char ovalue3 = ')';
		
		IStack<Character> newStack1 = new GoezList<Character>();
		IStack<Character> newStack2 = new GoezList<Character>();
		
		boolean rst = true;
		boolean isBalance = false;
		char temp1 = ' ';
		char temp2 = ' ';
		
		for (int i = 0; i < text.length() && true; i++) {
			temp1 = text.charAt(i);
			if(temp1 == value1 || temp1 == value2 || temp1 == value3) {
				newStack1.push(temp1);
			}else {
				if(temp1 == ovalue1 || temp1 == ovalue2 || temp1 == ovalue3) {
					newStack2.push(temp1);
				}
				if(((GoezList<Character>) newStack1).getLength()!=0) {
					if(temp1 == ovalue1) {
						temp2 = (char) newStack1.pop().getType();
						newStack2.pop();
						if(temp2!=value1) {
							rst = false;
						}
					}else if(temp1 == ovalue2) {
						temp2 = (char) newStack1.pop().getType();
						newStack2.pop();
						if(temp2 != value2) {
							rst = false;
						}
					}else if(temp1 == ovalue3) {
						temp2 = (char) newStack1.pop().getType();
						newStack2.pop();
						if(temp2 != value3) {
							rst = false;
						}
					}
				}else {
					if(((GoezList<Character>) newStack2).getLength()!=0) {
						rst = false;
					}
				}
			}
		}
		
		if(((GoezList<Character>) newStack1).getLength()!=0) {
			isBalance = false;
		}else {
			isBalance = rst;
		}
		
		return isBalance;
	}
}
