package br.senac.jogo;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

import br.senac.jogo.inimigos.*;
import br.senac.jogo.inimigos.dragoes.*;

public class JogoPolimorfismo {

	private static boolean haAlgumVivo(List inimigos) {
		for(int i=0; i < inimigos.size(); i++) {
			if(((Inimigo)inimigos.get(i)).estaVivo()) { return true; }
		}
		return false;
	}
	
	public static void main(String[] args) throws InterruptedException {
		Random rand = new Random();
		List<Inimigo> inimigos = new ArrayList<Inimigo>();
		
		
		inimigos.add(new Orc());
		inimigos.add(new FuriaDaNoite());
		inimigos.add(new Ziperarrepiante());
		
		System.out.println("Iniciando jogo com os inimigos:");
		
		inimigos.forEach((inimigo)->{
			System.out.println(inimigo.getNome());
		});
		System.out.println("\n");
		
		
		// rodada		
		while(haAlgumVivo(inimigos)) {
			int ataque = rand.nextInt(10);
			System.out.println("Será desferido um ataque de " + String.valueOf(ataque) + " pontos...");
			
			inimigos.forEach((inimigo)->{
				inimigo.recebeAtaque(ataque);
				System.out.println(inimigo.getNome() + ": " + String.valueOf(inimigo.getVida()));
			});
			
			Thread.sleep(2000);
			System.out.println("\n");
		}
		
		System.out.println("Jogo finalizado!");
	}
}
