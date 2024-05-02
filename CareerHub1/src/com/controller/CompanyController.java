package com.controller;

import java.sql.SQLException; 
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.model.JobListing;

import com.service.CompanyService;

public class CompanyController {
public static void main(String[] args) {
	CompanyService companyService=new CompanyService();
	Scanner sc=new Scanner(System.in);
	while(true)
	 { 
	 System.out.println("-----------Company Module------------");
	 System.out.println("Press1. Post Job");
	 System.out.println("Press2. Display jobs");
	 System.out.println("Press0. exit");
	 int input=sc.nextInt();
	
    	if(input==0)
	      {
	 	       System.out.println("exiting...");
		       break;
	      }
    	switch(input) {
		case 1: 
		    System.out.println("Post Job");
		    Random random=new Random();
			int randomNumber=random.nextInt();
			int id=randomNumber<0?randomNumber*-1:randomNumber;
			System.out.println("Enter Job Title: ");
			sc.nextLine();
			String title=sc.nextLine();
			
			System.out.println("Enter Job Description: ");
			String description=sc.nextLine();
			
			System.out.println("Enter Job Location : ");
			String location=sc.nextLine();
			
			System.out.println("Enter Job type ");
			String type=sc.nextLine();
			
			System.out.println("Salary");
			int salary=sc.nextInt();
			System.out.println("companyId");
			int companyId=sc.nextInt();
			
			
			
			JobListing job=new JobListing(id, title, description, location,salary,type,companyId ) ;
			try {
				int status=companyService.insert(job);
				if(status==1)
					System.out.println("Job posted succssfully");
				else
					System.out.println("Unable to post job");
				
			}catch(SQLException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 2:
			try {
			List<JobListing> list=companyService.findAll();
			for(JobListing a:list) {
				System.out.println(a);
			}
			}catch(SQLException e) {
				System.out.println(e.getMessage());
			}
			break;
}
	 }
//	sc.close();
}
public static void CompanyMenu(){
	 String[] ref= {""};
	 main(ref);
 }
}
