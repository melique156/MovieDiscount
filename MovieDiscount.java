/*
 * Programmer:
 * Date:
 * Purpose:
 */

import java.util.Scanner;

public class MovieDiscount {
    public static void main (String [] args) {
        // Create the input scanner
        Scanner input = new Scanner(System.in);

        // Ask the user for the side lengths
        System.err.print("How old are you? ");
        int age = input.nextInt();
        
        double cost = 14.50 ;
        // Ask the user if they have a coupon
        System.err.print("Do you have a coupon? [true/false] ");
        
        // Read in a true/false value
       
        boolean hasCoupon = input.nextBoolean();
        if(age < 13 && age >=65); {
            cost = 11.50 ;
            System.out.print("Your ticker costs " + cost);
            else
        }
        if (hasCoupon == true) {
        	cost = 12.50 ;
        	else{
        }
        	else{ (hasCoupon == false); 
        		cost = 14.50 ;
        		}
        
        // Print the cost of a movie ticket 
        if(age < 13 && age >=65 == hasCoupon)
        System.out.print("Your ticker costs " + cost);
  
    
        // TODO: Figure out the cost and print it
 
    	
    }
}
