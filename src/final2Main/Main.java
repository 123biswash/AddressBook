package final2Main;
import java.util.*;

public class Main{
	 static Node head; 
	 class Node {
	        Person data;
	        Node next;
	        Node(Person d)  { data = d;  next=null; } // Constructor
	    
	}
	    
	public class Person
	{
	    String fname;
	    String lname;
	    String streetAddress;
	    String city;
	    String state;
	    int zip;
	    String phone;
	}
	
	public static void main(String[] args)
    {
    	String fname, lname, streetAddress, city, state, phone;
    	int zip;
	System.out.println("Welcome to Your Address Book");
	System.out.println("Press 1 to Add entry.\tPress 2 to Delete entry.\tPress 3 to print. \tPress 4 to edit");
	int option;

	System.out.println("Enter your option : ");
    	Scanner in_stream = new Scanner(System.in);
	    option=in_stream.nextInt();
		if(option ==1){
			Person j = new Person();
			Scanner obj = new Scanner(System.in);
			System.out.println("Enter the first name : ");
			j.fname=obj.nextLine();
			System.out.println("Enter the last name : ");
			j.lname=obj.nextLine();
			System.out.println("Enter the streetAddress : ");
			j.streetAddress=obj.nextLine();
			System.out.println("Enter the state : ");
			j.state=obj.nextLine();
			System.out.println("Enter the zip : ");
			j.zip=obj.nextInt();
			System.out.println("Enter the phone number : ");
			j.phone=obj.nextLine();
			addEntry(j);
			
		}
		else if(option==2){
						
					Scanner obj= new Scanner(System.in);
					System.out.println("Enter the name to be deleted : ");
					phone=obj.nextLine();
					deleteEntry(phone);
			}
//		else if(option==3){
//				Scanner obj= new Scanner(System.in);
//				System.out.println("Enter the phone number to search for corresponding address: ");
//				name = obj.nextLine();
//				number=object.getNumber(phone);
//				if(number.equals(null)){
//					System.out.println("ERROR! The name entered is not found");
//				}
//				else{
//					System.out.println("The number is : " + number);
//				}
//			}
//		else if(option==4){
//				Scanner obj= new Scanner(System.in);
//				System.out.println("Enter the name update : ");
//				name=obj.nextLine();
//				System.out.println("Enter the number to be updated : ");
//				number=obj.nextLine();
//				object.changeEntry(fname, phone);						
//			}
		else{
			System.out.println("Wrong option entered");
		}
    		
        
 
    }

    public static void addEntry(Person k){

        /* 1. Allocate the Node &
           2. Put in the data
           3. Set next as null */
//    		Person k = new Person();
//    		k.fname = firstName;
//    		k.lname = lastName;
//    		k.streetAddress = streetAddress;
//    		k.city=city;
//    		k.state=state;
//    		k.zip=zip;
//    		k.phone=phone;
    		
        Node new_node = new Node(k);
     
        /* 4. If the Linked List is empty, then make the
               new node as head */
        if (head == null)
        {
            head = new Node(k);
            return;
        }
     
        /* 4. This new node is going to be the last node, so
             make next of it as null */
        new_node.next = null;
     
        /* 5. Else traverse till the last node */
        Node last = head; 
        while (last.next != null)
            last = last.next;
     
        /* 6. Change the next of last node */
        last.next = new_node;
        return;
	}
    
    public void deleteEntry(String phone)
    {
        // Store head node
        Node temp = head, prev = null;
 
        // If head node itself holds the key to be deleted
        if (temp != null && temp.data.phone == phone)
        {
            head = temp.next; // Changed head
            return;
        }
 
        // Search for the key to be deleted, keep track of the
        // previous node as we need to change temp.next
        while (temp != null && temp.data.phone != phone)
        {
            prev = temp;
            temp = temp.next;
        }    
 
        // If key was not present in linked list
        if (temp == null) return;
 
        // Unlink the node from linked list
        prev.next = temp.next;
    }
    
	
}