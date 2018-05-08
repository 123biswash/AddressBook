package final2Main;
import java.util.*;

public class Main{
	
	public static void main(String[] args)
    {
	myList x = new myList();
	int loop=0;
	do {
		
	System.out.println("Welcome to Your Address Book");
	System.out.println("Press 1 to Add entry.\nPress 2 to Delete entry.\nPress 3 to Print Address. \nPress 4 to edit. \nPress 5 to sort entries by zipcode \n Press 0 to exit.");
	int option;
	System.out.println("Enter your option : ");
    	Scanner in_stream = new Scanner(System.in);
	    option=in_stream.nextInt();
		if(option == 1){
			Person j = new Person();
			Scanner obj = new Scanner(System.in);
			System.out.println("Enter the first name : ");
			j.setFname(obj.nextLine());
			System.out.println("Enter the last name : ");
			j.setLname(obj.nextLine());
			System.out.println("Enter the streetAddress : ");
			j.setStreetAddress(obj.nextLine());
			System.out.println("Enter the city : ");
			j.setCity(obj.nextLine());
			System.out.println("Enter the state : ");
			j.setState(obj.nextLine());
			System.out.println("Enter the zip : ");
			j.setZip(obj.nextInt());
			System.out.println("Enter the phone number : ");
			j.setPhone(obj.nextInt());
			x.addEntry(j);
		}
		else if(option==2){
						
					Scanner obj= new Scanner(System.in);
					System.out.println("Enter the name to be deleted : ");
					int num=obj.nextInt();
					x.deleteEntry(num);
			}
		else if(option==3){
				Scanner obj= new Scanner(System.in);
				System.out.println("Enter the phone number to search for corresponding address: ");
				int num = obj.nextInt();
				x.printEntry(num);
			}
		else if(option==4){
				Scanner obj= new Scanner(System.in);
				Person newP = new Person();
				System.out.println("Enter the phone number of the addressBook you want to update : ");
				int num=obj.nextInt();
				if (x.findEntry(num)==true) {
					
					int option1;
					System.out.println("Press 1 to edit first name.\nPress 2 to edit last name.\nPress 3 to edit street address. \nPress 4 to edit city.\nPress 5 to edit state.\nPress 6 to edit zip.\nPress 7 to edit phone\n Press 8 to return to main menu \n(If editing multiple elements, please do it one by one)");
					option1=in_stream.nextInt();
					if(option1==1) {
						System.out.println("Enter the first name");
						String fname=obj.nextLine();
						newP.setFname(fname);
						x.editEntry(newP);
					}else if(option1==2) {
						System.out.println("Enter the last name");
						String lname=obj.nextLine();
						newP.setLname(lname);
						x.editEntry(newP);
					}else if(option1==3) {
						System.out.println("Enter the street address");
						String streetAddress=obj.nextLine();
						newP.setStreetAddress(streetAddress);
						x.editEntry(newP);
					}else if(option1==4) {
						System.out.println("Enter the city");
						String city=obj.nextLine();
						newP.setCity(city);
						x.editEntry(newP);
					}else if (option1==5) {
						System.out.println("Enter the state");
						String state=obj.nextLine();
						newP.setState(state);
						x.editEntry(newP);
					}else if(option1==6) {
						System.out.println("Enter the zip");
						int zip=obj.nextInt();
						newP.setZip(zip);
						x.editEntry(newP);
					}else if(option1==7) {
						System.out.println("Enter the phone number");
						int number=obj.nextInt();
						newP.setPhone(number);
						x.editEntry(newP);
					}else {
						loop=1;
					}
				}else {
					System.out.println("entry not found");
				}
		}else if(option==5){
			x.sortEntryByZip();	
			
		}else if(option==0){
			return;
		}else{
				System.out.println("Wrong option entered");
			}
	  }while( loop == 1);
	
	}
}


