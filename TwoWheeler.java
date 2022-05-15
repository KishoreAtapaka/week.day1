package week1.day1.assignments;

public class TwoWheeler {
	int noOfWheels =2;
	short noOfMirrors =2;
	long chassisNumber = 781723323;
	boolean isPunctured=false;
	String bikeName = "BMW";
	double runningKM = 211000.5002;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwoWheeler twoWheelerObj=new TwoWheeler();
		System.out.println("NUmber of wheels: "+twoWheelerObj.noOfWheels);
		System.out.println("NUmber of mirrors: "+twoWheelerObj.noOfMirrors);
		System.out.println("Chasis number: "+twoWheelerObj.chassisNumber);
		System.out.println("Is Punctured: "+twoWheelerObj.isPunctured);
		System.out.println("Bike name: "+twoWheelerObj.bikeName);
		System.out.println("running kms: "+twoWheelerObj.runningKM);

	}

}
