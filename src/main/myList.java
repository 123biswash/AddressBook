package main;


public class myList{
	Node head = null;
	
	public boolean findEntry (int phone) {
		Node temp = head;
		if (temp==null) {
			return false;
		}else if(temp.next==null && temp.data.getPhone()==phone) {
			return true;
		}else {
			while(temp.next!=null) {
				if (temp.data.getPhone()==phone) {
					return true;
				}
				temp=temp.next;
			}
			if(temp.next==null && temp.data.getPhone()==phone) {
				return true;
			}
		return false;
		
		}
	}
	
	public int size() {
		int count=0;
		Node temp = head;
		
		if (temp == null) {
			count=0;
		}else if (temp.next == null) {
			count=1;
		}else{
			while(temp.next!=null) {
				count+=1;
				temp=temp.next;
			}
			if (temp.next == null) {
				count+=1;
			}
		}
		return count;
	}
	
	public void printEntry(int phone) {
		Node temp = head;
		if (temp==null) {
			System.out.println("no entries found\n\n");
			return;
		}
		if (temp.next == null && temp.data.getPhone() == phone)
        {
            System.out.println(temp.data.getFname());
            System.out.println(temp.data.getLname());
            System.out.println(temp.data.getStreetAddress());
            System.out.println(temp.data.getCity());
            System.out.println(temp.data.getState());
            System.out.println(temp.data.getZip());
            System.out.println(temp.data.getPhone());
            return;
        }
		
		while (temp.next!=null) {
			if (temp.data.getPhone()==phone) {
				System.out.println(temp.data.getFname());
	            System.out.println(temp.data.getLname());
	            System.out.println(temp.data.getStreetAddress());
	            System.out.println(temp.data.getCity());
	            System.out.println(temp.data.getState());
	            System.out.println(temp.data.getZip());
	            System.out.println(temp.data.getPhone());
	            return;
			}
			temp=temp.next;
		}
		if (temp.next == null && temp.data.getPhone() == phone)
        {
            System.out.println(temp.data.getFname());
            System.out.println(temp.data.getLname());
            System.out.println(temp.data.getStreetAddress());
            System.out.println(temp.data.getCity());
            System.out.println(temp.data.getState());
            System.out.println(temp.data.getZip());
            System.out.println(temp.data.getPhone());
            return;
        }
		System.out.println("no entries found \n\n");
	}
	
    public void addEntry(Person j){
    			Node new_node = new Node(j);

    			if (head == null){
    			head = new_node;
    			return;
    			}

    			Node last = head;
    			while (last.next != null){
    			last = last.next;
    			}

    			last.next = new_node;

    }
    
    public void deleteEntry(int phone)
    {
        // Store head node
        Node temp = head, prev = null;
 
        // If head node itself holds the key to be deleted
        if (temp != null && temp.data.getPhone() == phone)
        {
            head = temp.next; // Changed head
            System.out.println("deletion successful");
            return;
        }
 
        // Search for the key to be deleted, keep track of the
        // previous node as we need to change temp.next
        while (temp != null && temp.data.getPhone() != phone)
        {
            prev = temp;
            temp = temp.next;
        }
        
 
        // If key was not present in linked list
        if (temp == null) return;
 
        // Unlink the node from linked list
        prev.next = temp.next;
        
    }
    
    public void editEntry(Person new_P){
    			Node newP= new Node(new_P);
    			Node temp=head;
    			if ((temp.next==null) && (temp.data.getPhone()==newP.data.getPhone())) {
    					Person x=newP.data;
    					temp.data=x;
//					System.out.println("The updated record is as follows:");
//					printEntry(temp.data.getPhone());
					return;
    			}else {
	    			while (temp.next!=null) {
			    		if (temp.data.getPhone()==newP.data.getPhone()) {
						
			    			Person x=newP.data;
	    					temp.data=x;
//							System.out.println("The updated record is as follows:");
//							printEntry(temp.data.getPhone());
							return;
						}
			    		temp=temp.next;
				}
				
				if((temp.next==null) && (temp.data.getPhone()==newP.data.getPhone())) {
	
					Person x=newP.data;
					temp.data=x;
//					System.out.println("The updated record is as follows:");
//					printEntry(temp.data.getPhone());
					return;
				}
    			}
   }
    
    public void sortEntryByZip() {
    
    		for(Node node1 = head; node1!=null; node1 = node1.next){//number of
    		//iterations
    		Node min = node1;//assumes min node is the node under considerations
    		//selects the min node
    		for(Node node2 = node1; node2!=null; node2 = node2.next){
    		if(min.data.getZip() > node2.data.getZip()){
    		min = node2;
    		}

    		}
    		//swaps the min node with the node in its actual position
    		Node temp = new Node(node1.data);
    		node1.data = min.data;
    		min.data = temp.data;
    		}
    		
    		

   		Node curr=head;
   		if (curr == null) {
 			return;
   		}else if (curr.next == null) {
 			printEntry(curr.data.getPhone());
   		}else{
 			while(curr.next!=null) {
  				printEntry(curr.data.getPhone());
   				curr=curr.next;
   			}
   			printEntry(curr.data.getPhone());
  			return;
   		}
    }
    
    
    public boolean checkForIfSortedByZip() {
    	Node temp=head;
		if (temp == null) {
			return true;
		}else if (temp.next == null) {
			if (temp.data.getZip() <= temp.next.data.getZip()) {
				return true;
			}
		}else{
			while(temp.next!=null) {
				if (temp.data.getZip() <= temp.next.data.getZip()) {
					return true;
				}
				temp=temp.next;
			}
		  }
		return false;
    }
    
    public void swap(Node temp1, Node min) {
    		Node x=temp1;
    		temp1=min;
    		min=x;
    }
    
    public void deleteAll() {
    Node temp=head;
    	if (temp == null) {
			return;
		}else if (temp.next == null) {
			deleteEntry(temp.data.getPhone());
		}else{
			while(temp.next!=null) {
				deleteEntry(temp.data.getPhone());
				temp=temp.next;
			}
			if (temp.next == null) {
				deleteEntry(temp.data.getPhone());
			}
			return;
		}
    }
    	
}


