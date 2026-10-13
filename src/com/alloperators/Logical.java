package com.alloperators;

public class Logical{

	     
		public static void main(String args[]) {                                              //and (&&),or(||),(!)not
	    	 
	    	boolean check = 2<3;
	    	boolean a = 6<=5;
	    	
	    	System.out.println('a' == 'b'|| 3 < 4 && "ajay" == "Ajay" || check != a && a);
	    	System.out.println('q' == 'g' || 3<=9 && check!= a || check == a && 45>62 || 58<=69 && true!=false);
	    	System.out.println(check == a && 11 == 12 || 12>85 || 12>=25 && "window"=="Window");
	    	System.out.println(check == false &&  65>56 || 56<54 && 65<=45 || 6>=5 && "abc" != "ABC" );
	    	System.out.println(65>=45 || 54<=25 && 52>56 || 25<52 && check == a || 'a'!='f' || true && 8>8 || false != false);
	    	System.out.println(check == true && a != true || true == false && 25>89 || 54<65 || 56>=59 && 25<=69 || "DEll"=="Dell");
	        System.out.println(25>64 || 54<56 && true == false && 52!=98 || false !=false || 25>=25 && 85<=98 || check == a);
	        System.out.println(check == a || 55>=85 || 28<=96 && false == true || "age" != "age" || 'F' != 'F' || check == false );
	        System.out.println(59<16 || 65>98 && check == a || 98>=25 || 85<=85 && check != false && "yes" == "no" || 'b' == 'b');
	        System.out.println("yes" == "yes"&& check == true || false != true || 97>25 && 21<85 || 96 >=85 || 45<=85 && 'A'=='A');
	        System.out.println(9==10 && 9!=10 || check ==false && false !=true || 34>56&& 34<56 || 90>=12 && 34<5 || "see" == "seen"&& "happy" != "sad");
		    System.out.println(56>=52 || 45 <=62 && "check" != "unchecked" || 't' == 't'  && 84>37 || 90<12 && check == true && a == true);
		    System.out.println(10 == 2 && 20 == 1|| 10!=20 && !(10==20)|| !(10 > 5 && 20 < 0));
		    System.out.println(15 >= 3 || 25 <= 5 && "check" != "unchecked"|| 't' == 't' && 84 > 37|| 90 < 12 && true == true && false == true|| !(15 == 0 && 25 == 0) && (true || !(false)));
	        System.out.println(10 >= 2 || 20 <= 3 && "hello" != "world"|| 'A' == 'A' && 100 > 50|| 10 < 5 && true == true && false == false || !(10== 0 && 20 == 0) && (true || !(false))|| 10 == 3 && 20 == 1 && !(10 > 10 || 20 < 0));
		    
		}                                                                                                           
		
	
}
 