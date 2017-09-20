package EMS;
public class Person {
  private String firstName;
  private String lastName;
  private String dob;
  private int bloodType;
  private boolean available;
//Setters and Getters
  //firstName
  public boolean setFirstName(String firstName) {
	  if(checkName(firstName)) {
		  this.firstName = firstName;
		  return true;
	  }
	  else { return false; }
  }
  public String getFirstName() {
	  return this.firstName;
  }
  //lastName
  public boolean setLastName(String lastName) {
	  if(checkName(lastName)) {
		  this.lastName = lastName;
		  return true;
	  }
	  else { return false; }
  }
  public String getLastName() {
	  return this.lastName;
  }
  //dob
  public boolean setDob(String dob) {
	  if(dob.matches("[12][09][0-9][0-9][/][01][0-9][/][0-3][0-9]")) {
		  this.dob = dob;
		  return true;
	  }
	  else { 
		  System.out.println("Invalid Date.");
		  return false; 
	  }
  }
  public String getDob() {
	  return this.dob;
  }
  //bloodType
  public boolean setBloodType(int bloodType) {
	  if(bloodType >= 0 && bloodType <= 8) {
		  this.bloodType = bloodType;
		  return true;
	  }
	  else {
		  System.out.println("Invalid blood-type given.\n" +
				  			"See printBloodTypes()");
		  return false;
	  }
  }
  public int getBloodType() {
	  return this.bloodType;
  }
  //available
  public boolean setAvailable(boolean available) {
	  return true;
  }
  public boolean getAvailabe() {
	  return this.available;
  }
//Helper functions
  //Checks if an appropriate name
  private boolean checkName(String name) {
	  if(name == null) {
		  System.out.println("Name can not be null.");
		  return false;
	  }
	  else if(name.length() < 1) {
		  System.out.println("Name must contain atleast one character.");
		  return false;
	  }
	  else if(!name.matches("[a-zA-Z-']+")) {
		  System.out.println("Name may only contain letters, dashes and apostrophes.");
		  return false;
	  }
	  //Name okay
	  else { return true; }
  }
  //Prints information for bloodType
  public String printBloodTypes() {
	  return "0 = O-negative\n" +
			  "1 = O-positive\n" +
			  "2 = A-negative\n" +
			  "3 = A-positive\n" +
			  "4 = B-negative\n" +
			  "5 = B-positive\n" +
			  "6 = AB-negative\n" +
			  "7 = AB-positive\n" +
			  "8 = Unsure";
  }
//Over-ridden functions
  public String toString() {
	  String output = "";
	  output = "First Name: " + this.firstName + "\n" +
			  	"Last Name: " + this.lastName + "\n" +
			  	"DOB: " + this.dob + "\n" +
			  	"Blood Type: " + this.bloodType + "\n" +
			  	"Availability: " + this.available + "\n";
	  return output;
  } 
}
  
  