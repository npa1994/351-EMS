package EMS;
import java.util.Scanner;

public class UsePerson {
  public static void main(String[] args) {
    Person P = new Person();
    Scanner userInput = new Scanner(System.in);
    
    //firstName
    do {
    		System.out.println("Please input a first name: ");
    } while (P.setFirstName(userInput.nextLine()) == false);
    //lastName
    do {
		System.out.println("Please input a last name: ");
    } while (P.setLastName(userInput.nextLine()) == false);
    //dob
    do {
		System.out.println("Please input DOB (YYYY/MM/DD): ");
    } while (P.setDob(userInput.nextLine()) == false);   
    //bloodType
    boolean validInput;
    String input;
    do {
		System.out.println("Please input a blood type: ");
		System.out.println(P.printBloodTypes());
		input = userInput.nextLine();
		if(input.matches("[0-8]")) {
			validInput = P.setBloodType(Integer.parseInt(input));
		}
		else {
			System.out.println("Invalid input. ");
			validInput = false;
		}
    } while (validInput == false);
    //available
    do {
		System.out.println("Please input availabilty (yes or no): ");
		input = userInput.nextLine();
		if(input.equals("yes")) {
			validInput = true;
			P.setAvailable(true);
		}
		else if(input.equals("no")) {
			validInput = true;
			P.setAvailable(false);
		}
		//Invalid input
		else {
			System.out.println("Invalid input.");
			validInput = false;
		}
    } while (validInput == false);
    //Display information
    System.out.println("Information on person:");
    System.out.println(P.toString());
    userInput.close();
  }
}
