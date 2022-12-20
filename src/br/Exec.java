//Main principal do jogo - O objeto game carrega as telas do jogo dinamicamente na ordem de apresentação:
//Introdução, Tela de escolha do personagem e tela principal do jogo
//O metodo que apresenta a tela de escolha trabalha com uma thread monitorando o retorno de um objeto jogador
//quando a tela é fechada. Este objeto será utilizado durante o jogo na tela principal

package br;

import java.awt.Window;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import Classes.Batalhas;
import Classes.BatalhasChefao;
import Classes.Chefao;
import Classes.Inimigo;
import Classes.Jogador;
import Classes.ListasElementos;
import br.telas.TelaHistoria;

public class Exec {
		public static void main(String[] args) {
		Jogo game = new Jogo();
		
		//Declarações iniciais da thread timer - espera antes da 1ª execução e intervalo de execução
		int delay = 100;   		
		int interval = 1000; 
		Timer timer = new Timer();
		
		//Tela de Introdução. A tela de escolha será aberta somente após a tela de introdução tiver sido encerrada
		TelaHistoria frame = new TelaHistoria();
		frame.setVisible(true);
		while(frame.isShowing()) {
		frame.setResizable(false);
		}
		
		//Execução da thread timer para abrir a tela de escolha e posteriormente a tela do jogo
		timer.scheduleAtFixedRate(new TimerTask() {
			//Definição de objetos que serão utilizados no jogo
			Jogador jogador;
			ListasElementos lstElementos = new ListasElementos();
			Batalhas batalhaInimigos = new Batalhas();
			BatalhasChefao batalhaChefao = new BatalhasChefao();
			boolean executouTelaEscolha = false;
			
			public void run() {
				//Abre a tela de escolha de personagem passando como parametro a lista de jogadores disponiveis			
				if (!executouTelaEscolha) {
					//Carrega todos os elementos do jogo utilizando metodos de lstElementos
					lstElementos.carregaListaJogador();
					lstElementos.carregaListaInimigo1();
					lstElementos.carregaListaInimigo2();
					lstElementos.carregaListaInimigo3();
					lstElementos.carregaListaChefao();
					game.abrirTelaEscolha(lstElementos.getListaJogador());
					executouTelaEscolha = true;
				}
				//Atribui a jogador o objeto de retorno da tela de escolha e abre a tela principal do jogo
				if (!game.testaTelaEscolha()) {
				  jogador = game.recebeJogador();
				  timer.cancel();
				  
				  //Tela principal do jogo - recebe como parametro todos os objetos necessários
			      game.abrirTelaJogo(jogador, lstElementos, batalhaInimigos, batalhaChefao);
				}
		    }
		}, delay, interval);
	}
}