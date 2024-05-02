package com.controller;

import java.util.Scanner;

public class MainController {
	public static void Options() {
		 Scanner sc = new Scanner(System.in);
		 
		 try {
	        	
		        
	            while (true) {
	            	
	                System.out.println("Press 1. Applicant Menu");

	              

	                System.out.println("Press 2. Company Menu");

	                System.out.println("Press 3. JobListing Menu");
	                
		            System.out.println("Press 0. Logout");
	           
	           
		            
	                int input = sc.nextInt();
	                sc.nextLine();
	                
	                if(input == 0 ) break;
	                switch (input) {
	                
                    case 1:
                    	   System.out.println("Applicant Menu");
                    	   ApplicantController.ApplicantMenu(); 
                        break;
                   
                    case 2:
                    	 System.out.println(" Company Menu");
                    	 CompanyController.CompanyMenu();
                    	 break;
                    case 3:
                    	System.out.println("JobListing Menu");
                    	break;
                    	
	        } 
	    }
	          
	 
	
}finally {
	sc.close();
}
}
}
