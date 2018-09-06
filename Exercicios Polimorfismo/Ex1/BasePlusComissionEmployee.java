package Ex1;


public class BasePlusComissionEmployee extends ComissionEmployee {

	public BasePlusComissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double comissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, comissionRate);
		this.baseSalary = baseSalary;
	}

	/*************/
	/* Atributos */
	/*************/
	private double baseSalary;
	
	/*************/
	/* Métodos */
	/*************/
	public double earnings() {
		return super.earnings() + baseSalary;
	}
	
	public String toString() {
		return super.toString() + "Base Salary: " + baseSalary;
	}
	
}
