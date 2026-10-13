package variousclasses;



public class Product {
 public static void main (String args[]) {
	 
	 byte warranty= 2;
	 short discount = 25;
	 int stock = 450;
	 long product_id = 265974666565l;
	 float rating = 4.9f;
	 double weight = 489.26;
	 char size = 'M';
	 boolean available = true;
	 boolean returnable = true;
	 int slot_year = 2026;
	 String name_of_product = "denim jacket";
	 long serial_No = 12376846574l;
	 float gross = 3500f;
	 float net = 2625f;
	 String tax = "18%";
	 
	 System.out.println("Product name "+name_of_product);
	 System.out.println("Size of product "+size);
	 System.out.println("Available "+available);
	 System.out.println("warranty "+warranty+" years");
     System.out.println("Rating "+rating);
	 System.out.println("Return "+returnable);
	 System.out.println("Slot year "+slot_year);
	 System.out.println("Price "+gross+" rupees");
	 System.out.println("Tax "+tax);
	 System.out.println("Discount "+discount+"%");
	 System.out.println("Net price "+net+" rupees");
	 System.out.println("Stock "+stock+" units");
	 System.out.println("Serial number "+serial_No);
	 System.out.println("Product ID "+product_id);
	 System.out.println("Weight "+weight+" grams");
	 	 
	 
	 // discont/warranty,price ,product id,slot year,available,size,name of rpoduct,weight,serail number ,weight,rating,with tax,gross and net 
 }
}

