package Ex7;

import java.util.Date;

public class Colecionavel {
	private static int idGlobal;
	private int id;
	private String nome;
	private Date data;
	private String[] autores;
	
	public Colecionavel(String nome, Date data, String[] autores) {
		this.id = this.idGlobal;
		idGlobal++;
		
		this.nome = nome;
		this.data = data;
		this.autores = autores;
	}
	
	
	/*********************/
	/* Getters e Setters */
	/*********************/
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public Date getData() {
		return data;
	}
	public String[] getAutores() {
		return autores;
	}
	

}
