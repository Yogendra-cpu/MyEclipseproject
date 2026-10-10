package com.global_var_declaration;

public class Book {	
	
	static String libraryName = "Central Library";
	
	public static void main(String args[]) {
		
		
		int bookId = 101;
        byte edition = 3;
        short pages = 450;
        long isbn = 9781234567890L;
        float price = 499.50f;
        double discount = 12.75;
        char category = 'A';
        boolean available = true;
        String bookName = "Java Programming";
        String author = "Yogendra";
        Integer stockCount = 25;
        Double gst = 18.5;
        Boolean isFragile = false;
        Long barcode = 123456789012L;
        Float weight = 1.5f;
        
        
        System.out.println("Library: " + libraryName);   
        System.out.println("Book ID: " + bookId);       
        System.out.println("Edition: " + edition);
        System.out.println("Pages: " + pages);
        System.out.println("ISBN: " + isbn);
        System.out.println("Price: " + price);
        System.out.println("Discount: " + discount);
        System.out.println("Category: " + category);
        System.out.println("Available: " + available);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Stock: " + stockCount);
        System.out.println("GST: " + gst);
        System.out.println("Fragile: " + isFragile);
        System.out.println("Barcode: " + barcode);
        System.out.println("Weight: " + weight);


		
	}

}
