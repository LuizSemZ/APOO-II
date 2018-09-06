package Ex2;


public class Teste {

	public static void main(String[] args) {
	ComissionEmployee ce = new ComissionEmployee("Lui", "Fhelipe", "5963247800", 5000, 0.10);
	BasePlusComissionEmployee b1 = new BasePlusComissionEmployee(ce, 1000);
		
		System.out.println(b1.toString());
	

	}

}
