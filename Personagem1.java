package RPG;

public class Personagem1 {
	
    public double vidaInicialSJogador1(){
    	return 100;
    }
	
	public int MP() {
		return 10;
	}
	public double exp() {
		return 0;
	}
	public int nv() {
		return 1;
	}
	
	public int boladeFogo() {
		return 20;
	}
	public int ataqueBasico() {
		return 10;
	}
	public void atacarBasico() {
		System.out.println("Ataque Básico");
		System.out.println("Dano: " + ataqueBasico());
	}
	
	public void atacarSPCL() {
		System.out.println("Bola de fogo");
		System.out.println("Dano: " + boladeFogo());
	}
	
	public boolean evoluirNv(double exp, int expParaNivel) {
		if( exp >= expParaNivel) {
			System.out.println("Parabéns você evoluiu de nível !");
			return true;
		}else {
			return false;
		}
	}

}
