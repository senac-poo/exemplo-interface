package br.senac.jogo.combatentes;

import java.util.Random;

public interface ISerVoador {
	default boolean desviaVoador() {
		Random rand = new Random();
		return rand.nextInt(5) == 1;
	}
	
	void recebeAtaqueAereo(int ataque);
}
