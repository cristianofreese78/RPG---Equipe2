package Classes;

public class Chefao extends AtaqueEspecial{
	
	public Chefao(String nmElementos, int ptsVida, int dnAtaqueBasico, String tpAtaqueEspecial, int dnAtaqueEspecial) {
		super();
		this.setNome(nmElementos);
		this.setPtsVida(ptsVida);
		this.setDnAtaqueBasico(dnAtaqueBasico);
		this.setTpAtaqueEspecial(tpAtaqueEspecial);
		this.setDnAtaqueEspecial(dnAtaqueEspecial);
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
		stringBuffer.append("\nDano Ataque Especial: ");
		stringBuffer.append(this.getDnAtaqueEspecial());
		stringBuffer.append("\nTipo Ataque Especial: ");
		stringBuffer.append(this.getTpAtaqueEspecial());
		return stringBuffer.toString();
	}
}


