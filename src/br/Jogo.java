//Esta classe possui como atributos todas as telas que compôem o jogo e metodos auxiliares utilizados na main
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
import br.telas.TelaEscolhaPersonagem;
import br.telas.TelaHistoria;
import br.telas.TelaJogo;


public class Jogo {
	private TelaHistoria telaHistoria;			//Tela de Introdução
	private TelaEscolhaPersonagem telaEscolha;	//Tela de escolha de personagem
	private TelaJogo telaJogo;					//Tela principal do jogo
	boolean aguarda = true;
		
	public Jogo() {
	}
	
	//Tela de Introdução
	public void abrirTelaHistoria() {
		telaHistoria = new TelaHistoria();
	}
	
	//Tela de Escolha de Personagem com a lista de jogadores disponiveis
	public void abrirTelaEscolha(ArrayList<Jogador> lstJog) {
		telaEscolha = new TelaEscolhaPersonagem(lstJog);
	}
	
	//Testa se a escolha de personagem foi concluida
	public boolean testaTelaEscolha() {
		return telaEscolha.isShowing(); 
	}
	
	//Tela do jogo contendo todos os objetos necessários para as batalhas
	public void abrirTelaJogo(Jogador jog, ListasElementos lstElem, Batalhas btlInimigos, BatalhasChefao btlChefao) {
		telaJogo = new TelaJogo(jog, lstElem, btlInimigos, btlChefao);
	}
	
	//Retorno o objeto jogador escolhido na tela de escolha
	public Jogador recebeJogador() {
		return telaEscolha.getJogAux();
	}
	
}
