package javabasic;
import java.util.Scanner;
public class IsPalindrome {

	static int temp;
	static int r;
	static int sum =0;
	static int num;

	public void isPalindrome() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to check if it palindrome");
		num = scan.nextInt();

		temp=num;

		//System.out.println("number stored in temp befroe reversing is : " + temp);

		while(num>0) {
			r=num%10; // 343 % 10 = 3 // 34% 10 = 4 // 3%10=3
			sum = (sum*10)+r; // 0+3 = 3 // 30+4 = 34 // 340+3=343
			num=num/10;		//34 - which is greater than 0 so will execute while loop again // 3 - execute again
		} 

		if(temp==sum)    
			System.out.println("palindrome number");    
		else    
			System.out.println("not palindrome");    
	}  

	public static void main(String[] args) {
		IsPalindrome palindrome = new IsPalindrome();
		palindrome.isPalindrome();

	}

}
