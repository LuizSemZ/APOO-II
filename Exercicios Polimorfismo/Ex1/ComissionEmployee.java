package Ex1;


public class ComissionEmployee {

	/*************/
	/* Atributos */
	/*************/
	
	protected String firstName;
	protected String lastName;
	protected String socialSecurityNumber;
	protected double grossSales;
	protected double comissionRate;
	
	/**************/
	/* Construtor */
	/**************/
	public ComissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double comissionRate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.grossSales = grossSales;
		this.comissionRate = comissionRate;
	}
	
	/*********************/
	/* Setters e Getters */
	/*********************/
	public void setFirstName(String firstName) {
		
	}
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		
	}
	public String getLastName() {
		return lastName;
	}
	
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		
	}
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	public void setGrossSales(double grossSales) {
		
	}
	public double getGrossSales() {
		return grossSales;
	}
	
	public void setComissionRate(double comissionRate) {
		
	}
	public double getComissionRate() {
		return comissionRate;
	}
	
	/***********/
	/* Metódos */
	/***********/
	
	public double earnings() {
		return this.grossSales * this.comissionRate;
	}
	
	public String toString() {
		return "Nome: "+firstName+" "+lastName+"\n"+"SSN: "+socialSecurityNumber+"\n"+"Gross Sales: "+grossSales+"\n"+"Comission Rate: "+comissionRate+"\n"+"Earnings: "+earnings()+"\n";
	}
}
