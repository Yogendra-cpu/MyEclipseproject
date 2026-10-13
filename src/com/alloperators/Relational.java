package com.alloperators;

public class Relational {

	
	public static void main(String args[]){
        
        int a = 25;
        int b = 58;
        int c = 25;
   System.out.println("equals equals operation "+ "of "+"25"+" == "+ "58 "+"is " +(a==b));
   System.out.println("equals equals operation "+"of "+"25"+" == "+"25 "+"is "+(a==c));    //equals equals operator using operands(values)
   System.out.println("equals equals operation "+"of "+"58"+" == "+"25 "+"is "+(b==c));
   
   System.out.println("not equals operation "+"of "+"25"+" != "+ "58 "+"is +" +(a!=b));
   System.out.println("not equals equals operation "+"of "+"25"+" != "+ "25 "+"is "+(a!=c)); 
   System.out.println("not equals equals operation  "+"of "+"58"+" != "+ "25 "+"is " +(b!=c));                    //not equals to operator
   
   System.out.println("greater than operation "+"of "+"25"+" > "+ "58 "+"is "+(+a>b));
   System.out.println("greater than operation "+"of "+"25"+" > "+ "25 "+"is "+(a>c));    //using > greater than operator
   System.out.println("greater than operation "+"of "+"58"+" > "+ "25 "+"is "+(b>c));
   
   System.out.println("less than operation "+"of "+"25"+" > "+ "58 "+"is "+(+a<b));
   System.out.println("less  than operation "+"of "+"25"+" > "+ "25 "+"is "+(a<c));    // using less than operator
   System.out.println("less than operation "+"of "+"25"+" > "+ "58 "+"is "+(b<c));
   
   System.out.println("greater than equals to operation "+"of "+"25"+" > "+ "58 "+"is "+ (a>=b));
   System.out.println("greater than equals to operation "+"25"+" > "+ "25 "+(a>=c)); // using greater  than equals to operator
   System.out.println("greater than operation "+"58"+" > "+ "25 "+(a>=c));
   
   System.out.println("less than equals to operation "+"of "+"25"+" > "+ "58 "+"is "+(a<=b));
   System.out.println("less than equals to operation "+"of "+"25"+" > "+ "25 "+"is "+(a<=c));  //using less than equals to operator
   System.out.println("less than equals to  operation "+"of "+"58"+" > "+ "25 "+"is "+(b<=c));
   
   
   
	}
	
}
