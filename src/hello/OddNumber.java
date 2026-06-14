package hello;

import java.util.Scanner;

public class OddNumber {
	static boolean checkOdd(int num) {
		return num%2==0;
	}
    public static void main(String args[]) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the number");
    	int nextInt = sc.nextInt();
    	boolean checkOdd = checkOdd(nextInt);
    	if(!checkOdd) {
    		System.out.println("it is an odd number");
    	}else {
    		System.out.println("not an odd number");
    	}
    	
    	sc.close();
    }
}
