public class vooInternacional extends Voo {

	private int qtdPassageiros;

	private int capacidadeMax;

	private boolean autorizaçãoIntern;

	public vooInternacional(String codigo, String origem, String destino, double distanciaKm, double combustivelDisp, boolean documentacaoReg, String tipo, int qtdPassageiros, int capacidadeMax) {
		super(codigo, origem, destino, distanciaKm, combustivelDisp, documentacaoReg, tipo);
		this.qtdPassageiros = qtdPassageiros;
		this.capacidadeMax = capacidadeMax;
	}

	public double calcularCombustivelNec() {
		return 0;
	}

	public double calcularCustoOp() {
		return 0;
	}

	public boolean autorizarDecolagem() {
		return false;
	}

	public String getMotivoPend() {
		return null;
	}

}
