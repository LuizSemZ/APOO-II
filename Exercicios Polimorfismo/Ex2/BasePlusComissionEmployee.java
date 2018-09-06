package Ex2;



public class BasePlusComissionEmployee {

	/*************/
	/* Atributos */
	/*************/
	private double baseSalary;
	private ComissionEmployee comissionEmplyoee;
	
	public BasePlusComissionEmployee(ComissionEmployee comissionEmployee, double baseSalary) {
		this.comissionEmplyoee = comissionEmployee;
		this.baseSalary = baseSalary;
	}
	

	/*************/
	/* Métodos */
	/*************/
	
	public double earnings() {
		return comissionEmplyoee.earnings() + baseSalary;
		
	}
	
	public String toString() {
		return comissionEmplyoee.toString() + "Base Salary: " + baseSalary;
	}

}
