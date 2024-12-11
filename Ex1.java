package interview;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số n: ");
		int n = sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}

		System.out.println("Tổng các số từ 1 đến " + n + " là: " + sum);
	}
}