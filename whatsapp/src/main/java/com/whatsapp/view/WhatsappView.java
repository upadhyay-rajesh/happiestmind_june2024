package com.whatsapp.view;

import java.util.Scanner;

import com.whatsapp.controller.WhatsappController;
import com.whatsapp.controller.WhatsappControllerInterface;

public class WhatsappView {

	public static void main(String[] args) {
		String ss = "y";

		while (ss.equals("y")) {
			System.out.println("****************MAIN MENU***************");
			System.out.println("press 1 to create profile");
			System.out.println("press 2 to view profile");
			System.out.println("press 3 to view all data");

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			
			WhatsappControllerInterface wc=new WhatsappController();
			
			switch(choice) {
			case 1 : wc.createProfileController();
				break;
			case 2 : wc.viewProfileController();
				break;
			case 3 : wc.viewAllProfile();
				default:System.out.println("wrong choice");
			}
		}

	}

}











