package Classes;

import java.util.ArrayList;

public class MainTeste {

	public static void main(String[] args) {
		ArrayList<Jogador> listaJogador =  new ArrayList<>();
		ArrayList<Inimigo> listaInimigo =  new ArrayList<>();		
		ArrayList<Chefao> listaChefao =  new ArrayList<>();	
				
		//Cadastro de jogadores no array list listaJogador utilizando construtor
		listaJogador.add(new Jogador("Cavaleiro", 100, 10, "Golpe de Espada", 20, 0, 0));
		//Efeito: Sangramento - Causa 5 a mais de dano por rodada
		listaJogador.add(new Jogador("Samurai", 110, 9, "Lâmina Mortal", 18, 0, 0));
		//Efeito: Chance de dano Crítico - tem 25% de chance de causar um dano crítico dobrando o valor do seu ataque
		listaJogador.add(new Jogador("Monge", 90, 12, "Ataque Concentrado", 22, 0, 0));
		//Efeito : Atordoamento - Tem 25% de chance de atordoar o inimigo fazendo com que o inimigo não ataque na próxima rodada
 		listaJogador.add(new Jogador("Caçador", 95, 11, "Sedento por Luta", 19, 0, 0));
		//Efeito : Recuperação de vida - Recupera 10% do dano causado.
 		
 		//Cadastro de inimigos no array list listaInimigo utilizando construtor
 		listaInimigo.add(new Inimigo("Slime", 25, 5));
 		listaInimigo.add(new Inimigo("Slime de lama", 25, 10));
 		listaInimigo.add(new Inimigo("Lobisomen", 40, 20));
 		listaInimigo.add(new Inimigo("Zumbi", 35, 15));
 		listaInimigo.add(new Inimigo("Duende", 30, 10));
 		listaInimigo.add(new Inimigo("Globin", 35, 15));
 		listaInimigo.add(new Inimigo("Espantalho Almadiçoado", 40, 10));
 		
 		//Cadastro de chefoes no array list listaChefao utilizando construtor
 		listaChefao.add(new Chefao("Bárbaro", 60, 30, "Padrão", 40));
 		listaChefao.add(new Chefao("Ancião", 80, 40, "Padrão", 55));
 		listaChefao.add(new Chefao("Rei Esqueleto", 110, 50, "Passiva Fúria do Rei", 60));
 		//Efeito : PASSIVA- FURIA DO REI - A cada turno o REI DESTRUÍDO AUMENTA EM 10% o seu dano.
 		
 		//Visualização das listas
 		System.out.println(listaJogador.size());
 		System.out.println(listaJogador.toString());
 		
 		System.out.println(listaInimigo.size());
 		System.out.println(listaInimigo.toString());
 		
 		System.out.println(listaChefao.size());
 		System.out.println(listaChefao.toString());
 		
 		
 		// Lista array de danos de um jogador para utilizar durante a batalha 
 		System.out.println(listaJogador.get(0).getNome());
 		System.out.print("Dano extra por rodada: ");
 		System.out.println(listaJogador.get(0).getEfeitosAtaqueEspecial()[0]);
 		System.out.print("% de chance de dano crítico: ");
 		System.out.println(listaJogador.get(0).getEfeitosAtaqueEspecial()[1]);
 		System.out.print("x vezes de dano por rodada: ");
 		System.out.println(listaJogador.get(0).getEfeitosAtaqueEspecial()[2]);
 		System.out.print("% de chance de bloqueio do adversário: ");
 		System.out.println(listaJogador.get(0).getEfeitosAtaqueEspecial()[3]);
 		System.out.print("Rodadas de bloqueio do adversário: ");
 		System.out.println(listaJogador.get(0).getEfeitosAtaqueEspecial()[4]);
 		System.out.print("Nivel de recuperação de dano: ");
 		System.out.println(listaJogador.get(0).getEfeitosAtaqueEspecial()[5]);
 		System.out.print("% de dano adicional por rodada: ");
 		System.out.println(listaJogador.get(0).getEfeitosAtaqueEspecial()[6]);
 		System.out.print("Dano padrão: ");
 		System.out.println(listaJogador.get(0).getEfeitosAtaqueEspecial()[7]);
 		

 		
 		
 		/*
 		//Implementação de teste
 		Jogador samurai = new Jogador();
		// Jogador samurai = new Jogador("Samurai", 110, 9, 18);
		Inimigo slime = new Inimigo();
		// Inimigo slime = new Inimigo("Slime", 25, 5);
		Chefao barbaro = new Chefao();
		// Chefao barbaro = new Chefao("Bárbaro", 60, 30, 40);
		
		//Dados slime
		slime.setNome("Slime");
		slime.setPtsVida(25);
		slime.setDnAtaqueBasico(5);
		
		//Dados bárbaro
		barbaro.setNome("Bárbaro");
		barbaro.setPtsVida(60);
		barbaro.setDnAtaqueBasico(30);
		barbaro.setTpAtaqueEspecial("Fúria do Rei");
		barbaro.setDnAtaqueEspecial(40);
		
		System.out.println(samurai.getNome());
		System.out.println(samurai.getPtsVida());
		System.out.println(samurai.getDnAtaqueBasico());
		System.out.println(samurai.getNvlJogador());
		System.out.println(samurai.getPtsExperiencia());
		System.out.println(samurai.getDnAtaqueEspecial());
		System.out.println(samurai.getTpAtaqueEspecial());
		
		System.out.println(slime.getNome());
		System.out.println(slime.getPtsVida());
		System.out.println(slime.getDnAtaqueBasico());
		
		System.out.println(barbaro.getNome());
		System.out.println(barbaro.getPtsVida());
		System.out.println(barbaro.getDnAtaqueBasico());
		System.out.println(barbaro.getDnAtaqueEspecial());
		System.out.println(barbaro.getTpAtaqueEspecial());
		*/
	}
}
