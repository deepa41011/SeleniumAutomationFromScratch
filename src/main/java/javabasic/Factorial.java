package javabasic;

import java.util.Scanner;

public class Factorial {

	static int num;
	static int i;
	static int factorial=1;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number whose facorial you want to find");
		num = scan.nextInt();

		//	4 = 4*3*2*1 USING A DECEREMENT LOOP

		for(i=num;i>=1;i--) {
			factorial = factorial*i;

		}
		// 4 = 4*3*2*1 USING A INCREMENT LOOP
/*		for(i=1;i<=num;i++) { factorial = factorial*i; // 10

		}
*/
		System.out.println(factorial);

	}

}
