package br;


import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import Classes.Jogador;
import br.telas.TelaAbertura;
import br.telas.TelaEscolhaPersonagem;
import br.telas.TelaJogo;


public class Jogo {

	private TelaAbertura telaAbertura;
	private TelaEscolhaPersonagem telaEscolha;
	private TelaJogo telaJogo;
	boolean aguarda = true;
		
	public Jogo() {
	}
	
	public void abrirTelaAbertura() {
		telaAbertura = new TelaAbertura();
	}
	
	public void abrirTelaEscolha(ArrayList<Jogador> lstJog) {
		telaEscolha = new TelaEscolhaPersonagem(lstJog);
	}
		
	public boolean testaTelaEscolha() {
		return telaEscolha.isShowing(); 
	}
	public void abrirTelaJogo() {
		telaJogo = new TelaJogo();
	}
	
	public Jogador recebeJogador() {
		return telaEscolha.getJogAux();
	}
	
}
