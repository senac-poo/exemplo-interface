package br.senac.jogo.inimigos;

public class Dragao extends Inimigo {
	
	public Dragao() {
		super("Dragao", 5, 50);
	}
	
	public Dragao(String nome) {
		super(nome, 5, 50);
	}
	
	@Override
	public void recebeAtaque(int forca) {
		if(this.estaVivo()) {
			if (desviaAtaque()) { 
				System.out.println(this.nome + " desviou do ataque!");
			} else {
				super.recebeAtaque(forca);
			}
		}
	}
	
	@Override
	public void recebeAtaque(int forca, String tipo) {
		if (tipo == "fogo") {
			System.out.println(this.nome + " recebeu ataque de fogo e nada aconteceu...");
			return;
		}
		
		recebeAtaque(forca);
	}
	
	@Override
	public void recebeAtaque(Orc orc) {		
		recebeAtaque(forca * 1,2);
	}
	
	protected boolean desviaAtaque() {
		return this.rand.nextBoolean();
	}
}
