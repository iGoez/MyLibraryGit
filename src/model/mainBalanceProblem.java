package model;

import java.util.Scanner;

public class mainBalanceProblem {

	public static void main(String[] arg) {
		StringProblems problem = new StringProblems();
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String input = sc.next();
			
			if(problem.isBalance(input)) {
				System.out.print("T");
			}else {
				System.out.print("F");
			}
		}
	}
}
