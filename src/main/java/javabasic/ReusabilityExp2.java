package javabasic;

public class ReusabilityExp2 {

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
			System.out.println("Results of this expression is :"+ z);
			
			return z;
			
		}
		public int div(int u, int v)
		{
			int w= u/v;
			System.out.println("result of div is : " + w);
			return w;
		}
		public static void main(String[] args) {
			//(((((10/2)+2)+2)-2)*2)
			
			ReusabilityExp2 calc = new ReusabilityExp2();
			int div_result = calc.div(10, 2);
			int sum_result1 = calc.sum(div_result, 2);
			int sum_result2 = calc.sum(sum_result1, 2);
			int sub_result = calc.sub(sum_result2, 2);
			calc.mul(sub_result, 2);
			
			
			
			;
		

	}

}
