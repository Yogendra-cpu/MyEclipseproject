package usinginstancevar;


public class Vehicle {
	
	static boolean available = true ;
	static int accident_history;
	static boolean service_History =true;
	static boolean original_RC;
	static float discount = 25;
	
	public static void main(String args[]) {
		
		String vehicle_Name = "altis";
		int manufacturing_Year = 2014;
		int  vehicle_Warranty = 2;
		long km_Driven = 120000l;
		boolean airbags = true;
		double cc = 1799.5;
		float vehicle_Length = 15.12f;
		int boot_Space = 159;
		int total_seater = 4;
		String typeof_Vehicle = "Sedan";
		
		
		System.out.println("vehicle name "+vehicle_Name);
		System.out.println("manufacturing_Year "+manufacturing_Year );
		System.out.println("vehicle_Warranty "+vehicle_Warranty);
		System.out.println("km_Driven "+km_Driven);
		System.out.println("airbags "+airbags);
		System.out.println("cc "+cc);
		System.out.println("vehicle_Length "+vehicle_Length);
		System.out.println("boot_Space "+boot_Space);
		System.out.println("total_seater "+total_seater);
		System.out.println("typeof_Vehicle "+typeof_Vehicle);
		System.out.println("available "+available);
		System.out.println("accident_history "+accident_history);
		System.out.println("service_History "+service_History);
		System.out.println("original_RC "+original_RC);
		System.out.println("discount "+discount);
	}
	

}

