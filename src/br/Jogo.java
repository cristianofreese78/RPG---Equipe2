package br;


import br.telas.TelaAbertura;
import br.telas.TelaEscolhaPersonagem;
import br.telas.TelaJogo;


public class Jogo {

	private TelaAbertura telaAbertura;
	private TelaEscolhaPersonagem telaEscolha;
	private TelaJogo telaJogo;
		
	public Jogo() {
		telaAbertura = new TelaAbertura();
		telaEscolha = new TelaEscolhaPersonagem();
		telaJogo = new TelaJogo();
	}
	
	public TelaJogo getTelaJogo() {
		return telaJogo;
	}

	public void setTelaJogo(TelaJogo telaJogo) {
		this.telaJogo = telaJogo;
	}



	public TelaAbertura getTelaAbertura() {
		return telaAbertura;
	}

	public void setTelaAbertura(TelaAbertura telaAbertura) {
		this.telaAbertura = telaAbertura;
	}

	public TelaEscolhaPersonagem getTelaEscolha() {
		return telaEscolha;
	}

	public void setTelaEscolha(TelaEscolhaPersonagem telaEscolha) {
		this.telaEscolha = telaEscolha;
	}

	
	
	
}
