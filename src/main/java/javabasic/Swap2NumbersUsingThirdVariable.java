package javabasic;

public class Swap2NumbersUsingThirdVariable {
	
	static int a= 50;
	static int b= 60;
	static int c;

	public static void main(String[] args) {
		
		System.out.println("--------- Before Swapping -----");		
		System.out.println("value of a before swapping is : " + a);
		System.out.println("value of b before swapping is : " + b);
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("--------- After Swapping -----");	
		System.out.println("value of a after swapping is : " + a);
		System.out.println("value of b after swapping is : " + b);
		
	}

}
