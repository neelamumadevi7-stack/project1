package hi;

import java.util.Scanner;

public class PrimeNumber {
	static boolean checkPrime(int num) {
		for(int i=2;i<=num/2;i++){
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
    public static void main(String args[]) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the number");
    	int nextInt = sc.nextInt();
    	boolean checkPrime = checkPrime(nextInt);
    	if(checkPrime) {
    		System.out.println("it is prime number");
    	}else {
    		System.out.println("it is not a prime number");
    	}
    	sc.close();
    }
}
