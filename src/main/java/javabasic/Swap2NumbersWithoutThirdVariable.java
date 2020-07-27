package javabasic;

public class Swap2NumbersWithoutThirdVariable {



	static int a= 10;
	static int b= 20;


	public static void main(String[] args) {

		System.out.println("--------- Before Swapping -----");		
		System.out.println("value of a before swapping is : " + a);
		System.out.println("value of b before swapping is : " + b);

		a= a+b;
		b= a-b;
		a= a-b;

		System.out.println("--------- After Swapping -----");	
		System.out.println("value of a after swapping is : " + a);
		System.out.println("value of b after swapping is : " + b);
	}



}


