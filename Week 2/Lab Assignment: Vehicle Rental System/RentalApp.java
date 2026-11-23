import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class RentalApp {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		List<Vehicle> vlist = new ArrayList<>();
		
		System.out.println("Enter number of vehicles: ");
		
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			
			int type;
			
			while(true) {
			System.out.println("Enter type (1-Car, 2-Bike): ");
		 type = sc.nextInt();
			if((type!=1) && (type!= 2)) {
				System.out.println("Error.");
				continue;
			} else {
				
				sc.nextLine();
				break;
			}
			
			}
			
			System.out.println("Enter Vehicle Number: ");
			String vehicleNumber = sc.nextLine();
			
			System.out.println("Enter Model: ");
			String model = sc.nextLine();

			System.out.println("Enter Rate per Day: ");
			double ratePerDay = sc.nextDouble();
			
			System.out.println("Enter Days: ");
			int days = sc.nextInt();
			
			if(type == 1) {
			System.out.println("Enter Insurance per Day: ");
			double insper = sc.nextDouble();
			
			Vehicle v = new Car(vehicleNumber, model, ratePerDay, days, insper);
			vlist.add(v);
			
			
			} else {
				Vehicle v = new Bike(vehicleNumber, model, ratePerDay, days);
				vlist.add(v);
			}
		}
		
		System.out.println("--- Rental Details ---");
		
		for(int i=0; i<vlist.size(); i++) {
			
			//polymorphism, depends on actual type
			vlist.get(i).displayDetails();
		}
		
	
		
		
		sc.close();

	}

}
