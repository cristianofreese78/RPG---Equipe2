package RPG;

import java.util.Scanner;



public class Batalha extends MainRpg{
	
	int danoBatalha;
    int expBatalha;
    int mpBatalha;
	
	public void batalha(int vida, int mpJogador,int exp, int vidaInimigoInicial, int gerador,int upDano, int escolhaPer) {
		escolhaPersonagem esc = new escolhaPersonagem();
		Scanner scan = new Scanner(System.in);
		Inimigo1 i1 = new Inimigo1();
		int ataqueBasico= esc.atributoAtaqueBasico(escolhaPer); // retornar o valor do ataque básico do personagem escolhido
		int ataqueEspecial = esc.atributoAtaqueEspecial(escolhaPer);// retornar o valor do ataque especial do personagem escolhido
		int danoAtaque; // Dano Ataque é o dano base do personagem escolhido + o bônus por evoluir de nível
		int MP = 0;
		int dano = 0;
		boolean flag = true; //Utilizar para controlar o switch caso o jogador selecione ataque especial sem ter MP ou uma opção inválida
		
		while(vida > 0 && vidaInimigoInicial > 0) {
			System.out.println("(1) para ataque básico (2) para ataque especial: ");
			int escolherAtaque = scan.nextInt();
			switch(escolherAtaque) {
			case 1: {
				
				danoAtaque = ataqueBasico + upDano; // Todos as variáveis que começam com "Up" são bônus conforme o jogador evolui de nível
				vidaInimigoInicial -= danoAtaque; 
				System.out.println("Você atacou com: Ataque Básico\nDano: "+ danoAtaque);
				System.out.println("Vida do inimigo: "+ vidaInimigoInicial);
				flag = true;
				break;
			}
			case 2: {
				if(mpJogador >0) {
				danoAtaque = ataqueEspecial + upDano;
				vidaInimigoInicial -= danoAtaque;
				System.out.println("Você atacou com: Ataque Especial\nDano: "+ danoAtaque);
				System.out.println("Vida do inimigo: "+ vidaInimigoInicial);
				MP += 1;
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
			if (vidaInimigoInicial > 0 && flag == true) {
				switch(gerador) { // Gerador é utilizado como uma espécie de inteligência artifical para fazer o inimigo atacar, no momento ele retorna apenas 1 número pois o inimigo tem apenas 1 habilidade no momento.
				case 1: {
					System.out.println("O inimigo atacou com um ataque básico");
					i1.ataqueBasico();
					vida -= i1.ataqueBasico();
					dano += i1.ataqueBasico();
					System.out.println("Vida do jogador: "+vida);
					
					
				}
				}
			
			}
		}
		danoBatalha = dano;
		System.out.println("O dano tomado foi de: "+danoBatalha);
		exp = 50;
		expBatalha = exp;
		System.out.println("Sua EXP após a batalha: "+exp);
		mpBatalha = MP;
		System.out.println("Você gastou: "+mpBatalha+" MP nesta batalha");
		
	}
	
	public double danoTomado() {
		return danoBatalha;
	}
	public double Exp() {
		return expBatalha;
	}
	public int MP() {
		return mpBatalha;
	}

}
