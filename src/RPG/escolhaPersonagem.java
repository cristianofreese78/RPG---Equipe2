package RPG;

import java.util.Scanner;

public class escolhaPersonagem<Personagem> {
	Personagem1 p1 = new Personagem1(); ///Instância dos personagens que o jogador pode escolher
	Personagem2 p2 = new Personagem2();
	public int result = 0;// 1 para personagem 1 e 2 para personagem 2. Inícia com 0
	
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
	
	public int escolhaPer() { //retorna com o número do personagem
		if(result == 1) {
			return 1;
		}else {
			return 2;
			
	}
		

	}
	public int atributoMP() { // retorna o MP de cada personagem com base na escolha
		if(result == 1) {
			return p1.MP();
		}else {
			
			return p2.MP();
		}
	}
	
	public int atributoAtaqueBasico(int result) { // retorna o dano base do ataque básico com base an escolha
		if(result == 1) {
			return p1.ataqueBasico();
		}else {
			
			return p2.ataqueBasico();
		}
	}
	
	public int atributoAtaqueEspecial(int result) { // retorna o dano base do ataque especial com base na escolha.
		if(result == 1) {
			return p1.boladeFogo();
		}else {
			
			return p2.golpeEspada();
		}
	}
	
	
	public int atributoVida() { // retorna a vida base com base na escolha.
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

