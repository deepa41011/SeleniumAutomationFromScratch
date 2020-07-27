package javabasic;

import java.util.Scanner;

public class TablePrint {
	
	static int i;
	static int num;
	static int table;

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number whose facorial you want to find");
		num = scan.nextInt();
		System.out.println("table of the number is as follows : "); 
		for(i=1;i<=10;i++) {
			
			table = num*i;
			System.out.println(num+"*"+i+"= : "  + table);
			
		}

	}

}
