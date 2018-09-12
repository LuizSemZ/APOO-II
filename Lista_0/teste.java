
public class teste {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		
		/***********************/
		/* Construindo objetos */
		/***********************/
		f1.setNome("Lui");
		f1.setDepartamento("Administrativo");
		f1.setSalario(2100);
		f1.setDataDeEntrada(12, 9, 2018);
		f1.setrG("84579823/MS");
		
		f2.setNome("Fhelipe");
		f2.setDepartamento("Vendas");
		f2.setSalario(1500);
		f2.setDataDeEntrada(29, 2, 2016);
		f2.setrG("4567842/MS");
		
		f1.calculaGanhoAnual();
		
		
		f2.mostra();
		
		
	}

}
