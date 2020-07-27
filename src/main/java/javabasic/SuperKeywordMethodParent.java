package javabasic;

public class SuperKeywordMethodParent {
	
		public void SuperKeywordMethodParent1() {
		
		this.SuperKeywordMethodParent4(4, 4, 4);
		System.out.println("This is default parent method");
	}

	public void SuperKeywordMethodParent2(char p) {
		
		this.SuperKeywordMethodParent1();
		System.out.println("This is one parametreized parent method");
	}

	public void SuperKeywordMethodParent3(int a, int b) {

		this.SuperKeywordMethodParent5(4, 'f', "str", 78);
		System.out.println("This is two parametreized parent method");
	}

	public void SuperKeywordMethodParent4(float a, float b, float c) {

		System.out.println("This is three parametreized parent method");
	}

	public void SuperKeywordMethodParent5(int a, char b, String c, int y) {
	
		this.SuperKeywordMethodParent2('f');
		System.out.println("This is four parametreized parent method");
	}


	public static void main(String[] args) {

		SuperKeywordMethodParent parent = new SuperKeywordMethodParent();
		parent.SuperKeywordMethodParent3(45, 46);

	}

}