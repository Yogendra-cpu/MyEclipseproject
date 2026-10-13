package difffields;


public class Employees {
	                                                       //access specifier = public(anyone can access  and private(no can access with[ut permission).
	public static void main(String args[]) {                //identifier = to identify which type of data store in variable
		
		byte exp = 3;
		short age = 28;
		int  empID = 0721;            //variable is a nothing but the memory address and name it to perform opertions eficeintly because 
		long uid = 325247776881l;     //memory address will be difficult to do operationg it is in  different format.
		                              //variable is a container where we store can storr/hold data values
		float height = 5.2f;
		double salary = 50000.00;
		
		char gender = 'M';
		boolean status = true;
		
		String name = "yogendra ninghot";
		String pancard = "CDDPN4360G";
		
		System.out.println("Employee name is "+name);
		System.out.println("Employee age is "+age);
		System.out.println("Employee employee id is "+empID);
		System.out.println("Employee aadhar card number is "+uid);
		System.out.println("Employee height  is "+height);
		System.out.println("Employee salary is "+salary);
		System.out.println("Employee gender is "+gender);
		System.out.println("Employee status is "+status);
		System.out.println("Employee pan number is "+pancard);
		System.out.println(" employee age is  "+exp);
		
		
		// wrapper class
		System.out.println(Byte.BYTES);
		System.out.println(Integer.BYTES);
		System.out.println(Short.BYTES);
		System.out.println(Long.BYTES);
		System.out.println(Float.BYTES);
		System.out.println(Double.BYTES);
        System.out.println(Character.BYTES);
        System.out.println("boolean is predefiend");
        System.out.println("String dosent have specific limitation of size");
		
		System.out.println(Byte.SIZE);
		System.out.println(Integer.SIZE);
		System.out.println(Short.SIZE);
		System.out.println(Long.SIZE);
		System.out.println(Float.SIZE);
		System.out.println(Double.SIZE);
		System.out.println(Character.SIZE);
		
		
		
		System.out.println("byte range is from "+Byte.MIN_VALUE +" to "+ Byte.MAX_VALUE);
		System.out.println("byte range is from "+Short.MIN_VALUE +" to "+ Short.MAX_VALUE);
        System.out.println("byte range is from "+Integer.MIN_VALUE +" to "+ Integer.MAX_VALUE);
        System.out.println("byte range is from "+Long.MIN_VALUE +" to "+ Long.MAX_VALUE);
        System.out.println("byte range is from " +Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("byte range is from "+Double.MIN_VALUE +" to "+ Double.MAX_VALUE);
		System.out.println("byte range is from "+(int)Character.MIN_VALUE +" to "+(int)Character.MAX_VALUE);

		// we use int  for printing the character because otherwise it will show blank space but we want numerical how much store so we put int there 
        //beause character havign askey value which are numbers to identify and perform String operation using thses numbers itm called "typecasting"
		//wrapper used for convert non-primitive data type into primitive and primitive to non-primitive
	}
	

}














