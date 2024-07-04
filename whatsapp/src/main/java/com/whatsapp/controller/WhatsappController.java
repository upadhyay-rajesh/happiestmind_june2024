package com.whatsapp.controller;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.whatsapp.entity.WhatsappUser;
import com.whatsapp.service.WhatsappService;
import com.whatsapp.service.WhatsappServiceInterface;
import com.whatsapp.utility.SortByAddress;

public class WhatsappController implements WhatsappControllerInterface {

	@Override
	public void createProfileController() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Name ");
		String name=sc.next();
		
		System.out.println("Enter Password ");
		String password=sc.next();
		
		System.out.println("Enter Email ");
		String email=sc.next();
		
		System.out.println("Enter Address ");
		String address=sc.next();
		
		//DTO
		WhatsappUser wu=new WhatsappUser();
		wu.setName(name);
		wu.setPassword(password);
		wu.setEmail(email);
		wu.setAddress(address);
		
		//above object we have to transfer to service layer. how?
		WhatsappServiceInterface ws=new WhatsappService();
		int i=ws.createProfileService(wu);
		
		if(i>0) {
			System.out.println("Profile Created");
		}
		else {
			System.out.println("could not create profile");
		}

	}

	@Override
	public void viewProfileController() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter email to view profile");
		String email=sc.next();
		
		//transfer above mail id using DTO
		WhatsappUser wu=new WhatsappUser();
		wu.setEmail(email);
		
		WhatsappServiceInterface ws=new WhatsappService();
		 WhatsappUser w1= ws.viewProfileService(wu);
		 
		 if(w1!=null) {
			 System.out.println("Your profile is ");
			 System.out.println("Name is "+w1.getName());
			 System.out.println("Password is "+w1.getPassword());
			 System.out.println("Email is "+w1.getEmail());
			 System.out.println("Address is "+w1.getAddress());
		 }
		 else {
			 System.out.println("Profile not exist for email id "+email);
		 }
		
	}

	@Override
	public void viewAllProfile() {
		WhatsappServiceInterface ws=new WhatsappService();
		List<WhatsappUser> ll=  ws.viewAllProfileService();
		
		System.out.println(ll.size()+"    record found");
		
		System.out.println("record unsorted");
		
		for(WhatsappUser w1:ll) {
			 System.out.println("*************************************** ");
			 System.out.println("Name is "+w1.getName());
			 System.out.println("Password is "+w1.getPassword());
			 System.out.println("Email is "+w1.getEmail());
			 System.out.println("Address is "+w1.getAddress());
		}
		
		Collections.sort(ll, new SortByAddress());
		
		System.out.println("record in sorted order");
		
		for(WhatsappUser w1:ll) {
			 System.out.println("*************************************** ");
			 System.out.println("Name is "+w1.getName());
			 System.out.println("Password is "+w1.getPassword());
			 System.out.println("Email is "+w1.getEmail());
			 System.out.println("Address is "+w1.getAddress());
		}
		
	}

}
















