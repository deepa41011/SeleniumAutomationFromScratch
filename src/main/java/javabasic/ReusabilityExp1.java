package javabasic;
public class ReusabilityExp1 {
	
	//(((((10+2)-2)+2)*2)/2)

	public int sum(int a, int b)
	{
		int c= a+b;
		System.out.println("Result of sum is : "+ c);
		return c;
	}
	public int sub(int m, int n)
	{
		int o= m-n;
		System.out.println("Result of sub is : "+ o);
		return o;
	}
	public int mul(int x, int y)
	{
		int z= x*y;
		System.out.println("Result of mul is : "+ z);
		return z;
		
	}
	public void div(int u, int v)
	{
		int w= u/v;
		System.out.println("result of this expression is : " + w);
	}
	public static void main(String[] args) {
		ReusabilityExp1 calc = new ReusabilityExp1();
		int sum_result = calc.sum(10, 2);
		int sub_result = calc.sub(sum_result, 2);
		int sum_result2 = calc.sum(sub_result, 2);
		int mul_result = calc.mul(sum_result2, 2);
		calc.div(mul_result, 2);
		;
	}
}
