package Classes;

import java.util.ArrayList;


public class ListasElementos {
	private ArrayList<Inimigo> listaInimigo1 =  new ArrayList<>();
	private ArrayList<Inimigo> listaInimigo2 =  new ArrayList<>();
	private ArrayList<Inimigo> listaInimigo3 =  new ArrayList<>();
	private ArrayList<Chefao> listaChefao =  new ArrayList<>();
	private ArrayList<Jogador> listaJogador =  new ArrayList<>();
	
	public ListasElementos() {
	}
	
	public ArrayList<Jogador> getListaJogador() {
		return listaJogador;
	}
	public void setListaJogador(ArrayList<Jogador> listaJogador) {
		this.listaJogador = listaJogador;
	}
	public ArrayList<Inimigo> getListaInimigo1() {
		return listaInimigo1;
	}
	public void setListaInimigo1(ArrayList<Inimigo> listaInimigo) {
		this.listaInimigo1 = listaInimigo;
	}
	public ArrayList<Inimigo> getListaInimigo2() {
		return listaInimigo2;
	}
	public void setListaInimigo2(ArrayList<Inimigo> listaInimigo2) {
		this.listaInimigo2 = listaInimigo2;
	}
	public ArrayList<Inimigo> getListaInimigo3() {
		return listaInimigo3;
	}
	public void setListaInimigo3(ArrayList<Inimigo> listaInimigo3) {
		this.listaInimigo3 = listaInimigo3;
	}
	public ArrayList<Chefao> getListaChefao() {
		return listaChefao;
	}
	public void setListaChefao(ArrayList<Chefao> listaChefao) {
		this.listaChefao = listaChefao;
	}
	
	//Cadastro de inimigos nos Array lists atributos listaInimigos utilizando construtor
	public void carregaListaInimigo1()  {
		this.listaInimigo1.add(new Inimigo("Slime", 25, 5, "C:\\RPG---Equipe2\\src\\Img\\escolhaSlime.png"));
		this.listaInimigo1.add(new Inimigo("Slime de lama", 25, 10, "C:\\RPG---Equipe2\\src\\Img\\escolhaSlimeLama.png"));
		this.listaInimigo1.add(new Inimigo("Lobisomen", 40, 20, "C:\\RPG---Equipe2\\src\\Img\\escolhaLobisomen.png"));
		this.listaInimigo1.add(new Inimigo("Zumbi", 35, 15, "C:\\RPG---Equipe2\\src\\Img\\escolhaZumbi.png"));
		this.listaInimigo1.add(new Inimigo("Duende", 30, 10, "C:\\RPG---Equipe2\\src\\Img\\escolhaDuende.png"));
		this.listaInimigo1.add(new Inimigo("Globin", 35, 15, "C:\\RPG---Equipe2\\src\\Img\\escolhaGlobin.png"));
		this.listaInimigo1.add(new Inimigo("Espantalho Almadiçoado", 40, 10, "C:\\RPG---Equipe2\\src\\Img\\escolhaEspantalho.png"));
	}
			
	public void carregaListaInimigo2()  {
		this.listaInimigo2.add(new Inimigo("Slime", 50, 7, "C:\\RPG---Equipe2\\src\\Img\\escolhaSlime.png"));
		this.listaInimigo2.add(new Inimigo("Slime de lama", 50, 15, "C:\\RPG---Equipe2\\src\\Img\\escolhaSlimeLama.png"));
		this.listaInimigo2.add(new Inimigo("Lobisomen", 80, 30, "C:\\RPG---Equipe2\\src\\Img\\escolhaLobisomen.png"));
		this.listaInimigo2.add(new Inimigo("Zumbi", 70, 22, "C:\\RPG---Equipe2\\src\\Img\\escolhaZumbi.png"));
		this.listaInimigo2.add(new Inimigo("Duende", 60, 15, "C:\\RPG---Equipe2\\src\\Img\\escolhaDuende.png"));
		this.listaInimigo2.add(new Inimigo("Globin", 70, 22, "C:\\RPG---Equipe2\\src\\Img\\escolhaGlobin.png"));
		this.listaInimigo2.add(new Inimigo("Espantalho Almadiçoado", 80, 15, "C:\\RPG---Equipe2\\src\\Img\\escolhaEspantalho.png"));
	}
	
	public void carregaListaInimigo3()  {
		this.listaInimigo3.add(new Inimigo("Slime", 75, 10, "C:\\RPG---Equipe2\\src\\Img\\escolhaSlime.png"));			
		this.listaInimigo3.add(new Inimigo("Slime de lama", 100, 23, "C:\\RPG---Equipe2\\src\\Img\\escolhaSlimeLama.png"));
		this.listaInimigo3.add(new Inimigo("Lobisomen", 120, 45, "C:\\RPG---Equipe2\\src\\Img\\escolhaLobisomen.png"));
		this.listaInimigo3.add(new Inimigo("Zumbi", 100, 33, "C:\\RPG---Equipe2\\src\\Img\\escolhaZumbi.png"));
		this.listaInimigo3.add(new Inimigo("Duende", 90, 23, "C:\\RPG---Equipe2\\src\\Img\\escolhaDuende.png"));
		this.listaInimigo3.add(new Inimigo("Globin", 105, 35, "C:\\RPG---Equipe2\\src\\Img\\escolhaGlobin.png"));
		this.listaInimigo3.add(new Inimigo("Espantalho Almadiçoado", 80, 25, "C:\\RPG---Equipe2\\src\\Img\\escolhaEspantalho.png"));
	}
			
	//Cadastro de chefoes no array list listaChefao utilizando construtor
	public void carregaListaChefao()  {
		this.listaChefao.add(new Chefao("Bárbaro", 80, 30, "Padrão", 40, "C:\\RPG---Equipe2\\src\\Img\\escolhaBarbaro.png"));
		this.listaChefao.add(new Chefao("Ancião", 120, 40, "Padrão", 55, "C:\\RPG---Equipe2\\src\\Img\\escolhaAnciao.png"));
		//Efeito : PASSIVA- FURIA DO REI - A cada turno o REI ESQUELETO AUMENTA EM 10% o seu dano.
		this.listaChefao.add(new Chefao("Rei Esqueleto", 160, 50, "Passiva Fúria do Rei", 60, "C:\\RPG---Equipe2\\src\\Img\\escolhaReiEsqueleto.png"));
	}
	
	//Cadastro de jogadores no array list listaJogador utilizando construtor
	public void carregaListaJogador()  {
		//Efeito: Sangramento - Causa 5 a mais de dano por rodada
		this.listaJogador.add(new Jogador("Cavaleiro", 100, 10, "Golpe de Espada", 20, 0, 1, 20,0,0,0,1,0,
										  "C:\\RPG---Equipe2\\src\\Img\\escolhaCavaleiro.png"));			
		//Efeito: Chance de dano Crítico - tem 25% de chance de causar um dano crítico dobrando o valor do seu ataque			
		this.listaJogador.add(new Jogador("Samurai", 110, 9, "Lâmina Mortal", 18, 0, 1, 20,0,0,1,0,0,
										  "C:\\RPG---Equipe2\\src\\Img\\escolhaSamurai.png"));			
		//Efeito : Atordoamento - Tem 25% de chance de atordoar o inimigo fazendo com que o inimigo não ataque na próxima rodada			
		this.listaJogador.add(new Jogador("Monge", 90, 12, "Ataque Concentrado", 22, 0, 1, 20,0,0,1,0,0,
										  "C:\\RPG---Equipe2\\src\\Img\\escolhaMonge.png"));			
		//Efeito : Recuperação de vida - Recupera 10% do dano causado.			
		this.listaJogador.add(new Jogador("Caçador", 95, 11, "Sedento por Luta", 19, 0, 1, 20,0,0,0,0,1,
										  "C:\\RPG---Equipe2\\src\\Img\\escolhaCacador.png"));			
	}
}
