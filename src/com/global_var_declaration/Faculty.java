package com.global_var_declaration;

public class Faculty {
	
	static String college_Name = "university";  // global(Instance) variable we write under class not in main method 
	
	public static void main(String args[]) { // beloww all are local variable declare and written in main method
		
	String faculty_Name = "hfissl cvnidf";
	int  fac_Id  = 2578459;
	char gender  = 'M';
	String department = "CSE";
	double salary = 59000.00;
	int age = 29;
	String subjects = ("dbms,sql,spg");
	long contact_Number = 74543269795l;
	float height = 5.2f;
	int joining_Year = 2025;
	int exp = 6;
	String education = "masters in computer science";
	boolean active = true;
	int alotted_Lectures = 2;
	char class_Incharge_section = 'A';
	
	System.out.println("College name "+college_Name);
	System.out.println("Faulty name "+faculty_Name);
	System.out.println("Faculty Id "+fac_Id);
	System.out.println("Gender "+gender);
	System.out.println("Department "+department);
	System.out.println("Salary "+salary);
	System.out.println("Age "+age);
	System.out.println("Teahching Subjects "+subjects);
	System.out.println("Contact Number "+contact_Number);
	System.out.println("Height "+height);
	System.out.println("Joining Year "+joining_Year);
	System.out.println("Previous Experience "+exp);
	System.out.println("Education "+education);
	System.out.println("Joined "+active);
	System.out.println("Daily Number of Lectures "+alotted_Lectures);
	System.out.println("Incharging Class "+class_Incharge_section);
}
}