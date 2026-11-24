package labFileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Employee[] empArray = new Employee[5];

		empArray[0] = new Employee(35345, "Anne", "Human Resources", 50000);
		empArray[1] = new Employee(35345, "Roger", "Finance", 50000);
		empArray[2] = new Employee(35345, "Ani", "Marketing", 50000);
		empArray[3] = new Employee(35345, "Stevie", "Sales", 50000);
		empArray[4] = new Employee(35345, "Mina", "Operations", 50000);

		try {


			FileOutputStream fi = new FileOutputStream("employees.dat");

			ObjectOutputStream oo = new ObjectOutputStream(fi);

			oo.writeObject(empArray);

			oo.close();

			System.out.println("Objects stored");






		} catch (Exception e) {
			System.out.println("Cannot store");
		}




		try {
			FileInputStream fi = new FileInputStream("employees.dat");
			ObjectInputStream oi = new ObjectInputStream(fi);



			Employee[] e = (Employee[]) oi.readObject();

			oi.close();

			for(int i=0; i<e.length; i++) {
				System.out.println(e[i]);
			}



		} catch (Exception e) {

			System.out.println("Can't print");

		}





	}

}
