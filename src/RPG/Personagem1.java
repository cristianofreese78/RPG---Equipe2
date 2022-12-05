package RPG;

public class Personagem1 {
	
	
    public int vidaInicialSJogador1(){
    	return 100;
    }
	
	public int MP() {
		return 10;
	}
	public int exp() {
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
	public String atacarBasico() {
		return ("Ataque Básico");
	}
	
	public String atacarSPCL() {
		return ("Bola de fogo");
	}
	
	public boolean evoluirNv(double exp, int expParaNivel) { // Verifica se o personagem pode evoluir
		if( exp >= expParaNivel) {
			System.out.println("Parabéns você evoluiu de nível !");
			return true;
		}else {
			return false;
		}
	}

}
