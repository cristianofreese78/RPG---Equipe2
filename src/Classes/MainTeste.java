package Classes;

public class MainTeste {

	public static void main(String[] args) {
		Jogador cavaleiro = new Jogador();
		// Jogador cavaleiro = new Jogador("Cavaleiro", 100, 10, 20);
		Inimigo slime = new Inimigo();
		// Inimigo slime = new Inimigo("Slime", 25, 5);
		Chefao barbaro = new Chefao();
		// Chefao barbaro = new Chefao("Bárbaro", 60, 30, 40);
		
		
		//Dados cavaleiro
		cavaleiro.setNome("Cavaleiro");
		cavaleiro.setPtsVida(100);
		cavaleiro.setDnAtaqueBasico(10);
		cavaleiro.setDnAtaqueEspecial(20);
		// Implementar via interface AtaqueEspecial
		//Ataque especial : Golpe de espada 
		//Efeito : Sangramento - Causa 5 a mais de dano por rodada
		
		
		//Dados slime
		slime.setNome("Slime");
		slime.setPtsVida(25);
		slime.setDnAtaqueBasico(5);
		
		//Dados bárbaro
		barbaro.setNome("Bárbaro");
		barbaro.setPtsVida(60);
		barbaro.setDnAtaqueBasico(30);
		barbaro.setDnAtaqueEspecial(40);
	}

}
