package ExPokemon;

public class Agua extends Pokemon{
	

	public Agua(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack(Pokemon atacado) {
		if (atacado instanceof Agua) {
			this.setNivelDeVida(this.getNivelDeVida() -15);
			atacado.setNivelDeVida(atacado.getNivelDeVida() -10);
		}
		else if(atacado instanceof Terra) {
			atacado.setNivelDeVida(atacado.getNivelDeVida() - 25);
		}
		else if(atacado instanceof Eletrecidade) {
			this.setNivelDeVida(this.getNivelDeVida() -25);
		}
		else if(atacado instanceof Normal) {
			atacado.setNivelDeVida(atacado.getNivelDeVida() -10);
		}
		else if(atacado instanceof Fogo) {
			atacado.setNivelDeVida(atacado.getNivelDeVida() -25);
		}
		
	}
}
