package Classes;

import java.util.Random;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;

public class Batalhas2 {
	
	public static  int calcularChance() {
		Random gerador = new Random();
		int numeroEscolhido = gerador.nextInt(100);
		return numeroEscolhido;
	}
	public static int numeroClima() {
		Random gerador = new Random();
		int numeroClima = gerador.nextInt(3)+1;
		return numeroClima;
	}

	public static String eventoClimatico(int numeroClima, Jogador jogador, Inimigo inimigo) {
		if (numeroClima == 1 ) {
			System.out.println("Clima: Manhã\nO "+jogador.getNome()+" ganhou + 10 de vida!");
			jogador.setPtsVida(jogador.getPtsVida()+10);
			System.out.println("A vida do jogador foi para: "+jogador.getPtsVida());
		}else if (numeroClima == 2) {
			System.out.println("Clima: Tarde");
		}else if (numeroClima == 3) {
			System.out.println("Clima: Noite de lua cheia\nO inimigo "+inimigo.getNome()+" ganhou + 10 de vida!");
			inimigo.setPtsVida(inimigo.getPtsVida()+10);
			System.out.println("A vida do inimigo foi para: "+inimigo.getPtsVida());
		}
		return null;
	}
	
	public static int passivas(Jogador jogador, Inimigo inimigo, int numeroEscolhido, int atordoamento,int critico) {
		int vida = jogador.getPtsVida();
		int vidaInimigo = inimigo.getPtsVida();
		if(jogador.getNome() == "Cavaleiro") {
			System.out.println("Efeito passivo: Sangramento");
			System.out.println("O inimigo perdeu 5 de vida");
			jogador.setSangramento(1);
			return vidaInimigo -= jogador.getDnAtaqueEspecial();
		}else if(jogador.getNome() == "Samurai") {
			if(numeroEscolhido <= 25) {
			System.out.println("O Samurai acertou um ataque crítico ! ");
			System.out.println("Dano: "+jogador.getDnAtaqueEspecial()*2);
			jogador.setCritico(1);
			return critico = 1;
			}else{
				jogador.setCritico(0);
				return critico = 0;
			}
		}else if(jogador.getNome() == "Monge"){
			if(numeroEscolhido <= 25) {
			System.out.println("O Monge acertou um atordoamento !");
			System.out.println("O Inimigo não atacará na próxima rodada");
			jogador.setAtordoamento(1);
			return atordoamento;
			}else {
				jogador.setAtordoamento(0);
				return atordoamento;
			}
		}else {
			jogador.setSedento(1);
			System.out.println("Efeito passivo: Sedento por luta");
			System.out.println("O Caçador recupera 10% do dano causado");
			return vida += (jogador.getDnAtaqueEspecial()*0.20);
			
		}
		
	}
	
	public void batalha(Jogador jogador, Inimigo inimigo, JLabel[] lblJog, JProgressBar[] pgrJog, JLabel[] lblInim, JProgressBar[] pgrInim, JButton[] btnImgInim, JRadioButton[] JRadAtaq, JButton[] JButtonsAtaq, JLabel[] lblAtaq) {
		//lblJog[0] lblPersonagem, lblJog[1] lblNivelPersonagem, lblJog[2] lblMPPersonagem, lblJog[3] lblPocoes, lblJog[4] lblImgPersonagem
		//pgrJog[0] progressBarVidaPersonagem, pgrJog[1] progressExpPersonagem
		
		//lblInim[0] lblAdversario, lblInim[1] lblImgAdversario
		//pgrInim[0] progressVidaAdversario
		//btnImgInim[0] btnPocao1Adversario, btnImg[1] btnPocao2Adversario
		
		//JRadAtaq[0] rdbtnAtaqueBasico, JRadAtaq[1] rdbtnAtaqueEspecial
		//JButtonsAtaq[0] btnAtacar
		
		//lblAtaq[0] lblBatalhaSentidoAtaque, lblAtaq[1] lblBatalhaTipoAtaque, lblAtaq[2] lblBatalhaDanoAtaque
		
		// Teste
		//lblJog[0].setText("NM JOG BAT");
		//lblInim[0].setText("NM INI BAT");
		Scanner scan = new Scanner(System.in);
		int vida = jogador.getPtsVida();
		int mpAtual = jogador.getMpJogador();
		int exp = jogador.getPtsExperiencia();
		int nivel = jogador.getNvlJogador();
		int qtdPocao = jogador.getPocao();
		int vidaInimigo = inimigo.getPtsVida();
		int expParaNivel = (int) Math.floor(100 * Math.pow(nivel, 1.5));
		int numeroEscolhido = calcularChance();
		int eventos = numeroClima();
		int ataqueIniSimples = 1;
		int mpGasto = 0;
		int danoSofrido = 0;
		int critico = 0;
		boolean flag = true;
		
		//System.out.println("----------------A vida do jogador é: "+vida);
		//System.out.println("----------------O Mp do jogador é: "+jogador.getMpJogador());
		//System.out.println("----------------O Nível do jogador é: "+nivel);
		//System.out.println("----------------O nome do inimigo é: "+inimigo.getNome());
		//System.out.println("----------------A vida do "+inimigo.getNome()+" é: "+inimigo.getPtsVida());
		while(vida > 0 && vidaInimigo > 0 && jogador.getPtsVida()>0 ) {
			jogador.setAtordoamento(0);
			jogador.setCritico(0);
			jogador.setSangramento(0);
			jogador.setSedento(0);
			jogador.setMpJogador(mpAtual);
			System.out.println("(1) Aperte 1 para ataque básico (2) Aperte 2 para ataque especial: ");
			int escolherAtaque = scan.nextInt();
			switch(escolherAtaque) {
			case 1: {
				vidaInimigo -= jogador.getDnAtaqueBasico();
				inimigo.setPtsVida(vidaInimigo);
				System.out.println("Você atacou com: Ataque Básico\nDano: "+ jogador.getDnAtaqueBasico());
				if (vidaInimigo < 0) {
					vidaInimigo = 0;
				}
				System.out.println("Vida do inimigo: "+ vidaInimigo);
				flag = true;
				jogador.setAtordoamento(0);
				break;
			}
			case 2: {
			if(jogador.getMpJogador() > 0) {
				
				vidaInimigo -= jogador.getDnAtaqueEspecial(); 
				mpAtual -= 1;
				System.out.println("Você atacou com: Ataque Especial\nDano: "+ jogador.getDnAtaqueEspecial());
				numeroEscolhido = calcularChance();
				int passiva = passivas(jogador,inimigo,numeroEscolhido,jogador.getAtordoamento(),critico);
				System.out.println("MP: " +mpAtual);
				jogador.setMpJogador(mpAtual);
				if (jogador.getCritico() == 1) {
					vidaInimigo -= jogador.getDnAtaqueEspecial();
				}
				if (jogador.getSangramento() == 1) {
					vidaInimigo -= 5;
				}
				if (jogador.getSedento() == 1) {
					vida += (jogador.getDnAtaqueEspecial()*0.1);
				}
				if (vidaInimigo < 0) {
					vidaInimigo = 0;
				}
				System.out.println("Vida do inimigo: "+ vidaInimigo);
				mpGasto += 1;
				flag = true;
				break;
			}else {
				System.out.println("Você não tem MP suficiente!");
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
		
			//Temporizar 2s ou  acionar botão
			
			if (vidaInimigo > 0 && flag == true && jogador.getAtordoamento() == 0) {
				switch(ataqueIniSimples) { 
				case 1: {
					System.out.println("O inimigo atacou com um ataque básico");
					vida -= inimigo.getDnAtaqueBasico();
					danoSofrido += inimigo.getDnAtaqueBasico();
					System.out.println("Vida do jogador: "+vida);
				}
				}
			}
		}
		if(vida>0) {
		mpAtual -= mpGasto;
		exp += 50;
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
		if (eventos == 1) {
			jogador.setPtsVida(jogador.getPtsVida()-10);
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
		if(vida<=0) {
			jogador.setPtsVida(vida);
			System.out.println("Você Morreu!");
		}
			}
}
			
		
		
		
	


