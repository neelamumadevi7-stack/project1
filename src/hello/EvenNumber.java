package hello;

import java.util.Scanner;

public class EvenNumber {
	boolean CheckEven(int a) {
		return a % 2 == 0;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int nextInt = scanner.nextInt();
		EvenNumber ev = new EvenNumber();
		boolean checkEven = ev.CheckEven(nextInt);
		if (checkEven) {
			System.out.println("given number is even number");
		} else {
			System.out.println("given is number is not even number");
		}
		scanner.close();
	}
}
