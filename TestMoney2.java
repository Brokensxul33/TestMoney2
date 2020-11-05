/*Title: TestMoney
 * Date: 11/04/2020
 *Author: LuisFlores Cardoza
 */
package lab13;

import java.util.Random;

public class TestMoney2 {

	public static void main(String[] args) {
		Random random = new Random();
		Money[] moneyObjects = new Money[15];
		// list of fifteen Money Object (Dollars from range 1-30 and cents from range 0-99)
		for(int i = 0; i < 15; i++) {
			if(i % 10 == 0) {
				System.out.println();
			}
			//dollars range 1- 30
			int dollars = random.nextInt(30) + 1;
			//cents range 0-99
			int cents = random.nextInt(100);
		    //moneyObject with array of 15 with new Money generated from random dollars,cents
			moneyObjects[i]= new Money(dollars,cents);
			// Displaying dollars range 1-30 and cents 0-99
			System.out.print(new Money(dollars,cents) + " ");
			//print line vertically 
			
			}
	    Money max =moneyObjects[0];
	    Money sum = moneyObjects[0];
		for(int i = 1; i < moneyObjects.length; i++) {
			int q = max.compareTo(moneyObjects[i]);
			if(q == 1)
			   max = moneyObjects[i];
			sum = sum.add(moneyObjects[i]);
			   
			
			
			
			
	}
	
		System.out.println("\nsum = " + sum.toString());
		System.out.println("max = " + max.toString());
		
	}
	
		   
		
		
 }
		
		
		
		  
			  
			
		
		

		 
			
		//print the objects and find the sum and find the largest money object	

		

	


 