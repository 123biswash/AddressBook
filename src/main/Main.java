package main;
import java.util.*;

public class Main{
	
	public static void main(String[] args)
    {
	myList x = new myList();
	int loop;
	do {
	loop=0;
	System.out.println("Welcome to Your Address Book");
	System.out.println("Press 1 to Add entry.\nPress 2 to Delete entry.\nPress 3 to Print Address. \nPress 4 to edit. \nPress 5 to sort entries by zipcode \nPress 6 to delete the whole address book \nPress 7 to find the number of addresses (linked list size) \nPress 0 to exit.");
	int option;
	System.out.println("Enter your option : ");
    	Scanner in_stream = new Scanner(System.in);
	    option=in_stream.nextInt();
	    
		if(option == 1){
			Person j = new Person();
			Scanner k = new Scanner(System.in);
			System.out.println("Enter the first name : ");
			j.setFname(k.nextLine());
			System.out.println("Enter the last name : ");
			j.setLname(k.nextLine());
			System.out.println("Enter the streetAddress : ");
			j.setStreetAddress(k.nextLine());
			System.out.println("Enter the city : ");
			j.setCity(k.nextLine());
			System.out.println("Enter the state : ");
			j.setState(k.nextLine());
			System.out.println("Enter the zip : ");
			while (!k.hasNextInt())
			{
			    k.next();
			    System.err.print("That wasn't an int number. Try again: ");
			}
			int zip = k.nextInt();
			j.setZip(zip);
			System.out.println("Enter the phone number : ");
			while (!k.hasNextInt())
			{
			    k.next();
			    System.err.print("That wasn't an int number. Try again: ");
			}
			int num = k.nextInt();
			j.setPhone(num);
			x.addEntry(j);
			loop=1;
		}
		
		else if(option==2){	
					Scanner k= new Scanner(System.in);
					System.out.println("Enter the phone number of entry to be deleted : ");
					int num;
					num = k.nextInt();
					x.deleteEntry(num);
					loop=1;
			}
		
		else if(option==3){
				Scanner k= new Scanner(System.in);
				System.out.println("Enter the phone number to search for corresponding address: ");
				int num = k.nextInt();
				x.printEntry(num);
				loop=1;
			}
		
		else if(option==4){
				Scanner userin= new Scanner(System.in);
				Person newP = new Person();
				System.out.println("Enter the phone number of the addressBook you want to update : ");
				int num=userin.nextInt();
				if (x.findEntry(num)==true) {
					
					
						System.out.println("Enter the first name\n");
						String fname=userin.next();
						newP.setFname(fname);
						
						System.out.println("Enter the last name\n");
						String lname=userin.next();
						newP.setLname(lname);
						
						System.out.println("Enter the street address\n");
						String streetAddress=userin.next();
						newP.setStreetAddress(streetAddress);
						
						System.out.println("Enter the city\n");
						String city=userin.next();
						newP.setCity(city);
						
						System.out.println("Enter the state\n");
						String state=userin.next();
						newP.setState(state);
						
						System.out.println("Enter the zip\n");
						while (!userin.hasNextInt())
								{
								userin.next();
								    System.err.print("That wasn't an int number. Try again: ");
								}
						int zip = userin.nextInt();
						newP.setZip(zip);
						
						System.out.println("Enter the phone number\n");
						while (!userin.hasNextInt())
						{
							userin.next();
						    System.err.print("That wasn't an int number. Try again: ");
						}
						int number = userin.nextInt();
						newP.setPhone(number);
						
						x.editEntry(newP);
						
					}else {
					System.out.println("entry not found");
					}
					loop=1;
		}else if(option==5){
			x.sortEntryByZip();	
			loop=1;
		}else if(option==6){
			x.deleteAll();	
			loop=1;
		}else if(option==7){
			System.out.println("Number of addresses in address book: " + x.size() + "\n\n");
			loop=1;
		}else if(option==0){
			return;
		}else{
				System.out.println("Wrong option entered");
				loop=1;
		}
		
	  }while(loop == 1);
	
	}
}


