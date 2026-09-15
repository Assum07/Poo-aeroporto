public class vooDomestico extends Voo {

	private int qtdPassageiros;

	private int capacidadeMax;

	public vooDomestico(String codigo, String origem, String destino, double distanciaKm, double combustivelDisp, boolean documentacaoReg, String tipo, int qtdPassageiros, int capacidadeMax) {
		super(codigo, origem, destino, distanciaKm, combustivelDisp, documentacaoReg, tipo);
		this.qtdPassageiros = qtdPassageiros;
		this.capacidadeMax = capacidadeMax;
	}

	public double calcularCustoOp() {
		double custoBase = getDistanciakm() * 2.5;
		double custoPassageiros = qtdPassageiros * 50.0;
		return custoBase + custoPassageiros;
	}

	public boolean autorizarDecolagem() {
		return isDocumentacaoReg()
			&& getCombustivelDisp() >= calcularCombustivelNec()
			&& qtdPassageiros <= capacidadeMax;
	}

	public String getMotivoPend() {
		if (!isDocumentacaoReg()) {
			return "Documentação irregular";
		}
		if (getCombustivelDisp() < calcularCombustivelNec()) {
			return "Combustível insuficiente";
		}
		if (qtdPassageiros > capacidadeMax) {
			return "Quantidade de passageiros excede a capacidade máxima";
		}
		return "Sem pendências";
	}

}