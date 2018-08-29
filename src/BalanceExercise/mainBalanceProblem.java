package BalanceExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mainBalanceProblem {

	public static void main(String[] arg) throws NumberFormatException, IOException {
		StringProblems problem = new StringProblems();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		long index = Long.parseLong(bf.readLine());
		
		String line = bf.readLine();
		for (int i = 0;  i< arg.length; i++) {
			if(problem.isBalance(line)) {
				System.out.print("T");
			}else {
				System.out.print("F");
			}
			line = bf.readLine();
		}
	}
}
