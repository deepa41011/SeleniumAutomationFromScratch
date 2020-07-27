package javabasic;

public class SuperKeywordParent {
	public SuperKeywordParent() {
		this(23,24,36);
		System.out.println("This is default parent construcor");
	}

	public SuperKeywordParent(char p) {
		this();
		System.out.println("This is one parametreized parent constructor");
	}

	public SuperKeywordParent(int a, int b) {

		this(2, 'b', "pass", 8);
		System.out.println("This is two parametreized parent constructor");
	}

	public SuperKeywordParent(float a, float b, float c) {

		System.out.println("This is three parametreized parent constructor");
	}

	public SuperKeywordParent(int a, char b, String c, int y) {
		this('o');
		System.out.println("This is four parametreized parent constructor");
	}


	public static void main(String[] args) {

		SuperKeywordParent parent = new SuperKeywordParent(24,25);

	}

}