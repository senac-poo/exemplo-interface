package br.senac.batalhas;

import java.util.Random;

import br.senac.jogo.combatentes.Combatente;
import br.senac.jogo.combatentes.ISerVoador;

public class BatalhaDosAres {
	// Serviço => Objeto que têm regras de negócio
	// ** Poucos atributos =? Suficientes
	// ** Métodos complexos
	protected ISerVoador inimigo1;
	protected ISerVoador inimigo2;
	private Random rand = new Random();
	
	public BatalhaDosAres(Combatente inimigo1, Combatente inimigo2) {
		this.inimigo1 = (ISerVoador) inimigo1;
		this.inimigo2 = (ISerVoador) inimigo2;
	}
	
	public Combatente lutar() throws InterruptedException {
		while(batalhaContinua()) {
			int ataque = calculcarAtaque();
			//System.out.println("Será desferido um ataque de " + String.valueOf(ataque) + " pontos em " + inimigo1.getNome());
			inimigo1.recebeAtaqueAereo(ataque);
			
			ataque = calculcarAtaque();
			//System.out.println("Será desferido um ataque de " + String.valueOf(ataque) + " pontos em " + inimigo2.getNome());
			inimigo2.recebeAtaqueAereo(ataque);
			
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
