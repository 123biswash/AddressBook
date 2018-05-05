package final2Main;
import java.util.*;
public class Main{
	
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
	   
	
	
	class LinkedList
	{
	    Node head; 
	    static class Node {
	        Person data;
	        Node next;
	        Node(int d)  { data = d;  next=null; } // Constructor
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
				Scanner name_object = new Scanner(System.in);
				Scanner number_object= new Scanner(System.in);
				System.out.println("Enter the first name : ");
				fname=obj.nextLine();
				System.out.println("Enter the last name : ");
				lname=obj.nextLine();
				System.out.println("Enter the streetAddress : ");
				streetAddress=obj.nextLine();
				System.out.println("Enter the state : ");
				state=obj.nextLine();
				System.out.println("Enter the zip : ");
				zip=obj.nextInt();
				System.out.println("Enter the phone number : ");
				phone=obj.nextLine();
				
			}
			else if(option==2){
							
						Scanner name_object= new Scanner(System.in);
						System.out.println("Enter the name to be deleted : ");
						name=name_object.nextLine();
						object.DeleteEntry(name);
				}
			else if(option==3){
					Scanner name_object= new Scanner(System.in);
					System.out.println("Enter the name to search : ");
					name = name_object.nextLine();
					number=object.getNumber(name);
					if(number.equals(null)){
						System.out.println("ERROR! The name entered is not found");
					}
					else{
						System.out.println("The number is : " + number);
					}
				}
			else if(option==4){
					Scanner name_object= new Scanner(System.in);
					Scanner number_object= new Scanner(System.in);
					System.out.println("Enter the name update : ");
					name=name_object.nextLine();
					System.out.println("Enter the number to be updated : ");
					number=number_object.nextLine();
					object.changeEntry(name, number);						
				}
			else{
				System.out.println("Wrong option entered");
			}
	    		
	        /* Start with the empty list. */
	        LinkedList llist = new LinkedList();
	        llist.head  = new Node(1);
	        Node second = new Node(2);
	        Node third  = new Node(3);
	        llist.head.next = second; // Link first node with the second node
	        second.next = third; // Link second node with the third node
	 
	    }
	    
	    public void addEntry(String firstName, String lastName, String streetAddress, String city, String state, int zip, String phone){

	        /* 1. Allocate the Node &
	           2. Put in the data
	           3. Set next as null */
	    		Person.fname = firstName;
	    		
	        Node new_node = new Node(new_data);
	     
	        /* 4. If the Linked List is empty, then make the
	               new node as head */
	        if (head == null)
	        {
	            head = new Node(new_data);
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
	}
}