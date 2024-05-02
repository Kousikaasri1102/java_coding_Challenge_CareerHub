package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.model.Applicant;
import com.model.JobListing;
import com.service.JobListingService;

public class JobListingController {
public static void main(String[] args) {
	JobListingService jobListingService=new JobListingService();
	Scanner sc=new Scanner(System.in);
	while(true)
	 { 
	 System.out.println("-----------JobListing Module------------");
	 System.out.println("Press1. List applicants");
	 System.out.println("Press2. Apply job");
	 System.out.println("Press0. exit");
	 int input=sc.nextInt();
	
    	if(input==0)
	      {
	 	       System.out.println("exiting...");
		       break;
	      }
    	switch(input) {
    	case 1:
//    		Applicant applicant=new Applicant(id,first_name,last_name,email,resume,phone) ;
			
			try {
			List<Applicant> list=jobListingService.findAll();
			for(Applicant a:list) {
				System.out.println(a);
			}
			}catch(SQLException e) {
				System.out.println(e.getMessage());
			}
			break;
}
}
}
public static void JobListingMenu(){
	 String[] ref= {""};
	 main(ref);
 }
}
