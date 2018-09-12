
public class Funcionario {

	private String nome;
	private String departamento;
	private double salario;
	private Data dataDeEntrada = new Data();
	private String rG;
	
	public Funcionario() {
		setNome(nome);
		setDepartamento(departamento);
		setSalario(salario);
		setrG(rG);
	}
	
	/***********/
	/* MÉTODOS */
	/***********/
	public void recebeAumento(double aumento){
		salario = salario + (salario * aumento);
	}
	
	public double calculaGanhoAnual() {
		if (dataDeEntrada.getAno() == 2018)
			return salario * (12 - dataDeEntrada.getMes());
		else
			return salario * 12;
	}
	
	public void mostra() {
		System.out.println("******************************");
		System.out.println("Dados do funcionário:");
		System.out.println("Nome: " + nome);
		System.out.println("Departamento: " + departamento);
		System.out.println("Salário: "+ salario);
		System.out.println("Data de Entrada: " + dataDeEntrada.mostraData());
		System.out.println("RG: " + rG);
		System.out.println("Ganho Anual: " + calculaGanhoAnual());
		System.out.println("******************************");
		
	}
	/*********************/
	/* GETTERS E SETTERS */
	/*********************/

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setDataDeEntrada(int dia, int mes, int ano) {
		dataDeEntrada.setDia(dia);
		dataDeEntrada.setMes(mes);
		dataDeEntrada.setAno(ano);
		
	}

	public String getrG() {
		return rG;
	}

	public void setrG(String rG) {
		this.rG = rG;
	}
	
}
