
public class Bike extends Vehicle{


	//inheritance and super used
	public Bike(String v, String m, double r, int d) {
		super(v, m, r, d);
	}


	@Override
	public double calculateRent() {

		return 0.9 * (ratePerDay * days);

	}

	@Override
	public void displayDetails() {
		System.out.println("Bike | "+ vehicleNumber + " | "+model+ " | "+"Days: "+days + " | "+"Rent: "+calculateRent()+"");

	}


}
