package br.senac.batalhas;

import java.util.Random;

import br.senac.jogo.combatentes.*;

public class Batalha {
	// Serviço => Objeto que têm regras de negócio
	// ** Poucos atributos =? Suficientes
	// ** Métodos complexos
	protected Combatente inimigo1;
	protected Combatente inimigo2;
	private Random rand = new Random();
	
	public Batalha(Combatente inimigo1, Combatente inimigo2) {
		this.inimigo1 = inimigo1;
		this.inimigo2 = inimigo2;
	}
	
	public Combatente lutar() throws InterruptedException {
		while(batalhaContinua()) {
			int ataque = calculcarAtaque();
			//System.out.println("Será desferido um ataque de " + String.valueOf(ataque) + " pontos em " + inimigo1.getNome());
			inimigo1.recebeAtaque(ataque);
			
			ataque = calculcarAtaque();
			//System.out.println("Será desferido um ataque de " + String.valueOf(ataque) + " pontos em " + inimigo2.getNome());
			inimigo2.recebeAtaque(ataque);
			
			//System.out.println("Energia dos inimigos:");
			//System.out.println(inimigo1.getNome() + ": " + String.valueOf(inimigo1.getVida()));
			//System.out.println(inimigo2.getNome() + ": " + String.valueOf(inimigo2.getVida()));
			
			Thread.sleep(2000);
			//System.out.println("\n");
		}
		
		return retonarVencedor();
	}
	
	protected boolean batalhaContinua() {
		return inimigo1.estaVivo() && inimigo2.estaVivo();
	}
	
	
	protected Combatente retonarVencedor() {
		return (inimigo1.estaVivo() ? inimigo1 : inimigo2);
	}
	
	protected int calculcarAtaque() {
		return rand.nextInt(10);
	}
	
}
