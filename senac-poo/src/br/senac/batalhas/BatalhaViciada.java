package br.senac.batalhas;

import br.senac.jogo.combatentes.Combatente;

public class BatalhaViciada extends Batalha {

	public BatalhaViciada(Combatente inimigo1, Combatente inimigo2) {
		super(inimigo1, inimigo2);
	}

	public Combatente lutar() throws InterruptedException {
		while(batalhaContinua()) {
			int ataque = calculcarAtaque();
			//System.out.println("Será desferido um ataque de " + String.valueOf(ataque) + " pontos em " + inimigo1.getNome());
			inimigo1.recebeAtaque(ataque);
			
			ataque = calculcarAtaque() + 20;
			//System.out.println("Será desferido um ataque de " + String.valueOf(ataque) + " pontos em " + inimigo2.getNome());
			inimigo2.recebeAtaque(ataque);
			
			//System.out.println("Energia dos inimigos:");
			//System.out.println(inimigo1.getNome() + ": " + String.valueOf(inimigo1.getVida()));
			//System.out.println(inimigo2.getNome() + ": " + String.valueOf(inimigo2.getVida()));
			
			//Thread.sleep(2000);
			//System.out.println("\n");
		}
		
		return retonarVencedor();
	}	
	
}
