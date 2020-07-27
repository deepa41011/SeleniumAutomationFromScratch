package javabasic;

public class MethodCallingWithThis {

	public void Method1(String a) {
		this.Method4(22, 'm', "Str", 45);
		System.out.println("This is one parametreized method");		
	}

	public  void Method2(int a, int b) {
		this.Method3(1, 2, 3);;
		System.out.println("This is two parametreized method");
	}

	public void Method3(float a, float b, float c) {
		this.Method1("Deepa");;
		System.out.println("This is three parametreized method");
	}

	public  void Method4(int a, char b, String c, int y) {
		System.out.println("This is four parametreized method");
	}
	public static void main(String[] args) {
		MethodCallingWithThis meth = new MethodCallingWithThis();
		meth.Method2(25, 26);

	}

}
