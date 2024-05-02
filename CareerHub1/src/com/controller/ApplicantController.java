package com.controller;

import java.sql.SQLException;  
import java.util.Random;
import java.util.Scanner;

import com.model.Applicant;
import com.model.Application;
import com.service.ApplicantService;

public class ApplicantController {
     public static void main(String[] args) {
    	 ApplicantService applicantService=new ApplicantService();
    	 Scanner sc=new Scanner(System.in);
 		 while(true)
 		 { 
 		 System.out.println("-----------Applicants Module------------");
 		 System.out.println("Press1. Create Profile");
 		 System.out.println("Press2. Apply for job");
 		 System.out.println("Press0. exit");
 		 int input=sc.nextInt();
 		
 	    	if(input==0)
 		      {
 		 	       System.out.println("exiting applicants...");
 			       break;
 		      }
 	    	switch(input) {
			case 1: 
				
			    System.out.println("profile creation....");
			    Random random=new Random();
				int randomNumber=random.nextInt();
				int id=randomNumber<0?randomNumber*-1:randomNumber;
				System.out.println("Enter firstName");
				sc.nextLine();
				String firstName=sc.nextLine();
				System.out.println("Enter lastName");
				String lastName=sc.nextLine();
				System.out.println("Enter email");
				String email=sc.nextLine();
				System.out.println("enter phone");
				int phone=sc.nextInt();
				System.out.println("enter resume");
				sc.nextLine();
				String resume=sc.nextLine();
				
				
				Applicant applicant=new Applicant(id, firstName, lastName, email,  resume, phone) ;
				try {
					int status=applicantService.insert(applicant);
					if(status==1)
						System.out.println("Profile created succssfully");
					else
						System.out.println("Unable to create profile");
					
				}catch(SQLException e) {
					System.out.println(e.getMessage());
				}
				break;
			/*case 2:
				System.out.println("Job Application");
//				System.out.println("Date");
				 applicant
					randomNumber=random.nextInt();
					int j_id=randomNumber<0?randomNumber*-1:randomNumber;
				System.out.println("Enter your cover letter: ");
				sc.nextLine();
				String coverLetter=sc.nextLine();
				System.out.println("Job ID");
				int id1=sc.nextInt();
				System.out.println("Enter Applicant ID...");
				int applicationid=sc.nextInt();
				
				 
				Application application=new Application(j_id,applicationid,id1,coverLetter);
				try {
					int status=applicantService.insert(application);
					if(status==1)
						System.out.println("Job applied succssfully");
					else
						System.out.println("Unable to apply");
					
				}catch(SQLException e) {
					System.out.println(e.getMessage());
				}
				break;*/
 		
	}
 		 }sc.close();
     
     }public static void ApplicantMenu(){
 		 String[] ref= {""};
 		 main(ref);
 	 }
}