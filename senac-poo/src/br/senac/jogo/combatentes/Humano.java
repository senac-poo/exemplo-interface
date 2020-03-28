package br.senac.jogo.combatentes;

public abstract class Humano extends Combatente {
	public Humano() {
		super("Humano", 10, 30);
	}
	
	public Humano(String nome) {
		super(nome, 10, 30);
	}
}
