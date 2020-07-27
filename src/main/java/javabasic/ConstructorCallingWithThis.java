package javabasic;

public class ConstructorCallingWithThis {

	public ConstructorCallingWithThis(String a) {
		this(23,24);
		System.out.println("This is one parametreized constructor");
	}

	public ConstructorCallingWithThis(int a, int b) {
		this(30, 'b', "cat", 25);
		System.out.println("This is two parametreized constructor");
	}

	public ConstructorCallingWithThis(float a, float b, float c) {
		this("test");
		System.out.println("This is three parametreized constructor");
	}

	public ConstructorCallingWithThis(int a, char b, String c, int y) {
		System.out.println("This is four parametreized constructor");
	}
	public static void main(String[] args) {
		ConstructorCallingWithThis const1 = new ConstructorCallingWithThis(10,11,12);

	}

}
