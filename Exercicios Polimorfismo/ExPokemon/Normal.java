package ExPokemon;

public class Normal extends Pokemon {

	public Normal(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack(Pokemon atacado) {
		if (atacado instanceof Agua) {
			this.setNivelDeVida(this.getNivelDeVida() -10);
		}
		else if(atacado instanceof Terra) {
			this.setNivelDeVida(this.getNivelDeVida() -10);
		}
		else if(atacado instanceof Eletrecidade) {
			this.setNivelDeVida(this.getNivelDeVida() -10);
		}
		else if(atacado instanceof Normal) {
			this.setNivelDeVida(this.getNivelDeVida() -15);
			atacado.setNivelDeVida(atacado.getNivelDeVida() -10);
		}
		else if(atacado instanceof Fogo) {
			this.setNivelDeVida(this.getNivelDeVida() -5);
			atacado.setNivelDeVida(atacado.getNivelDeVida() -10);
		}

	}

}
