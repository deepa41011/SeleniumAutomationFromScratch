package javabasic;
import java.util.Scanner;
public class IsPrimeNumber {

	static int i;

	public void isPrimeNumber() {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = scan.nextInt();

		for(i=2; i<num/2 ; i++)
		{
			if (num % i == 0) 
			{
				System.out.println("This is not a prime number");
				break;
			}

			else 
			{
				System.out.println("This is a prime number");
				break;
			}
		}
	}

	public static void main(String[] args) {

		IsPrimeNumber prime = new IsPrimeNumber();
		prime.isPrimeNumber();
	}
}

