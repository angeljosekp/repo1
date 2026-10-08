package pack1;

import java.io.IOException;

public class ExcelMain { 
		  
	 	public static void main(String[] args) throws IOException { 
	 		 
	 		String s=Excelreader.readStringData(1, 0); 
	 		System.out.println(s); 
	 		String s1=Excelreader.readIntegerData(1, 1); 
	 		System.out.println(s1); 
	 		 
	  
	 	} 
	  
	 }
	


