package org.howard.edu.lsp.assignment5;

public class Driver 
{
	public static void main(String[] args)
    {
		/*
		 * Create our Sets
		 */
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        IntegerSet set3 = new IntegerSet();
        IntegerSet set4 = new IntegerSet();
        IntegerSet set5 = new IntegerSet();

        
        /*
         * Add Integers to the set
         */
        {
        	set1.add(23);
        	set1.add(42);
        	set1.add(83);
        	set1.add(2);
        }
        {
        	set2.add(79);
        	set2.add(9);
        	set2.add(10);
        }
        {
        	set3.add(64);
        	set3.add(83);
        	set3.add(35);
        }
        {
        	set4.add(23);
        	set4.add(42);
        	set4.add(83);
        	set4.add(2);
        }
        {
        	set5.add(37);
        	set5.add(32);
        	set5.add(22);
        }
        
        /*
         * Print out current sets
         */
        System.out.println("Contents of IntegerSets");
        System.out.println("Set 1: " + set1.toString());
        System.out.println("Set 2: " + set2.toString());
        System.out.println("Set 3: " + set3.toString());
        System.out.println("Set 4: " + set4.toString());
        System.out.println("Set 5: " + set5.toString());
        System.out.println("****************");

      
        /*
         * Length of Sets
         */
        System.out.println("Length of IntegerSets");
        System.out.println("The length of Set1 is: " + set1.length());
        System.out.println("The length of Set2 is: " + set2.length());
        System.out.println("The length of Set3 is: " + set3.length());
        System.out.println("The length of Set4 is: " + set4.length());
        System.out.println("The length of Set5 is: " + set5.length());
        System.out.println("****************");
        
        
        /*
         * Printing out the largest number in each set
         */
        System.out.println("Largest Number in each IntegerSets");
        try 
    	{
        	  System.out.println("Largest Number in Set1: " + set1.largest());
              System.out.println("Largest Number in Set2: " + set2.largest());
              System.out.println("Largest Number in Set3: " + set3.largest());
              System.out.println("Largest Number in Set4: " + set4.largest());
              System.out.println("Largest Number in Set5: " + set5.largest());
    	}
    	catch(Exception e)
    	{
    		System.out.println("Exception: " + e);
    	}
        System.out.println("****************");
        
        
        /*
         * Printing out the smallest number in each set
         */
        System.out.println("Smallest Number in each IntegerSets");
        try 
    	{
        	  System.out.println("Smallest Number in Set1: " + set1.largest());
              System.out.println("Smallest Number in Set2: " + set2.largest());
              System.out.println("Smallest Number in Set3: " + set3.largest());
              System.out.println("Smallest Number in Set4: " + set4.largest());
              System.out.println("Smallest Number in Set5: " + set5.largest());
    	}
    	catch(Exception e)
    	{
    		System.out.println("Exception: " + e);
    	}
        System.out.println("****************");
        

        /*
         * Remove numbers from the IntegerSets
         */
        System.out.println("Removing integers from the IntegerSets");
        System.out.println("Removing 23 from Set1");
        set1.remove(23);
        System.out.println("Removing 9 from Set2");
        set2.remove(9);
        System.out.println("Removing 64 from Set3");
        set3.remove(64);
        System.out.println("Removing 23 from Set4");
        set4.remove(23);
        System.out.println("Removing 37 from Set5");
        set5.remove(37);
        System.out.println("");
        System.out.println("Set 1: " + set1.toString());
        System.out.println("Set 2: " + set2.toString());
        System.out.println("Set 3: " + set3.toString());
        System.out.println("Set 4: " + set4.toString());
        System.out.println("Set 5: " + set5.toString());
        System.out.println("****************");
        
        
        /*
         * Test out the contains implementation
         */
        System.out.println("Contains Implementation:");
        System.out.println("Set1 contain 42?: " + set1.contains(42));
        System.out.println("Set2 contain 9?: " + set2.contains(9));
        System.out.println("Set3 contain 83?: " + set3.contains(83));
        System.out.println("Set4 contain 42?: " + set4.contains(42));
        System.out.println("Set5 contain 22?: " + set5.contains(2));
        System.out.println("****************");

        
        /*
         * Test out the equals implementation
         */
        System.out.println("Equals Implementation:");
        System.out.println("Set1 == Set4?: " + set1.equals(set4));
        System.out.println("Set2 == Set3?: " + set2.equals(set3));
        System.out.println("****************");
        
        
        /*
         * Test out intersection implementation
         */
        System.out.println("Intersection Implementation:");
        System.out.println("Intersection of Set1 and Set4:"); 
        set1.intersect(set4);
        System.out.println("Intersection of Set2 and Set3:"); 
        set2.intersect(set3);
        System.out.println("****************");
        
        
        /*
         * Test out Difference Implementation
         */
        System.out.println("Difference Implementation:\n");
        System.out.println("Difference of Set3 from Set4:"); 
        set3.diff(set4);
        System.out.println("Difference of Set1 from Set2:"); 
        set1.diff(set2);
        System.out.println("Difference of Set1 from Set4:"); 
        set1.diff(set4);             
        System.out.println("****************");
        
        
        /*
         * Test out clear implementation
         */
        System.out.println("Clearing Implementation:");
        System.out.println("Clearing Set2:" );
        set2.clear();
        System.out.println("Set2: " + set2.toString());
        System.out.println("Clearing Set5:" );
        set5.clear();
        System.out.println("Set5: " + set5.toString());
        System.out.println("****************");
        

        
        
        /*
         * Test out Union Implementation
         */
        System.out.println("Union Implementation:");
        System.out.println("Union of Set1 and Set3");
        System.out.println("Set1: " + set1.toString());
        System.out.println("Set3: " + set3.toString());
        set1.union(set3);
        System.out.println("****************");
        
        System.out.println("Union of Set3 and Set4");
        System.out.println("Set3: " + set3.toString());
        System.out.println("Set4: " + set4.toString());
        set3.union(set4);
        System.out.println("****************");
    }
}

