package Classes;

import Interfaces.AtaqueEspecial;

public class Jogador extends Elementos implements AtaqueEspecial{
	private int ptsEsperiencia;
	private int nvlPersonagem;
	private int dnAtaqueEspecial;
	
	public int getPtsEsperiencia() {
		return ptsEsperiencia;
	}
	public void setPtsEsperiencia(int ptsEsperiencia) {
		this.ptsEsperiencia = ptsEsperiencia;
	}
	public int getNvlPersonagem() {
		return nvlPersonagem;
	}
	public void setNvlPersonagem(int nvlPersonagem) {
		this.nvlPersonagem = nvlPersonagem;
	}
	public int getDnAtaqueEspecial() {
		return dnAtaqueEspecial;
	}
	public void setDnAtaqueEspecial(int dnAtaqueEspecial) {
		this.dnAtaqueEspecial = dnAtaqueEspecial;
	}
	
	
}

