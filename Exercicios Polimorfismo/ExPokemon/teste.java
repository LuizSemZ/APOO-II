package ExPokemon;

import java.util.Scanner;

public class teste {
	public static void main(String[] args) {
		Terra p1 = new Terra("Lucas");
		Agua p2 = new Agua("Pika");
		
		
		p1.attack(p2);
		
		System.out.println(p1.getNivelDeVida());
		
	}

}
