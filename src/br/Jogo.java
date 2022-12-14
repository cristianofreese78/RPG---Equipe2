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
	
	public void abrirTelaEscolha(ArrayList<Jogador> lstJog) {
		int delay = 100;   // tempo de espera antes da 1ª execução da tarefa.
		int interval = 1000;  // intervalo no qual a tarefa será executada.
		telaEscolha = new TelaEscolhaPersonagem(lstJog);
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
		  public void run() {
			  if (!telaEscolha.isShowing()) {timer.cancel();};
		  }
		}, delay, interval);
		
		do {timer.toString();} while (telaEscolha.isShowing());
		
			
	}
		
	public void abrirTelaJogo() {
		telaJogo = new TelaJogo();
	}
	
	public Jogador recebeJogador() {
		return telaEscolha.getJogAux();
	}
	
}
