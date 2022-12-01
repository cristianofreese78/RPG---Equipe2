package RPG;

import java.util.Scanner;



public class Batalha extends MainRpg{
	
	double danoBatalha;
    double expBatalha;
    int mpBatalha;
	
	public void batalha(double vida, double mpJogador,double exp, double vidaInimigoInicial, int gerador, int ataqueBasico, int ataqueEspecial) {
		Scanner scan = new Scanner(System.in);
		Inimigo1 i1 = new Inimigo1();
		Personagem1 p1 = new Personagem1();
		int MP = 0;
		double dano = 0;
		boolean flag = true; //Utilizar para controlar o switch caso o jogador selecione ataque especial sem ter MP ou uma opção inválida
		
		while(vida > 0 && vidaInimigoInicial > 0) {
			System.out.println("(1) para ataque básico (2) para ataque especial: ");
			int escolherAtaque = scan.nextInt();
			switch(escolherAtaque) {
			case 1: {
				
				vidaInimigoInicial -= ataqueBasico;
				System.out.println("Vida do inimigo: "+ vidaInimigoInicial);
				flag = true;
				break;
			}
			case 2: {
				if(mpJogador >0) {
				vidaInimigoInicial -= ataqueEspecial;
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
				switch(gerador) {
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
	public double MP() {
		return mpBatalha;
	}

}
