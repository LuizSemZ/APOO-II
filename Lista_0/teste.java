import java.util.Scanner;

public class teste {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String nome, departamento, rg;
		int salario, dia, mes, ano;

		Funcionario vetor[] = new Funcionario[2];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = new Funcionario();
			System.out.println("Digite o nome: ");
			nome = s.next();
			vetor[i].setNome(nome);
			System.out.println("Digite o Departamento: ");
			departamento = s.next();
			vetor[i].setDepartamento(departamento);
			System.out.println("Digite o Sálario: ");
			salario = s.nextInt();
			s.nextLine();
			vetor[i].setSalario(salario);
			System.out.println("Digite o dia de entrada: ");
			dia = s.nextInt();
			s.nextLine();
			System.out.println("Digite o mês de entrada: ");
			mes = s.nextInt();
			s.nextLine();
			System.out.println("Digite o ano de entrada: ");
			ano = s.nextInt();
			s.nextLine();
			vetor[i].setDataDeEntrada(dia, mes, ano);
			System.out.println("Digite o RG: ");
			rg = s.next();
			vetor[i].setrG(rg);
			
			vetor[i].mostra();
			System.out.println("Cadastrar novo funcionario?");
			System.out.println("1. Sim");
			System.out.println("2. Não");
			int op = s.nextInt();
			if (op == 2)
				i = 3;
		}//fim for
		
		
		/***********************/
		/* Construindo objetos */
		/***********************/
		
		
		/*f2.setNome("Fhelipe");
		f2.setDepartamento("Vendas");
		f2.setSalario(1500);
		f2.setDataDeEntrada(29, 2, 2016);
		f2.setrG("4567842/MS");
		*/
		
		
		
		
		
		
		
	}

}
