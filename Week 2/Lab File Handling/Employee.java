package labFileHandling;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private int employeeID;
	private String empName;
	private String depName;
	private double empSalary;
	
	private static final long serialVersionUID = 10L;
	
	public Employee(int id, String name, String dep, double sal) {
		this.employeeID = id;
		this.empName = name;
		this.depName = dep;
		this.empSalary = sal;
	}
	
	
	public String toString() {
		return "Employee ID: "+employeeID+", Employee name: "+empName+", Department name: "+depName+", Employee salary: "+empSalary;
		
		
	}

	public static void main(String[] args) {
	
		
		
		
	}

}

