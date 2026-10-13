package usinginstancevar;



public class Patient {
	
	static int patient_Id=101;
	static String patient_name = "yogesh";
	static float weight;
	static int age;
	static String disease;
	
	public static void main(String args[]) {
		double medical_Cost  = 2500.00;
		int room_Number = 1542;
		int bed_Number = 9;
		String department = "orthopedics";
		long uid = 325247776881l;
		long mob_No = 9221902455l;
		boolean admitted = true;
		char gender = 'M';
		float height = 5.2f;
		String attending_Doctor = "odfjiofkwpof";
		
		System.out.println("patient id: " +patient_Id);   
        System.out.println("patient name: " + patient_name);       
        System.out.println("weight: " +weight );
        System.out.println("age: " +age);
        System.out.println("disease: " +disease);
        System.out.println("medical bill: " +medical_Cost);
        System.out.println("room  number : " +room_Number);
        System.out.println("bed number  : " +bed_Number);
        System.out.println("department: " +department);
        System.out.println("aadhar card: " +uid);
        System.out.println("mobile number: " + mob_No);
        System.out.println("admitted: " + admitted);
        System.out.println("gender: " +gender);
        System.out.println("height :" +height);
        System.out.println("attending name: " +attending_Doctor);
       
		
		
		
		
		
		
		
	}
	

}

