package ExPokemon;

public abstract class Pokemon {

	protected String nome;
	private int nivelDeVida = 100;
	private int forca = 100;
	
	public Pokemon(String nome) {
		this.nome = nome;
	}
	
	/***********/
	/* Métodos */
	/***********/
	public abstract void attack(Pokemon atacado);
	
	
	/*********************/
	/* Getters e Setters */
	/*********************/
	public int getNivelDeVida() {
		return nivelDeVida;
	}

	public void setNivelDeVida(int nivelDeVida) {
		this.nivelDeVida = nivelDeVida;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}
	
	
	
}
