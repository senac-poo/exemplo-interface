package br.senac.jogo;

import java.util.Random;

import br.senac.jogo.inimigos.Dragao;
import br.senac.jogo.inimigos.Orc;
import br.senac.jogo.inimigos.dragoes.*;

public class Jogo {

	public static void main(String[] args) throws InterruptedException {
		Random rand = new Random();
		
		// orc
		// dragao
		Orc orc = new Orc();
		FuriaDaNoite dragao = new FuriaDaNoite();
		System.out.println("Iniciando jogo com os inimigos:");
		System.out.println(orc.getNome());
		System.out.println(dragao.getNome());
		System.out.println("\n");
		
		dragao.recebeAtaque(100, "fogo");
		
		// rodada
		while(orc.estaVivo() || dragao.estaVivo()) {
			int ataque = rand.nextInt(10);
			System.out.println("Será desferido um ataque de " + String.valueOf(ataque) + " pontos...");
			orc.recebeAtaque(ataque);
			dragao.recebeAtaque(ataque);
			
			System.out.println("Energia dos inimigos:");
			System.out.println(orc.getNome() + ": " + String.valueOf(orc.getVida()));
			System.out.println(dragao.getNome() + ": " + String.valueOf(dragao.getVida()));
			
			Thread.sleep(2000);
			System.out.println("\n");
		}
		
		System.out.println("Jogo finalizado!");
	}
}
