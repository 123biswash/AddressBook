package main;


public class myList{
	Node head = null;
	public boolean findEntry (int phone) {
		Node temp = head;
		if (temp==null) {
			return false;
		}
		while(temp.next!=null) {
			if (temp.data.getPhone()==phone) {
				return true;
			}
			temp=temp.next;
		}
		return false;
		
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
    	
//    		Node new_node = new Node(j);
//    		Node current = head;
//    		if (current==null) {
//    			current=new_node;
//    			current.next=null;
//    			return;
//    		}else if(current.next==null) {
//    			current.next=new_node;
//    			current=current.next;
//    			current.next=null;
//    			
//    		}else {
//    			while (current.next != null) {
//            current = current.next;
//        }
//        current.next = new_node;
//        current = current.next;
//        current.next=null;
//        return;
//    		}
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
    
    public void editEntry(Person newP){
    		Node temp=head;
    		while (temp.next!=null) {
	    		if (temp.data.getPhone()==newP.getPhone()) {
				if (newP.getFname()!= null) {
					temp.data.setFname(newP.getFname());
				}else if(newP.getLname()!= null) {
					temp.data.setLname(newP.getLname());
				}else if(newP.getStreetAddress()!= null) {
					temp.data.setStreetAddress(newP.getStreetAddress());
				}else if(newP.getCity()!= null) {
					temp.data.setCity(newP.getCity());
				}else if(newP.getState()!= null) {
					temp.data.setState(newP.getState());
				}else if(newP.getZip() != 0) {
					temp.data.setZip(newP.getZip());
				}else if(newP.getPhone() != 0) {
					temp.data.setPhone(newP.getPhone());
				}	
			}
			temp=temp.next;
		}
    	}
    
    public void sortEntryByZip() {
    		Node temp1 = head;
    		Node temp2 = temp1.next;
    		while(temp1.next!=null) {
    			Node min= temp1;
    			while(temp2.next!=null) {
    				if(temp2.data.getZip() < temp1.data.getZip()) {
    					min=temp2;
    				}
    			}
    			swap(temp1, min);
    			temp1=temp1.next;
    			temp2=temp2.next;
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


