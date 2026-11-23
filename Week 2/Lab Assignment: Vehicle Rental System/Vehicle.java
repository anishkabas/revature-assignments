
public class Vehicle {

	
	//vehicleNumber, model, ratePerDay, and days
	
	String vehicleNumber;
	String model;
	double ratePerDay;
	int days;
	
	public Vehicle(String v, String m, double r, int d) {
		
		this.vehicleNumber = v;
		this.model = m;
		this.ratePerDay = r;
		this.days = d;
		
	}
	
	
	public double calculateRent() {
		
		return ratePerDay * days;
		
	}
	
	public void displayDetails() {
		
		System.out.println("Vehicle details");
		
	}

}
