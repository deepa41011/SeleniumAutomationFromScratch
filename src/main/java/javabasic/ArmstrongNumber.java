package javabasic;

import java.util.Scanner;



public class ArmstrongNumber {

	static int num;
	static int size;
	static int i;
	static int a;
	static int temp;
	static int c=0;

	public static void main(String[] args) {
		//A number is Armstrong or not-----153----1+125+27

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to check if it armstrong number");
		num = scan.nextInt();
		temp=num;
		while(num>0) {
			a = num%10;  // 456- 6// 5
			num=num/10; //456/10=45`	1qqq
			c=c+(a*a*a);    // 216// 125//
		}	
		if(c==temp) {
			System.out.println("This is an armstrong number");

		}
		else {
			System.out.println("This is not an armstrong number ");
		}

	}


}
