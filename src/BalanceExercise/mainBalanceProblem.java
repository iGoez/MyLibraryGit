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
		for (long i = 0;  i< index; i++) {
			if(problem.isBalance(line)) {
				System.out.println("T");
			}else {
				System.out.println("F");
			}
			line = bf.readLine();
		}
	}
}
