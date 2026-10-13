package com.conditionstatements;


public class Demo{

	
	public static void main(String[] args) {
	//Q1	
		int a=23;
		if(a>18) {
			System.out.println("Adult");
		} else {
			System.out.println("not Adult");
		}
	
//Q2	
		
		int marks = 50;
		if(marks >=90 && marks<=100) {
			System.out.println("Grade A");
		 }else if(marks>=75 && marks<=89){
		     System.out.println("Grade B");
		 }else if(marks>=50 && marks<=74){
			  System.out.println("Grade C");
		 }else if(marks>=35 && marks>=49) {
			   System.out.println("Grade D");
		 }else { 
		      System.out.println("Fail");
		}
	
	
		// 4
		int c=23;
		if(c>30){
			System.out.println("hot day");
		}else{
			System.out.println("normal day");
		}		
	
		//
		int  d = 26;
		
		
		if(d>=0) {
			System.out.println("number is positive ");
		}else {
			System.out.println("number negative");
		}
 
	
	//
		int temp = 45;
		if(temp>30){
			System.out.println("hot day");
		}else{
				System.out.println("normal day");
			}
			
		
		//
		
	int e=5;
	if(e%10==0) {
		System.out.println("number is divisible by 10");
	}else {
		System.out.println("not divisible");
	}
	
	
	//
	int g=2;
	if(g%2==0) {
		System.out.println("even");
	}else {
	     System.out.println("odd");
	}
	
	
	//
	 int day =7;
	 if(day == 1) {
		 System.out.println("sunday");
	 }else if(day == 2){
		 System.out.println("monday");
	 } else if(day == 3){
	    System.out.println("tuesday");
	 }else if(day == 4){
		 System.out.println("wednesday");
	 } else if(day == 5) {
		 System.out.println("thursday");
	 }else if(day == 6) {
		 System.out.println("friday");
	 }else if(day == 7) {
		 System.out.println("saturday");
	 }else {
		 System.out.println("Invalid option");
	 }
	
	 
	 
	//
	 int age = 89;
	 if(age>=0 && age<=12) {
		 System.out.println("child");
	 }else if(age>=13 && age<=19) {
	     System.out.println("teenager");
	 }else if(age>=20 && age <=59) {
	        System.out.println("Adult");
	}else if(age>=60 && age<=100) {
	        System.out.println("Senior citizen");
	}else {
		System.out.println("Invalid number");
	}
	
	//
	 int temperature = 14;
	 if(temperature >=60 && temperature<=60) {
		 System.out.println("weather is hot");
	 }else if(temperature <=59 && temperature>=30){
	     System.out.println("temperature is warm");
	 }else if(temperature<=29 && temperature>=15) {
	       System.out.println("temperature is cool");
	 }else if(temperature<=15 && temperature>=-45) {
	     System.out.println("temperature is cold");
	}else {
	      System.out.println("declare valid temperature");
	}
	
	 
	 
	 //
	  int number = -24;
	  if(number >=1) {
		  System.out.println("positive number");
	  }else if(number == 0) {
	       System.out.println("number is zero");
	  }else if(number <=-1 && number<0) {
		  System.out.println("negative number");
	  }else {
		  System.out.println("invalid input");
	  }

	//
	  
	
	
	
	
	}
}