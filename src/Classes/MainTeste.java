package Classes;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class MainTeste {
	
	//Cadastro de jogadores no array list listaJogador utilizando construtor
	public static ArrayList<Jogador> carregaListaJogador()  {
		ArrayList<Jogador> lstAuxJogador = new ArrayList<>();
		
		//Efeito: Sangramento - Causa 5 a mais de dano por rodada
		lstAuxJogador.add(new Jogador("Cavaleiro", 100, 10, "Golpe de Espada", 20, 0, 1, 20,0,0,0,1,0,
												  "C:\\RPG---Equipe2\\src\\Img\\escolhaCavaleiro.png"));			
		//Efeito: Chance de dano Crítico - tem 25% de chance de causar um dano crítico dobrando o valor do seu ataque			
		lstAuxJogador.add(new Jogador("Samurai", 110, 9, "Lâmina Mortal", 18, 0, 1, 20,0,0,1,0,0,
												  "C:\\RPG---Equipe2\\src\\Img\\escolhaSamurai.png"));			
		//Efeito : Atordoamento - Tem 25% de chance de atordoar o inimigo fazendo com que o inimigo não ataque na próxima rodada			
		lstAuxJogador.add(new Jogador("Monge", 90, 12, "Ataque Concentrado", 22, 0, 1, 20,0,0,1,0,0,
												  "C:\\RPG---Equipe2\\src\\Img\\escolhaMonge.png"));			
		//Efeito : Recuperação de vida - Recupera 10% do dano causado.			
		lstAuxJogador.add(new Jogador("Caçador", 95, 11, "Sedento por Luta", 19, 0, 1, 20,0,0,0,0,1,
												  "C:\\RPG---Equipe2\\src\\Img\\escolhaCacador.png"));	
		
		return lstAuxJogador;
	}
	
	//Cadastro de inimigos no array list listaInimigo utilizando construtor
	public static ArrayList<Inimigo> carregaListaInimigo()  {
		ArrayList<Inimigo> lstAuxInimigo = new ArrayList<>();
		
		lstAuxInimigo.add(new Inimigo("Slime", 25, 5));
		lstAuxInimigo.add(new Inimigo("Slime de lama", 25, 10));
		lstAuxInimigo.add(new Inimigo("Lobisomen", 40, 20));
		lstAuxInimigo.add(new Inimigo("Zumbi", 35, 15));
		lstAuxInimigo.add(new Inimigo("Duende", 30, 10));
		lstAuxInimigo.add(new Inimigo("Globin", 35, 15));
		lstAuxInimigo.add(new Inimigo("Espantalho Almadiçoado", 40, 10));
 		
		return lstAuxInimigo;
	}
	
	public static ArrayList<Inimigo> carregaListaInimigo2()  {
		ArrayList<Inimigo> lstAuxInimigo2 = new ArrayList<>();
		
		lstAuxInimigo2.add(new Inimigo("Slime", 50, 7));
		lstAuxInimigo2.add(new Inimigo("Slime de lama", 50, 15));
		lstAuxInimigo2.add(new Inimigo("Lobisomen", 80, 30));
		lstAuxInimigo2.add(new Inimigo("Zumbi", 70, 22));
		lstAuxInimigo2.add(new Inimigo("Duende", 60, 15));
		lstAuxInimigo2.add(new Inimigo("Globin", 70, 22));
		lstAuxInimigo2.add(new Inimigo("Espantalho Almadiçoado", 80, 15));
 		
		return lstAuxInimigo2;
	}
	public static ArrayList<Inimigo> carregaListaInimigo3()  {
		ArrayList<Inimigo> lstAuxInimigo2 = new ArrayList<>();
		
		lstAuxInimigo2.add(new Inimigo("Slime", 75, 10));
		lstAuxInimigo2.add(new Inimigo("Slime de lama", 100, 23));
		lstAuxInimigo2.add(new Inimigo("Lobisomen", 120, 45));
		lstAuxInimigo2.add(new Inimigo("Zumbi", 100, 33));
		lstAuxInimigo2.add(new Inimigo("Duende", 90, 23));
		lstAuxInimigo2.add(new Inimigo("Globin", 105, 35));
		lstAuxInimigo2.add(new Inimigo("Espantalho Almadiçoado", 80, 25));
 		
		return lstAuxInimigo2;
	}
	
	
	//Cadastro de chefoes no array list listaChefao utilizando construtor
	public static ArrayList<Chefao> carregaListaChefao()  {
		ArrayList<Chefao> lstAuxChefao = new ArrayList<>();
		
		lstAuxChefao.add(new Chefao("Bárbaro", 80, 30, "Padrão", 40));
		lstAuxChefao.add(new Chefao("Ancião", 120, 40, "Padrão", 55));
		lstAuxChefao.add(new Chefao("Rei Esqueleto", 160, 50, "Passiva Fúria do Rei", 60));
 		//Efeito : PASSIVA- FURIA DO REI - A cada turno o REI ESQUELETO AUMENTA EM 10% o seu dano.
		
		return lstAuxChefao;
	}
	
	//Retorna um objeto Jogador com o personagem escolhido no combo box
	public static Jogador escolheJogador(ArrayList<Jogador> lstJogador)  {
		Jogador jogAux = new Jogador();
				
		Object[] opJogadores = {lstJogador.get(0).getNome(),
								lstJogador.get(1).getNome(),
								lstJogador.get(2).getNome(),
								lstJogador.get(3).getNome()};
		Object res = JOptionPane.showInputDialog(null, "Escolha um personagem" , "Personagem" ,
						JOptionPane.PLAIN_MESSAGE , null ,opJogadores,"");
		
		if (res != null) {
			for (int i=0; i <=3; i++) {
				if (res.toString().equals(lstJogador.get(i).getNome())) jogAux = lstJogador.get(i);
			}
		}
		return jogAux;
		
	}
	
	public static int expParaNivel(int nv) { // cálculo de experiência para evoluir de nível
	    return (int) Math.floor(100 * Math.pow(nv, 1.5));
	}
	


	public static void main(String[] args) {
		ArrayList<Jogador> listaJogador =  new ArrayList<>();
		ArrayList<Inimigo> listaInimigo =  new ArrayList<>();
		ArrayList<Inimigo> listaInimigo2 =  new ArrayList<>();
		ArrayList<Inimigo> listaInimigo3 =  new ArrayList<>();
		ArrayList<Chefao> listaChefao =  new ArrayList<>();
		Jogador jogador;
		Batalhas ba = new Batalhas();
		BatalhasChefao bac = new BatalhasChefao();
		
		listaJogador = carregaListaJogador();
		listaInimigo = carregaListaInimigo();
		listaInimigo2 = carregaListaInimigo2();
		listaInimigo3 = carregaListaInimigo3();
		listaChefao = carregaListaChefao();
		
		
	
		
		//Dados inicais do jogador
		jogador = escolheJogador(listaJogador); //System.out.println(jogador.toString());
		while(listaInimigo.size() > 0 && jogador.getPtsVida() > 0 ) {
			Random gerador = new Random();
			int escolhaArray = gerador.nextInt(listaInimigo.size());
			Inimigo inimigo = listaInimigo.get(escolhaArray); System.out.println(inimigo.toString());
			
			
			ba.batalha(jogador,inimigo);
			listaInimigo.remove(escolhaArray);
			System.out.println("VIDA DO JOGADOR: "+jogador.getPtsVida());
			System.out.println("MP DO JOGADOR: "+jogador.getMpJogador());
			System.out.println("EXP DO JOGADOR: "+jogador.getPtsExperiencia());
			System.out.println("NÍVEL DO JOGADOR: "+jogador.getNvlJogador());
			System.out.println("QUANTIDADE DE POÇÕES: "+jogador.getPocao());
			System.out.println("====================");
		}
		if(jogador.getPtsVida() > 0) {
			bac.batalha(jogador,listaChefao.get(0));
			}
		while(listaInimigo2.size() > 0 && jogador.getPtsVida() > 0 ) {
			Random gerador = new Random();
			int escolhaArray2 = gerador.nextInt(listaInimigo2.size());
			Inimigo inimigo = listaInimigo2.get(escolhaArray2); System.out.println(inimigo.toString());
			ba.batalha(jogador,inimigo);
			listaInimigo2.remove(escolhaArray2);
			System.out.println("VIDA DO JOGADOR: "+jogador.getPtsVida());
			System.out.println("MP DO JOGADOR: "+jogador.getMpJogador());
			System.out.println("EXP DO JOGADOR: "+jogador.getPtsExperiencia());
			System.out.println("NÍVEL DO JOGADOR: "+jogador.getNvlJogador());
			System.out.println("QUANTIDADE DE POÇÕES: "+jogador.getPocao());
			System.out.println("====================");
			
			
		}
		if(jogador.getPtsVida() > 0) {
			bac.batalha(jogador,listaChefao.get(1));
		}
		while(listaInimigo3.size() > 0 && jogador.getPtsVida() > 0 ) {
			Random gerador = new Random();
			int escolhaArray3 = gerador.nextInt(listaInimigo3.size());
			Inimigo inimigo = listaInimigo3.get(escolhaArray3); System.out.println(inimigo.toString());
			System.out.println("Inimigos nível 3");
			ba.batalha(jogador,inimigo);
			listaInimigo3.remove(escolhaArray3);
			System.out.println("VIDA DO JOGADOR: "+jogador.getPtsVida());
			System.out.println("MP DO JOGADOR: "+jogador.getMpJogador());
			System.out.println("EXP DO JOGADOR: "+jogador.getPtsExperiencia());
			System.out.println("NÍVEL DO JOGADOR: "+jogador.getNvlJogador());
			System.out.println("QUANTIDADE DE POÇÕES: "+jogador.getPocao());
			System.out.println("====================");
		}
		if(jogador.getPtsVida() > 0) {
		System.out.println("É hora de enfrentar o Rei Esqueleto!");
		bac.batalha(jogador,listaChefao.get(2));
		}
		if(jogador.getPtsVida() > 0) {
			
			System.out.println("Parabéns, você finalizou o jogo !");
		}else {
			System.out.println("Fim de Jogo!");
		}
		//Jogador sofreu 10 de dano, aumenta 1 nivel de experiencia, utilizou um ataque especial
		/*
		 * jogador.atualizaDados(10, 'd', 1, 's', 1, 'd');
		 * System.out.println(jogador.toString());
		 * 
		 * //Jogador sofreu 25 de dano, aumenta 0 nivel de experiencia, não utilizou um
		 * ataque especial jogador.atualizaDados(25, 'd', 0, 's', 0, 'd');
		 * System.out.println(jogador.toString());
		 * 
		 * //Jogador recuperou 30 de dano, aumenta 1 nivel de experiencia, utilizou um
		 * ataque especial jogador.atualizaDados(30, 's', 1, 's', 1, 'd');
		 * System.out.println(jogador.toString());
		 * 
		 * //Jogador sofreu um dano critico de 100, aumenta 0 nivel de experiencia, não
		 * utilizou um ataque especial //Teste de condição para verificar se o
		 * personagem está vivo if (jogador.atualizaDados(90, 'd', 0, 's', 0, 'd'))
		 * System.out.println(jogador.getNome() + " está vivo"); else
		 * System.out.println(jogador.getNome() + " morreu");
		 * System.out.println(jogador.toString());
		 * 
		 * 
		 * //Dados inicais do inimigo System.out.println("-----Inimigo escolhido");
		 * 
		 * 
		 * //Inimigo sofreu 10 de dano inimigo.atualizaDados(10, 'd');
		 * System.out.println(inimigo.toString());
		 * 
		 * //Inimigo recuperou 5 de dano inimigo.atualizaDados(5, 's');
		 * System.out.println(inimigo.toString());
		 * 
		 * //Inimigo sofreu um dano de 20 //Teste de condição para verificar se o
		 * inimigo está vivo if (inimigo.atualizaDados(20, 'd'))
		 * System.out.println(inimigo.getNome() + " está vivo"); else
		 * System.out.println(inimigo.getNome() + " morreu");
		 * System.out.println(inimigo.toString());
		 * 
		 * 
		 * //Dados inicais do chefao Chefao chefao = listaChefao.get(0);
		 * System.out.println(chefao.toString());
		 * 
		 * //Inimigo sofreu 30 de dano chefao.atualizaDados(30, 'd');
		 * System.out.println(chefao.toString());
		 * 
		 * //Inimigo sofreu 10 de dano chefao.atualizaDados(10, 'd');
		 * System.out.println(chefao.toString());
		 * 
		 * //Chefao sofreu um dano de 80 //Teste de condição para verificar se o chefao
		 * está vivo if (chefao.atualizaDados(80, 'd'))
		 * System.out.println(chefao.getNome() + " está vivo"); else
		 * System.out.println(chefao.getNome() + " morreu");
		 * System.out.println(chefao.toString());
		 */
		
		
		
		
 		
 		
 		
 		
 		
		/*	Testes gerais
 		//Visualização das listas
 		System.out.println(listaJogador.size());
 		System.out.println(listaJogador.toString());
 		
 		System.out.println(listaInimigo.size());
 		System.out.println(listaInimigo.toString());
 		
 		System.out.println(listaChefao.size());
 		System.out.println(listaChefao.toString());
 		
 		//Lista array de danos de jogador escolhido no metodo escolheJogador
 	 	System.out.println(jogador.getNome());
 	 	System.out.print("Dano extra por rodada: ");
 	 	System.out.println(jogador.getEfeitosAtaqueEspecial()[0]);
 	 	System.out.print("% de chance de dano crítico: ");
 	 	System.out.println(jogador.getEfeitosAtaqueEspecial()[1]);
 	 	System.out.print("x vezes de dano por rodada: ");
 	 	System.out.println(jogador.getEfeitosAtaqueEspecial()[2]);
 	 	System.out.print("% de chance de bloqueio do adversário: ");
 	 	System.out.println(jogador.getEfeitosAtaqueEspecial()[3]);
 	 	System.out.print("Rodadas de bloqueio do adversário: ");
 	 	System.out.println(jogador.getEfeitosAtaqueEspecial()[4]);
 	 	System.out.print("Nivel de recuperação de dano: ");
 	 	System.out.println(jogador.getEfeitosAtaqueEspecial()[5]);
 	 	System.out.print("% de dano adicional por rodada: ");
 	 	System.out.println(jogador.getEfeitosAtaqueEspecial()[6]);
 	 	System.out.print("Dano padrão: ");
 	 	System.out.println(jogador.getEfeitosAtaqueEspecial()[7]);
 		
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
		System.out.println(samurai.getMpJogador());
		
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
