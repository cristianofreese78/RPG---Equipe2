package RPG;

import java.util.Scanner;

public class escolhaPersonagem<Personagem> {
	Personagem1 p1 = new Personagem1();
	Personagem2 p2 = new Personagem2();
	public int result = 0;
	public int escolhaPersonagem() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1 para Personagem 1 e 2 para Personagem 2");
		int escolha = scan.nextInt();
		if (escolha == 1) {
			result = 1;
			return result;
		}
		else  {
			result = 2;
			return result;
		}
		
	}
	
	public int escolhaPer() {
		if(result == 1) {
			return 1;
		}else {
			return 2;
			
	}
		

	}
	public int atributoMP() {
		if(result == 1) {
			return p1.MP();
		}else {
			
			return p2.MP();
		}
	}
	
	public int atributoAtaqueBasico(int result) {
		if(result == 1) {
			return p1.ataqueBasico();
		}else {
			
			return p2.ataqueBasico();
		}
	}
	
	public int atributoAtaqueEspecial(int result) {
		if(result == 1) {
			return p1.boladeFogo();
		}else {
			
			return p2.golpeEspada();
		}
	}
	
	
	public int atributoVida() {
		if(result == 1) {
			return p1.vidaInicialSJogador1();
		}else {
			
			return p2.vidaInicialSJogador2();
		}
	}
	public int atributoExp() {
		return 0;
	}
	public int atributoLvl() {
		return 1;
	}
	public boolean evoluirLvl(double exp, int expParaNivel) {
			if( exp >= expParaNivel) {
				System.out.println("Parabéns você evoluiu de nível !");
				return true;
			}else {
				return false;
			}
		}
		
	
}

