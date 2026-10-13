package usinginstancevar;



public class Bankaccount {
	
	static double balance;
	static boolean kyc;
	static double active_loan;
	static String pan_Card="CDDPN4360G";
	static long linkedmob_no;
	
	
	
	
	public static void main(String args[]) {
		
		String holder_Name = "yogendra ninghot";
		String branch_Name = "Amravati";
		long account_No = 20363747012l;
		long uid = 325247776881l;
		char type0f_Account = 'S';
		String address = "Amravati";
		String ifsc_code = "SBIN001210";
		int pincode = 444607;
		int branch_code = 012712;
		int cust_Id = 26474644;
		
		
		System.out.println("balance: " +balance);   
        System.out.println("kyc: " + kyc);       
        System.out.println("active loan: " + active_loan);
        System.out.println("pan card number: " +pan_Card);
        System.out.println("mobile number : " +linkedmob_no);
        System.out.println("bank holder name: " +holder_Name);
        System.out.println("branch  name: " +branch_Name);
        System.out.println("Account number: " +account_No );
        System.out.println("Aadhar card number: " + uid);
        System.out.println("type of account: " +type0f_Account);
        System.out.println("address: " + address);
        System.out.println("ifsc code: " + ifsc_code);
        System.out.println("pincode : " + pincode);
        System.out.println("branch code: " + branch_code);
        System.out.println("customer id: " + cust_Id);
       
		
		
		
	}

}
