
public class Car extends Vehicle {


	private double insCharge;


	//inheritance and super used
	public Car(String v, String m, double r, int d, double i) {
		super(v, m, r, d);
		this.insCharge = i;
	}


	@Override
	public double calculateRent() {

		return (ratePerDay * days) + (insCharge * days);

	}

	@Override
	public void displayDetails() {

		System.out.println("Car | "+ vehicleNumber + " | "+model+ " | "+"Days: "+days + " | "+"Rent: "+calculateRent()+"");


	}


}
