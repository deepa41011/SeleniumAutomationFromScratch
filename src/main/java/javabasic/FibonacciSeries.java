package javabasic;

import java.util.Scanner;

public class FibonacciSeries {

	static int r;
	static int n1 = 0;
	static int n2 = 1;
	static int n3;
	static int count;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the last digit till which you want to run fibonacci series");
		count = scan.nextInt();

		System.out.println(n1);
		System.out.println(n2);

		for(r=2;r<=count;r++) {			
			n3=n1+n2;			
			System.out.println(n3);
			n1=n2;
			n2=n3;

		}


	}


}


