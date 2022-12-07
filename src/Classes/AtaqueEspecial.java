package Classes;

import java.util.Arrays;

public class AtaqueEspecial extends Elementos{
	private int dnAtaqueEspecial;
	private String tpAtaqueEspecial;
		
	public int getDnAtaqueEspecial() {
		return dnAtaqueEspecial;
	}
	public void setDnAtaqueEspecial(int dnAtaqueEspecial) {
		this.dnAtaqueEspecial = dnAtaqueEspecial;
	}

	public String getTpAtaqueEspecial() {
		return tpAtaqueEspecial;
	}

	public void setTpAtaqueEspecial(String tpAtaqueEspecial) {
		this.tpAtaqueEspecial = tpAtaqueEspecial;
	}
	
	public int[] getEfeitosAtaqueEspecial() {
						
		//[x dano extra/rodada, x% dano critico, dano dobro/ataque, x% chance bloqueio ataque inimigo, x rodadas bloqueio, recupera x% dano, incrementa x% de dano/rodada, dano]
		int[] efeitos = new int[8];
		
		switch (this.getTpAtaqueEspecial()) {
		case "Golpe de Espada":
			//Efeito: Sangramento - Causa 5 a mais de dano por rodada
			efeitos[0] = 5;
		break;

		case "Lâmina Mortal":
			// Efeito: Chance de dano Crítico - tem 25% de chance de causar um dano crítico dobrando o valor do seu ataque
			efeitos[1] = 25;
			efeitos[2] = 2;
		break;

		case "Ataque Concentrado":
			//Efeito : Atordoamento - Tem 25% de chance de atordoar o inimigo fazendo com que o inimigo não ataque na próxima rodada
			efeitos[3] = 25;
			efeitos[4] = 1;	
		break;
		
		case "Sedento por Luta":
			//Efeito : Recuperação de vida - Recupera 10% do dano causado.
			efeitos[5] = 10;
		break;
		
		case "Passiva Fúria do Rei":
			//Efeito : PASSIVA- FURIA DO REI - A cada turno o REI DESTRUÍDO AUMENTA EM 10% o seu dano.	
			efeitos[6] = 10;
		break;
		}
		
		efeitos[7] = this.getDnAtaqueEspecial();
		return efeitos;
	}
}
