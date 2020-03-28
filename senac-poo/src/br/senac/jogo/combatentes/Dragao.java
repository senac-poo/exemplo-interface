package br.senac.jogo.combatentes;

public abstract class Dragao extends Combatente 
	implements ISerVoador {
	
	public Dragao() {
		super("Dragao", 5, 50);
	}
	
	public Dragao(String nome) {
		super(nome, 5, 50);
	}
	
	@Override
	public void recebeAtaqueAereo(int ataque) {
		if(!desviaVoador()) {
			super.recebeAtaque(ataque);
		}
	}
}
