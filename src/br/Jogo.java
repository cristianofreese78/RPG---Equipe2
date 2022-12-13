package br;


import br.telas.TelaAbertura;
import br.telas.TelaEscolhaPersonagem;
import br.telas.TelaJogo;


public class Jogo {

	private TelaAbertura telaAbertura;
	private TelaEscolhaPersonagem telaEscolha;
	private TelaJogo telaJogo;
		
	/*public Jogo() {
		telaAbertura = new TelaAbertura();
		telaEscolha = new TelaEscolhaPersonagem();
		telaJogo = new TelaJogo();
	}*/
	
	public Jogo() {
	}
	
	public void abrirTelaAbertura() {
		telaAbertura = new TelaAbertura();
	}
	
	public void abrirTelaEscolha() {
		telaEscolha = new TelaEscolhaPersonagem();
	}
	
	public void abrirTelaJogo() {
		telaJogo = new TelaJogo();
	}
}
