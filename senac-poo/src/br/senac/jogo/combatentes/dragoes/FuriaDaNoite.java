package br.senac.jogo.combatentes.dragoes;

import br.senac.jogo.combatentes.Dragao;

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
