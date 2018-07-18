package lab3;

import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		
		// declare the variables
		Scanner sc = new Scanner(System.in);
		String choice = "", name;
		
		// get user name
		System.out.print("Please enter your name : ");
		name = sc.nextLine();
		
		do {
			// get input (integer ranging from 1 to 100)
			System.out.print("\nHello "+ name+", please enter an integer between 1 and 100: ");
			int number = sc.nextInt();
			
			// check if the number is within range
			if(number>=0 & number<=100) {
				
				// find the remainder of number divided by 2
				int modulus = number%2;
				
				
				switch (modulus) {
				// if the remainder (modulus) is 1, then the number is odd
				case 1:
					if (number >60) {
						System.out.println("\nHey "+name+", "+number + " is Odd and over 60.");
						break;
					}
					else {
						System.out.println("\nHey " + name+", "+number +" is Odd.");
						break;
					}
				// if the remainder(modulus) is 0, then it is an even number
				case 0:	
					if (number>2 & number <25){
						System.out.println("\nHey " + name +", the number you entered is Even and less than 25.");
						break;
					}
					else if(number>=26 && number<=60) {
						System.out.println("\nHey "+ name+", " +" the number you entered is Even.");
						break;
					}
					else {
						System.out.println("\nHey "+name+", "+number+" is an Even number.");
						break;
					}						
				}	
			}
			// if the user entered number is out of the specified range, print that it is an invalid number
			else {
				System.out.println("The number you entered is invalid!");
			}
			
			// check if the user wants to continue
			System.out.print("\n"+name+", do you want to continue (y/n) ? ");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("y"));
		
		// display program end message
		System.out.println("\nGoodbye "+name+"!");
	}
}
