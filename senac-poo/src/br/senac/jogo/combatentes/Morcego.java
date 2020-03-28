package br.senac.jogo.combatentes;

public class Morcego extends Combatente 
	implements ISerVoador {
	
	public Morcego() {
		super("Morcego", 5, 50);
	}
	
	public Morcego(String nome) {
		super(nome, 5, 50);
	}

	@Override
	public void recebeAtaqueAereo(int ataque) {
		if(!desviaVoador()) {
			super.recebeAtaque(ataque);
		}
	}
}
