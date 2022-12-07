package Classes;

public class Jogador extends AtaqueEspecial{
	private int ptsExperiencia;
	private int nvlJogador;
	
	public Jogador(String nmElementos, int ptsVida, int dnAtaqueBasico, String tpAtaqueEspecial, int dnAtaqueEspecial, int ptsExperiencia, int nvlPersonagem ) {
		super();
		this.setNome(nmElementos);
		this.setPtsVida(ptsVida);
		this.setDnAtaqueBasico(dnAtaqueBasico);
		this.setTpAtaqueEspecial(tpAtaqueEspecial);
		this.setDnAtaqueEspecial(dnAtaqueEspecial);
		this.ptsExperiencia = ptsExperiencia;
		this.nvlJogador = nvlPersonagem;
	}
	
	public Jogador() {
		super();
	}



	public int getPtsExperiencia() {
		return ptsExperiencia;
	}
	public void setPtsExperiencia(int ptsEsperiencia) {
		this.ptsExperiencia = ptsEsperiencia;
	}
	public int getNvlJogador() {
		return nvlJogador;
	}
	public void setNvlJogador(int nvlPersonagem) {
		this.nvlJogador = nvlPersonagem;
	}
	
	@Override
	public String toString() {
		
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("\nNome: ");
		stringBuffer.append(this.getNome());
		stringBuffer.append("\nPontos de Vida: ");
		stringBuffer.append(this.getPtsVida());
		stringBuffer.append("\nDano Ataque Básico: ");
		stringBuffer.append(this.getDnAtaqueBasico());
		stringBuffer.append("\nNível: ");
		stringBuffer.append(this.getNvlJogador());
		stringBuffer.append("\nExperiênica: ");
		stringBuffer.append(this.getPtsExperiencia());
		stringBuffer.append("\nDano Ataque Especial: ");
		stringBuffer.append(this.getDnAtaqueEspecial());
		stringBuffer.append("\nTipo Ataque Especial: ");
		stringBuffer.append(this.getTpAtaqueEspecial());
		return stringBuffer.toString();
	}
}

