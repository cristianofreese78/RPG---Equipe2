package Classes;

public class Jogador extends AtaqueEspecial{
	private int ptsExperiencia;
	private int nvlJogador;
	private int pocao;
	private int atordoamento;
	private int critico;
	private int sangramento;
	private int sedento;
	
	public Jogador(String nmElementos, int ptsVida, int dnAtaqueBasico, String tpAtaqueEspecial, int dnAtaqueEspecial, int ptsExperiencia, int nvlPersonagem, int mpPersonagem, int pocao, int atordoamento, int critico, int sangramento, int sedento ) {
		super();
		this.setNome(nmElementos);
		this.setPtsVida(ptsVida);
		this.setDnAtaqueBasico(dnAtaqueBasico);
		this.setTpAtaqueEspecial(tpAtaqueEspecial);
		this.setDnAtaqueEspecial(dnAtaqueEspecial);
		this.setMpJogador(mpPersonagem);
		this.ptsExperiencia = ptsExperiencia;
		this.nvlJogador = nvlPersonagem;
		this.pocao = pocao;
		this.atordoamento = atordoamento;
		this.critico = critico;
		this.sangramento = sangramento;
		this.sedento = sedento;

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
	
	public int getPocao() {
		return pocao;
	}
	
	public void setPocao(int pocao) {
		this.pocao = pocao;
	}
	
	public int getAtordoamento() {
		return atordoamento;
	}
	
	public void setAtordoamento(int atordoamento) {
		this.atordoamento = atordoamento;
	}
	public int getCritico() {
		return critico;
	}
	
	public void setCritico(int critico) {
		this.critico = critico;
	}
	public int getSangramento() {
		return sangramento;
	}
	public void setSangramento(int sangramento) {
		this.sangramento = sangramento;
	}
	public int getSedento() {
		return sedento;
	}
	public void setSedento(int sedento) {
		this.sedento = sedento;
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
		stringBuffer.append("\nPontos de Ataque Especial (MP): ");
		stringBuffer.append(this.getMpJogador());
		stringBuffer.append("\nQuantidade de poções de cura: ");
		stringBuffer.append(this.getPocao());
		return stringBuffer.toString();
	}
	
	//Atualiza os atribuitos baseado no dano que o jogador levou, ganho de experiência e MP gasto na batalha
	//Os operadores op definem se os valores serão incrementados ou decrementados
	//Retorna true se jogador ainda tem vida ou false de morreu
	public boolean atualizaDados(int dnTurno, char opDnTur, int ptsExpTurno, char opPtsExp, int mpGastTurno, char opMPGasTur) {
		
		if (opDnTur == 'd') this.setPtsVida(this.getPtsVida()-dnTurno);
		else this.setPtsVida(this.getPtsVida()+dnTurno);
		
		if (opPtsExp == 'd') this.setPtsExperiencia(this.getPtsExperiencia()-ptsExpTurno);
		else this.setPtsExperiencia(this.getPtsExperiencia()+ptsExpTurno);
		
		if (opMPGasTur == 'd') this.setMpJogador(this.getMpJogador()-mpGastTurno);
		else this.setMpJogador(this.getMpJogador()+mpGastTurno);
		
		if (this.getPtsVida() > 0) return true;
		else return false;
	}

	
}

