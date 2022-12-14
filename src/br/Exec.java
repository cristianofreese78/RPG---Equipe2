package br;

import java.awt.Window;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import Classes.Jogador;

public class Exec {
	
	
	//Cadastro de jogadores no array list listaJogador utilizando construtor
		public static ArrayList<Jogador> carregaListaJogador()  {
			ArrayList<Jogador> lstAuxJogador = new ArrayList<>();
			
			lstAuxJogador.add(new Jogador("Cavaleiro", 100, 10, "Golpe de Espada", 20, 0, 1, 20,0,0,0,1,0));
			//Efeito: Sangramento - Causa 5 a mais de dano por rodada
			lstAuxJogador.add(new Jogador("Samurai", 110, 9, "Lâmina Mortal", 18, 0, 1, 20,0,0,1,0,0));
			//Efeito: Chance de dano Crítico - tem 25% de chance de causar um dano crítico dobrando o valor do seu ataque
			lstAuxJogador.add(new Jogador("Monge", 90, 12, "Ataque Concentrado", 22, 0, 1, 20,0,0,1,0,0));
			//Efeito : Atordoamento - Tem 25% de chance de atordoar o inimigo fazendo com que o inimigo não ataque na próxima rodada
			lstAuxJogador.add(new Jogador("Caçador", 95, 11, "Sedento por Luta", 19, 0, 1, 20,0,0,0,0,1));
			//Efeito : Recuperação de vida - Recupera 10% do dano causado.
			
			return lstAuxJogador;
		}

	public static void main(String[] args) {
		ArrayList<Jogador> listaJogador =  new ArrayList<>();
		
		Jogo game = new Jogo();
		
		listaJogador = carregaListaJogador();
		
		int delay = 100;   // tempo de espera antes da 1ª execução da tarefa.
		int interval = 1000;  // intervalo no qual a tarefa será executada.
		
		//game.abrirTelaAbertura();
		
		game.abrirTelaEscolha(listaJogador);
		
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			Jogador jogador;
			public void run() {
			  if (!game.testaTelaEscolha()) {
				  jogador = game.recebeJogador();
				  System.out.println(jogador.toString());
				  timer.cancel();
			      game.abrirTelaJogo();}
		    }
		}, delay, interval);
		
		
			
			
			
			
		

	}

}
