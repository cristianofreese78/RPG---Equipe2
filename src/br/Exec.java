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
		//Cálculo de experiência para evoluir de nível
		public static int expParaNivel(int nv) { 
		    return (int) Math.floor(100 * Math.pow(nv, 1.5));
		}

		public static void main(String[] args) {
		Jogo game = new Jogo();
		
		int delay = 100;   		// Thread timer - tempo de espera antes da 1ª execução da tarefa.
		int interval = 1000;  	// Thread timer - intervalo no qual a tarefa será executada.
		Timer timer = new Timer();
		TelaHistoria frame = new TelaHistoria();
		frame.setVisible(true);
		while(frame.isShowing()) {
		frame.setResizable(false);
		}
		timer.scheduleAtFixedRate(new TimerTask() {
			Jogador jogador;
			ListasElementos lstElementos = new ListasElementos();
			Batalhas batalhaInimigos = new Batalhas();
			BatalhasChefao batalhaChefao = new BatalhasChefao();
			boolean executouTelaEscolha = false;
			
			public void run() {
				//game.abrirTelaAbertura();
				
				if (!executouTelaEscolha) {
					lstElementos.carregaListaJogador();
					lstElementos.carregaListaInimigo1();
					lstElementos.carregaListaInimigo2();
					lstElementos.carregaListaInimigo3();
					lstElementos.carregaListaChefao();
					game.abrirTelaEscolha(lstElementos.getListaJogador());
					executouTelaEscolha = true;
				}
				
				if (!game.testaTelaEscolha()) {
				  jogador = game.recebeJogador();
				  timer.cancel();
				  
			      game.abrirTelaJogo(jogador, lstElementos, batalhaInimigos, batalhaChefao);
				}
		    }
		}, delay, interval);
	}
}