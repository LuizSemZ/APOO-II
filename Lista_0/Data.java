
public class Data {

	private int dia, mes, ano;

	/***********/
	/* MÉTODOS */
	/***********/
	public Data() {
		setDia(dia);
		setMes(mes);
		setAno(ano);
	}

	public boolean validaData() {
		if (ano > 0) {
			if (mes >= 1 && mes <= 12) {
				if (verifica31Dias()) {
					if (dia >= 1 && dia <= 31)	
						return true;
					else 
						return false;
				}
				else if (verifica30Dias()){
					if (dia >= 1 && dia <= 30)
						return true;
					else
						return false;
				}
				else { //tratamento fevereiro
					if (verificaBissexto())
						if (dia >= 1 && dia <= 29)
							return true;
						else
							return false;
					else
						if(dia >= 1 && dia <= 28)
							return true;
						else 
							return false;
				}
			}
			else 
				return false;
		}
		else
			return false;
	}

	public String mostraData() {
		if(validaData())
			return getDia() + "/" + getMes() + "/" + getAno();
		else
			return "Data invalida";
	}

	private boolean verificaBissexto() {
		if (ano % 4 == 0) {
			if (ano % 100 != 0)
				return true;
			else 
				return false;
		}
		else if (ano % 400 == 0)
			return true;
		else
			return false;
	}
	
	private boolean verifica31Dias() {	
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
			return true;
		else
			return false;
	}
	
	private boolean verifica30Dias() {
		if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
			return true;
		else
			return false;
	}

	/*********************/
	/* GETTERS E SETTERS */
	/*********************/
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}
