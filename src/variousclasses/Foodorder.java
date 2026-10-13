package variousclasses;



public class Foodorder {

	public static void main(String args[]) {
		
		String customer_name = "ajanta";
		int order_Id = 225;
		int customer_Id = 325655;
		byte preptime_Minutes = 20;
		float ordering_time = 19.45f;
		long delivery_exeId = 21548733l;
		float price = 299.00f;
		double gst = 18.00;
		double final_bill = 351;
		float delivery_dist = 4.2f;
		long customercontact_number = 3578941356l;
		short store_Id = 164;
		char order_type = 'D' ; //D= dine,T takeway
		char size = 'M';   // M=medium,S=small,L=large
		boolean online_payment = true;
		
		
		System.out.println("customer name "+customer_name);
		System.out.println("order Id "+order_Id);
		System.out.println("customer Id "+customer_Id);
		System.out.println("duration of order prepartaion "+preptime_Minutes+" minutes");
		System.out.println("ordering timr "+ordering_time);
		System.out.println("delivery execeutive Id "+delivery_exeId);
		System.out.println("order price "+price);
		System.out.println("GST "+gst+"%");
		System.out.println("Total "+final_bill+" rupees");
		System.out.println("delivery distance "+delivery_dist+" km" );
		System.out.println("customer contact number "+customercontact_number);
		System.out.println("Store Id "+store_Id);
		System.out.println("order type "+order_type);
		System.out.println("size "+size);
		System.out.println("online payment "+online_payment);
		
		
		
		
	}
}

