package ExPokemon;

public class Terra extends Pokemon {
	

	public Terra(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack(Pokemon atacado) {
		if (atacado instanceof Agua) {
			this.setNivelDeVida(this.getNivelDeVida() -25);
		}
		else if(atacado instanceof Terra) {
			this.setNivelDeVida(this.getNivelDeVida() -15);
			atacado.setNivelDeVida(atacado.getNivelDeVida() -10);
		}
		else if(atacado instanceof Eletrecidade) {
			atacado.setNivelDeVida(atacado.getNivelDeVida() -25);
		}
		else if(atacado instanceof Normal) {
			atacado.setNivelDeVida(atacado.getNivelDeVida() -10);
		}
		else if(atacado instanceof Fogo) {
			atacado.setNivelDeVida(atacado.getNivelDeVida() -25);
		}
		
	}

}
