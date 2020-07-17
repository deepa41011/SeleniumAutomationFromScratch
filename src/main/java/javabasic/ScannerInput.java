package javabasic;

import java.util.Scanner;

public class ScannerInput {

		//(((((a*b)+c)+d)-e)/f)
		
	public int sum(int var1, int var2)
	{
		int var3= var1+var2;
		System.out.println("Result of sum is : "+ var3);
		return var3;
	}
	public int sub(int var4, int var5)
	{
		int var6= var4-var5;
		System.out.println("Result of sub is : "+ var6);
		return var6;
	}
	public int mul(int var7, int var8)
	{
		int var9= var7*var8;
		System.out.println("Result of mul is : "+ var9);
		return var9;
		
	}
	public void div(int var10, int var11)
	{
		int var12= var10/var11;
		System.out.println("Result of this expression is : " + var12);
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter value of a");
		int a = scan.nextInt();
		
		System.out.println("Please enter value of b");
		int b = scan.nextInt();
		
		System.out.println("Please enter value of c");
		int c = scan.nextInt();
		
		System.out.println("Please enter value of d");
		int d = scan.nextInt();
		
		System.out.println("Please enter value of e");
		int e = scan.nextInt();
		
		System.out.println("Please enter value of f");
		int f = scan.nextInt();
		
			
		
		ScannerInput calc = new ScannerInput();
		
		//(((((a*b)+c)+d)-e)/f)
		
		
		int mul_result = calc.mul(a, b);
		int sum_result1 = calc.sum(mul_result, c);
		int sum_result2 = calc.sum(sum_result1, d);
		int sub_result = calc.mul(sum_result2, e);
		calc.div(sub_result, f);
		;
	}

}
