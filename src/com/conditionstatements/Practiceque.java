package com.conditionstatements;

public class Practiceque {
	
	//Q1
	public static void main(String[] args) {
		
	 int  a = 26;
	
	
	if(a>=0) {
		System.out.println("number is positive ");
	}else
		System.out.println("number negative");
	

	//Q2
//b = 10;
	
   //if(==0) {
	//	System.out.println("number is divisible by 5");
		
	//}else 
		//System.out.println("number is not divisible by 5");
 	//
 	//Q3
 	int c = 101;
 	  if(c==100) {
 	    System.out.println(c+"is equals to haundred");
 		 }else if(c>100){
 		   System.out.println(c+" is greater than hundred");
 	   }else 
 	     System.out.println(c+"is not greater than hundred");
	
//Q4 chracter in uppercase   n

            char d = 'b';
            if(Character.isUpperCase(d)) {
            	System.out.println("character in uppercase");
            } else {
            	System.out.println("character in lower case");
            }
       //Q5
             int e = 100;	
             
            if(e>=18 && e<=100) {
            	 System.out.println("yor are eligilble for voting");
             }else {
            	  System.out.println("not eligible for voting");
             }

	//Q6even odd
        //   int f = 10;
         // if( ) {
            	//System.out.println("number is even");
          //}else
            //	System.out.println("number is odd");
            
	 //Q7
            int f = 34;
            int g = 40;
            if(g>f && f<g) {
            	System.out.println("greater number is "+g);
            }else 
             System.out.println("greater numbe is "+f);
            
      //Q11
              int h = 100;
              int i = 300;
              int j = 150;
              
              if(i>h && j<h ) {
            	  System.out.println("largest number is "+h);
              }   else if(j>i && j>h) {
            	  System.out.println("largest number is "+j);
              }else 
            	   System.out.println("largest number is "+i);
              
              
              
	
	
              
	
	}
	


}