package RPG;

public class Personagem2 {
	
	
    public int vidaInicialSJogador2(){
    	return 110;
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
	
	public int golpeEspada() {
		return 18;
	}
	public int ataqueBasico() {
		return 9;
	}
	public String atacarBasico() {
		return ("Ataque Básico");
	}
	
	public String atacarSPCL() {
		return ("Golpe de espada");
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