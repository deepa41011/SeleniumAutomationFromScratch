package javabasic;

public class SuperKeywordChild extends SuperKeywordParent{

	public SuperKeywordChild() {

		super(24,25);
		System.out.println("This is default child construcor");
	}
	public SuperKeywordChild(int a) {

		this('g',25);
		System.out.println("This is one parametreized child constructor");
	}

	public SuperKeywordChild(char t , int b) {

		this(15,25,'k',36);
		System.out.println("This is two parametreized child constructor");
	}

	public SuperKeywordChild(String str, int f, int g) {

		this(24);
		System.out.println("This is three parametreized child constructor");
	}
	public SuperKeywordChild(int a, int b , char l, float i) {
		this();
		System.out.println("This is four parametreized child constructor");
	}

	public static void main(String[] args) {
		SuperKeywordChild child = new SuperKeywordChild("str", 25, 54);




	}

}
