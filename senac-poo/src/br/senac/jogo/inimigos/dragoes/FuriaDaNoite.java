package br.senac.jogo.inimigos.dragoes;

import br.senac.jogo.inimigos.Dragao;

public class FuriaDaNoite extends Dragao {	
	public FuriaDaNoite() {
		super("Fúria da Noite");
	}
	
	// furia da noite desvia mais dos ataques
	// desvia de 7 em 10 ataques
	protected boolean desviaAtaque() {
		return this.rand.nextInt(10) < 7;
	}
}
