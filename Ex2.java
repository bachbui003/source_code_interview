package interview;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n: ");
		int n = sc.nextInt();

		long factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}

		System.out.println("!n" + n + " là: " + factorial);

	}
}
