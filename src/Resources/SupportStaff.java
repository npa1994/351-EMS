package EMS;

public class SupportStaff extends Person {
	private String skills;
	private double hoursDeployment;
	
	//Setters and Getters
	public boolean setSkills(String skills) {
		this.skills = skills;
		return true;
	}
	public String getSkills() {
		return this.skills;
	}
	public boolean setHoursDeployment(double hoursDeployment) {
		this.hoursDeployment = hoursDeployment;
		return true;
	}
	
}
