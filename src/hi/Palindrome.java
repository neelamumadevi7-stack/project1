package hi;

import java.util.Scanner;

public class Palindrome {
	static int reverseNum(int num) {
		int sum = 0;
		while (num > 0) {
			int r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		return sum;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int revNum = reverseNum(num);

		if (num == revNum) {
			System.out.println("it is palindrome");
		} else {
			System.out.println("it is not a palindrome  number");
		}

		sc.close();
	}
}
