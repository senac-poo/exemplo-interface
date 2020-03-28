package br.senac.jogo.combatentes.humanos;

import java.util.Random;

import br.senac.jogo.combatentes.Humano;
import br.senac.jogo.combatentes.ISerVoador;

public class Anjo extends Humano implements ISerVoador {
	public Anjo() {
		super("Anjo");
	}
	
	@Override
	public void recebeAtaqueAereo(int ataque) {
		if(!desviaVoador()) {
			super.recebeAtaque(ataque);
		}
	}
	
	@Override
	public boolean desviaVoador() {
		Random rand = new Random();
		return (rand.nextInt(7) == 1 && vida > 20) || rand.nextInt(10) == 1;
	}
}
