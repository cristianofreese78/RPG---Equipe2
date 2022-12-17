package br;


import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import Classes.Batalhas;
import Classes.BatalhasChefao;
import Classes.Chefao;
import Classes.Inimigo;
import Classes.Jogador;
import Classes.ListasElementos;
import br.telas.TelaAbertura;
import br.telas.TelaEscolhaPersonagem;
import br.telas.TelaHistoria;
import br.telas.TelaJogo;


public class Jogo {
	private TelaHistoria telaHistoria;
	private TelaAbertura telaAbertura;
	private TelaEscolhaPersonagem telaEscolha;
	private TelaJogo telaJogo;
	boolean aguarda = true;
		
	public Jogo() {
	}
	
	public void abrirTelaHistoria() {
		telaHistoria = new TelaHistoria();
	}
	
	public void abrirTelaAbertura(){
		telaAbertura = new TelaAbertura();
	}
	
	public void abrirTelaEscolha(ArrayList<Jogador> lstJog) {
		telaEscolha = new TelaEscolhaPersonagem(lstJog);
	}
		
	public boolean testaTelaEscolha() {
		return telaEscolha.isShowing(); 
	}
	
	public void abrirTelaJogo(Jogador jog, ListasElementos lstElem, Batalhas btlInimigos, BatalhasChefao btlChefao) {
		telaJogo = new TelaJogo(jog, lstElem, btlInimigos, btlChefao);
	}
	
	public Jogador recebeJogador() {
		return telaEscolha.getJogAux();
	}
	
}
