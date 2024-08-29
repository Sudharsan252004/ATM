package balance;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
	int Pin=4575;
	int Balance=10000;
	int add_balance=0;
	int take_balance=0;
	
	String name;
	Scanner inp=new Scanner(System.in);
	System.out.println("Enter Your Pin Number");
	int Password=inp.nextInt();
	
	if(Password==Pin) {
		System.out.println("Enter your Name");
		name=inp.next();
		System.out.println("Welcome "  +  name);
		
	while(true) {
		System.out.println("Press 1 Check your Balance");
		System.out.println("Press 2 Add a Amount");
		System.out.println("Press 3 Take a Amount");
		System.out.println("Press 4 Take Recipt");
		System.out.println("Press 5 Exit");
		int option=inp.nextInt();
		
		switch(option) {
		case 1:
		System.out.println("Your Balance is " +Balance);
		break;
		case 2:
			System.out.println("How much amount add your account");
			add_balance=inp.nextInt();
	        System.out.println("Credited Sucessfully");
			Balance=Balance+ add_balance;
			break;
		case 3:
			 System.out.println("How much amount take your account");
			 take_balance=inp.nextInt();
			 if(take_balance>Balance) {
				 System.out.println("Insufficient Balance");
				 System.out.println("Try Less than your available balance");
			 }
			 else {
				 System.out.println("Sucessfully taken your Account");
				 Balance=Balance - take_balance;
			 }
			 break;
		case 4:
			 System.out.println("Welcome to Canara Bank ATM");
			 System.out.println("available balance:" + Balance);
			 System.out.println("amount credit:" + add_balance);
			 System.out.println("amount taken:" + take_balance);
			 System.out.println("Thank You for coming");
			 break;
		}
		if(option==5) {
			 System.out.println("Thank You");
			 break;
		}
	
	}
	}
	else {
		 System.out.println("Wrong Pin");
	}


		

	}

}
