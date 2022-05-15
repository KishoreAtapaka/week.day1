package week1.day2;

public class Calculator {
	
	public int sum(int a, int b) {
		return a+b;
		
	}

	public double sub(double a, double b) 
	{
		return a-b;
	}
	
	public double mul(double a, double b)
	{
		return a*b;
	}
	
	public double div(int a, int b)
	{
		return a/b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calcObj=new Calculator();
		System.out.println(calcObj.sum(2, 5));
		System.out.println(calcObj.sub(2, 1));
		System.out.println(calcObj.mul(2, 5));
		System.out.println(calcObj.div(5, 2));
		

	}

}
