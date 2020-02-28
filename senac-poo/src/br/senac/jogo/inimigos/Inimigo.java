package br.senac.jogo.inimigos;

import java.util.Random;

public class Inimigo {
	protected Random rand = new Random();
	protected int vida;
	protected int forca;
	protected String nome;
	
	public Inimigo() {
		this.vida = 50 + rand.nextInt(50);
		this.forca = 5 + rand.nextInt(5);
		this.nome = "Inimigo";
	}
	
	// construtor estatico
	public Inimigo(String nome, int forcaMinima, int vidaMinima) {
		this.nome = nome;
		this.forca = forcaMinima + rand.nextInt(50);
		this.vida = vidaMinima + rand.nextInt(5);
	}
	
	public void recebeAtaque(int forca) {
		if(forca > vida) {
			vida = 0;
		} else {
			System.out.println(this.nome + " recebeu ataque de " + String.valueOf(forca));
			vida -= forca;
		}
	}
	
	public void recebeAtaque(int forca, String tipo) {
		recebeAtaque(forca);
	}
	
	public int ataca() {
		return (int) (forca * rand.nextFloat());
	}
	
	public boolean estaMorto() {
		return this.vida == 0;
	}
	
	public boolean estaVivo() {
		return this.vida > 0;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getVida() {
		return vida;
	}
}
