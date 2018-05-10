/**
 * 
 */
package test;
import main.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.Person;
import main.myList;

/**
 * @author bis
 *
 */
public class AddressTest1 {

	 myList lstTest = new myList();
	 Person pOne= new Person();
	 Person pTwo= new Person();
	 Person pThree= new Person();
	 		@Before
		    public void init() {
				
				pOne.setFname("o");
				pOne.setLname("o");
				pOne.setStreetAddress("o");
				pOne.setCity("o");
				pOne.setState("o");
				pOne.setZip(1);
				pOne.setPhone(1);
		
				
				pTwo.setFname("t");
				pTwo.setLname("t");
				pTwo.setStreetAddress("t");
				pTwo.setCity("t");
				pTwo.setState("t");
				pTwo.setZip(2);
				pTwo.setPhone(2);
				
				
				pThree.setFname("th");
				pThree.setLname("th");
				pThree.setStreetAddress("th");
				pThree.setCity("th");
				pThree.setState("th");
				pThree.setZip(3);
				pThree.setPhone(3);
		        lstTest.addEntry(pOne);
		        lstTest.addEntry(pTwo);
		        lstTest.addEntry(pThree);
		
		    }
		    @Test
		    public void size() {
		        assertEquals( 3, lstTest.size());
		    }
		    
		    @Test
		    public void printEntry() {
		    		lstTest.printEntry(2);
		        assertTrue(lstTest.findEntry(2));
		    }
		    
		    @Test
		    public void editEntry() {
		    		lstTest.editEntry(pTwo);	
		        assertTrue(lstTest.findEntry(2));
		    }
	
		    @Test
		    public void addEntry() {
		    	Person pFour= new Person();
		    		pFour.setFname("F");
		    		pFour.setLname("F");
		    		pFour.setStreetAddress("F");
		    		pFour.setCity("F");
		    		pFour.setState("F");
		    		pFour.setZip(4);
		    		pFour.setPhone(4);
		        lstTest.addEntry(pFour);
		        assertEquals( 4, lstTest.size());
		
		    }
		    @Test
		    public void deleteEntry() {
		        lstTest.deleteEntry(2);
		        assertEquals( 3, lstTest.size());
		    }
		    
		    @Test
		    public void sortEntryByZip() {
		        lstTest.sortEntryByZip();
		        assertTrue(lstTest.checkForIfSortedByZip());
		    }
		    
		    @After
		    public void deleteAll() {
		        lstTest.deleteAll();
		        assertEquals( 0, lstTest.size());
		    }


}
