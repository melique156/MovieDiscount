/*
 * Programmer:Melique.williams
 * Date:Monday,October 5,2020
 * Purpose:
 */

import java.util.Scanner;

public class MovieDiscount {
	public static void main (String [] args) {

		// Create the input scanner
		Scanner input = new Scanner(System.in);

		// Getting user inputs age
		System.err.print("How old are you? ");
		int age = input.nextInt();


		// Ask the user if they have a coupon
		System.err.print("Do you have a coupon? [true/false] ");

		// Finding out if user has Coupon
		boolean hasCoupon = input.nextBoolean();

		if (age < 13 || age >= 65) {
			if(hasCoupon) {
				System.out.println("Your ticket costs $ 9.5." );
			}
			else {
				System.out.println("Your ticket costs $11.5.");
			}
		}

		else { 
			if(hasCoupon) {

				System.out.println("Your ticket costs $12.5.");
			}
			else {
				System.out.println("Your ticket costs $14.5.");
			}

		}







	}
}
