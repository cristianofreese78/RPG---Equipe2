package Classes;

import java.util.Random;
import java.util.Scanner;

public class BatalhasChefao {
	
	public static  int calcularChance() {
		Random gerador = new Random();
		int numeroEscolhido = gerador.nextInt(100);
		return numeroEscolhido;
	}
	
	public static int gerador() {
		Random gerador = new Random();
		return gerador.nextInt(2) + 1;
	}
	
	public static int passivas(Jogador jogador, Chefao chefao, int numeroEscolhido, int atordoamento,int critico) {
		int vida = jogador.getPtsVida();
		int vidaInimigo = chefao.getPtsVida();
		if(jogador.getNome() == "Cavaleiro") {
			System.out.println("Efeito passivo: Sangramento");
			System.out.println("O chefão perdeu 5 de vida");
			jogador.setSangramento(1);
			return vidaInimigo -= jogador.getDnAtaqueEspecial();
		}else if(jogador.getNome() == "Samurai") {
			if(numeroEscolhido <= 25) {
			System.out.println("O Samurai acertou um ataque crítico ! ");
			System.out.println("Dano: "+jogador.getDnAtaqueEspecial()*2);
			jogador.setCritico(1);
			return critico = 1;
			}else{
				return critico = 0;
			}
		}else if(jogador.getNome() == "Monge"){
			if(numeroEscolhido <= 25) {
				System.out.println("O NÚMERO ESCOLHIDO FOI: "+numeroEscolhido);
			System.out.println("O Monge acertou um atordoamento !");
			System.out.println("O Chefão não atacará na próxima rodada");
			jogador.setAtordoamento(1);
			return atordoamento;
			}else {
				return atordoamento;
			}
		}else {
			jogador.setSedento(1);
			System.out.println("Efeito passivo: Sedento por luta");
			System.out.println("O Caçador recupera 10% do dano causado");
			return vida += (jogador.getDnAtaqueEspecial()*0.20);
			
		}
		
	}
	
	public void batalha(Jogador jogador, Chefao chefao) {
		Scanner scan = new Scanner(System.in);
		int vida = jogador.getPtsVida();
		int mpAtual = jogador.getMpJogador();
		int exp = jogador.getPtsExperiencia();
		int nivel = jogador.getNvlJogador();
		int qtdPocao = jogador.getPocao();
		int vidaChefao = chefao.getPtsVida();
		int expParaNivel = (int) Math.floor(100 * Math.pow(nivel, 1.5));
		int numeroEscolhido = calcularChance();
		
		int ataqueChefao = gerador();
		int mpGasto = 0;
		int danoSofrido = 0;
		int critico = 0;
		boolean flag = true;
		
		System.out.println("Você está enfrentando um chefão. Boa sorte!");
		System.out.println("----------------A vida do jogador é: "+vida);
		System.out.println("----------------O Mp do jogador é: "+jogador.getMpJogador());
		System.out.println("----------------O Nível do jogador é: "+nivel);
		System.out.println("----------------O nome do Chefão é é: "+chefao.getNome());
		System.out.println("----------------A vida do Chefão é: "+chefao.getPtsVida());
		while(vida > 0 && vidaChefao > 0 && jogador.getPtsVida()>0) {
			jogador.setAtordoamento(0);
			jogador.setCritico(0);
			jogador.setSangramento(0);
			jogador.setSedento(0);
			jogador.setMpJogador(mpAtual);
			System.out.println("(1) Aperte 1 para ataque básico (2) Aperte 2 para ataque especial: ");
			int escolherAtaque = scan.nextInt();
			switch(escolherAtaque) {
			case 1: {
				vidaChefao -= jogador.getDnAtaqueBasico();
				chefao.setPtsVida(vidaChefao);
				System.out.println("Você atacou com: Ataque Básico\nDano: "+ jogador.getDnAtaqueBasico());
				if (vidaChefao < 0) {
					vidaChefao = 0;
				}
				System.out.println("Vida do chefão: "+ vidaChefao);
				flag = true;
				jogador.setAtordoamento(0);
				break;
			}
			case 2: {
			if(jogador.getMpJogador() > 0) {
				
				vidaChefao -= jogador.getDnAtaqueEspecial(); 
				mpAtual -= 1;
				System.out.println("Você atacou com: Ataque Especial\nDano: "+ jogador.getDnAtaqueEspecial());
				
				numeroEscolhido = calcularChance();
				int passiva = passivas(jogador,chefao,numeroEscolhido,jogador.getAtordoamento(),critico);
				System.out.println("MP ATUAL É: " +mpAtual);
				jogador.setMpJogador(mpAtual);
				if (jogador.getCritico() == 1) {
					vidaChefao -= jogador.getDnAtaqueEspecial();
				}
				if (jogador.getSangramento() == 1) {
					vidaChefao -= 5;
				}
				if (jogador.getSedento() == 1) {
					vida += (jogador.getDnAtaqueEspecial()*0.1);
				}
				if (vidaChefao < 0) {
					vidaChefao = 0;
				}
				System.out.println("Vida do chefão: "+ vidaChefao);
				mpGasto += 1;
				flag = true;
				break;
			}else {
				System.out.println("Você não MP suficiente!");
				flag = false;
				break;
			}
			}
			default: {
				System.out.println("Opção Inválida");
				flag = false;
				break;
				
			}
			}
		
			if (vidaChefao > 0 && flag == true && jogador.getAtordoamento() == 0) {
				switch(ataqueChefao) { 
				case 1: {
					System.out.println("O Chefão atacou com um ataque básico");
					vida -= chefao.getDnAtaqueBasico();
					danoSofrido += chefao.getDnAtaqueBasico();
					System.out.println("Vida do jogador: "+vida);
					break;
				}
				case 2: {
					System.out.println("O Chefão atacou com um ataque especial");
					vida -= chefao.getDnAtaqueEspecial();
					danoSofrido += chefao.getDnAtaqueEspecial();
					System.out.println("Vida do jogador: "+vida);
					break;
				}
				}
			}
		}
		if(vida > 0) {
		mpAtual -= mpGasto;
		exp += 150;
		System.out.println("Parabéns, você derrotou o chefão!");
		System.out.println("O dano sofrido foi de: "+danoSofrido);
		System.out.println("Sua Experiência após a batalha: "+exp);
		System.out.println("Você gastou: "+mpGasto+" MP nesta batalha");
		jogador.setPtsVida(vida);
		jogador.setPtsExperiencia(exp);
		numeroEscolhido = calcularChance();
		if(numeroEscolhido <= 20) {
			System.out.println("Você ganhou uma poção de cura!");
			qtdPocao += 1;
			jogador.setPocao(qtdPocao);
		}
		if(exp >= expParaNivel) {
			System.out.println("Parabéns você evoluiu de nível !");
			nivel += 1;
			jogador.setPtsVida((int) (jogador.getPtsVida()* 1.1 + (nivel*1.5)));
			jogador.setMpJogador(jogador.getMpJogador()+2);
			jogador.setDnAtaqueBasico((int)(jogador.getDnAtaqueBasico()* 1.1 + (nivel*1.5)));
			jogador.setDnAtaqueEspecial((int)(jogador.getDnAtaqueEspecial()* 1.1 + (nivel*1.5)));
			System.out.println("Nível: "+nivel);
			jogador.setNvlJogador(nivel);
		}
		flag = false;
		while(flag == false && qtdPocao > 0) {
		System.out.println("Deseja utilizar uma poção de cura? Recupera 20 de vida\n1 para sim e 2 para não");
		int escolherPocao = scan.nextInt();
		switch(escolherPocao) {
		case 1:{
			System.out.println("Você escolheu utilizar uma poção");
			vida += 20;
			System.out.println("Vida do jogador: "+vida);
			jogador.setPtsVida(vida);
			qtdPocao -= 1;
			jogador.setPocao(qtdPocao);
			flag = true;
			break;
			}
		
		case 2:{
			System.out.println("Você escolheu não utilizar uma poção");
			flag = true;
			break;
		}
		default: {
			System.out.println("Opção inválida");
			break;
		}
		}
		
		}
		}
		if(vida<= 0) {
			jogador.setPtsVida(vida);
			System.out.println("Você morreu!");
		}
			}
}
			
		
		
		
	


