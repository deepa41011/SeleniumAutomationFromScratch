package javabasic;

public class SuperKeywordMethodChild extends SuperKeywordMethodParent {

	public void SuperKeywordMethodChild1() {
		
		super.SuperKeywordMethodParent3(4, 4);
		System.out.println("This is default child method");
	}

	public void SuperKeywordMethodChild2(char p) {

		this.SuperKeywordMethodChild3(45, 46);
		System.out.println("This is one parametreized child method");
	}

	public void SuperKeywordMethodChild3(int a, int b) {

this.SuperKeywordMethodChild5(4, 'l', "rain", 7);
		System.out.println("This is two parametreized child method");
	}

	public void SuperKeywordMethodChild4(float a, float b, float c) {

		this.SuperKeywordMethodChild2('o');
		System.out.println("This is three parametreized child method");
	}

	public void SuperKeywordMethodChild5(int a, char b, String c, int y) {

this.SuperKeywordMethodChild1();
		System.out.println("This is four parametreized child method");
	}


	public static void main(String[] args) {

		SuperKeywordMethodChild parent = new SuperKeywordMethodChild();
		parent.SuperKeywordMethodChild4(45, 46 , 52);

	}

}

