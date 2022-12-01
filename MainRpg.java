
package RPG;
import java.util.Random;

public class MainRpg {
	
	public static int gerador() {
		Random gerador = new Random();
		return gerador.nextInt(1)+1;
	}
	public static int expParaNivel(int nv) {
	    return (int) Math.floor(100 * Math.pow(nv, 1.5));
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personagem1 p1 = new Personagem1();	
		Inimigo1 i1 = new Inimigo1();
		Batalha ba = new Batalha();
		int MP = p1.MP();
		double vida = p1.vidaInicialSJogador1();
		double exp = p1.exp();
		int nv = p1.nv();
		double vidaInimigo1 = i1.vidaInimigoInicial();
		System.out.println("=========================");
		System.out.println("VIDA: "+vida);
		System.out.println("EXP: "+exp);
		System.out.println("MP: "+MP);
		System.out.println("NÍVEL: "+nv);
		System.out.println("=========================");
		while(vida > 0) {
		System.out.println("Você encontrou um inimigo  e atacou ...");
		ba.batalha(vida,MP,exp,i1.vidaInimigoInicial(),gerador(),p1.ataqueBasico(),p1.boladeFogo());
		vida = vida - ba.danoBatalha;
		exp += ba.Exp();
		MP -= ba.MP();
		boolean statusNv =  p1.evoluirNv(exp, expParaNivel(nv));
		if (statusNv == true) {
			nv = nv+ 1;
		}
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


