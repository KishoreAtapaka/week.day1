package week1.day1.assignments;

public class Car {
	
	public void applyBreak()
	{
		System.out.println("Applying breaks");
	}
	
	public void applyGear()
	{
		System.out.println("Applying gear");
	}
	
	public void switchOnAircon()
	{
		System.out.println("Switching Aircon");
	}
	public void accelrate()
	{
		System.out.println("Applying accelerator");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car carObj=new Car();
		carObj.applyBreak();
		carObj.applyGear();
		carObj.switchOnAircon();
		carObj.accelrate();
		

	}

}
