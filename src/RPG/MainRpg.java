
package RPG;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JFrame;

public class MainRpg{
	
	
	public static int gerador() { // Gera apenas 1 número devido ao inimigo ter apenas 1 habilidade
		Random gerador = new Random();
		return gerador.nextInt(2) + 1;
	}
	public static int expParaNivel(int nv) { // cálculo de experiência para evoluir de nível
	    return (int) Math.floor(100 * Math.pow(nv, 1.5));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int gerador = gerador();
		  System.out.println(gerador);
		escolhaPersonagem esc = new escolhaPersonagem();
		esc.escolhaPersonagem();
		int escolha = esc.escolhaPer(); // 
		Inimigo1 i1 = new Inimigo1();
		Batalha ba = new Batalha();
		int upVida = 0; // Bônus de vida ao evoluir de nível, inicia com 0
		int upMp = 0; // Bônus de MP ao evoluir de nível, inicia com 0
		int upDano = 0;// Bônus de Dano ao evoluir de nível, inicia com 0
		int MP = esc.atributoMP();
		int vida = esc.atributoVida();
		int exp = esc.atributoExp();
		int nv = esc.atributoLvl();
		double vidaInimigo1 = i1.vidaInimigoInicial();
		System.out.println("=========================");
		System.out.println("VIDA: "+vida);
		System.out.println("EXP: "+exp);
		System.out.println("MP: "+MP);
		System.out.println("NÍVEL: "+nv);
		System.out.println("=========================");
		while(vida > 0) {
			
		System.out.println("Você encontrou um inimigo  e atacou ...");
		ba.batalha(vida,MP,exp,i1.vidaInimigoInicial(),gerador(),upDano,escolha); // Classe responsável por fazer todo o sistema de batalha e retornar valores como exp, dano tomado, mp gasto ...
		exp += ba.Exp();
		boolean statusNv =  esc.evoluirLvl(exp, expParaNivel(nv));
		if (statusNv == true) {
			nv = nv+ 1;
			upVida = (int) (esc.atributoVida()* 0.1 + (nv*1.5)) ;
			upMp = 2;
			upDano += 2;
			System.out.println("Você ganhou: "+upVida+" de vida!");
			System.out.println("Você ganhou: "+upMp+" de mp!");
			System.out.println("Você ganhou: "+upDano+"de dano extra!");
			statusNv = false;
			}else {
				upVida = 0;
				upMp = 0;
				
				
			}
		
		vida = (int) (vida - ba.danoBatalha) + upVida;
		MP = MP - ba.MP() + upMp;
		System.out.println("fim da batalha");
		System.out.println("=========================");
		System.out.println("VIDA: "+vida);
		System.out.println("EXP: "+exp);
		System.out.println("MP: "+MP);
		System.out.println("NÍVEL: "+nv);
		System.out.println("=========================");
		}
		System.out.println("Fim de jogo!");
		
	}
	}


