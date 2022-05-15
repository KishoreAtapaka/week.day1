package week1.day2;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int originalInput=153;
		int input=153;
		int sum=0;
		int rem=0;
		while(input>0)
		{
		rem=input%10;
		input=input/10;
		rem=rem*rem*rem;
		
		
		
		sum=sum+rem;
		}
		
		if(sum==originalInput)
			System.out.println("It is Amstrong number");
		else
			System.out.println("Not an Amstrong number");
	}

}
