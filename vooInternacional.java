public class vooInternacional extends Voo {

	private int qtdPassageiros;

	private int capacidadeMax;

	private boolean autorizaçãoIntern;

	public vooInternacional(String codigo, String origem, String destino, double distanciaKm, double combustivelDisp, boolean documentacaoReg, String tipo, int qtdPassageiros, int capacidadeMax, boolean autorizaçãoIntern) {
		super(codigo, origem, destino, distanciaKm, combustivelDisp, documentacaoReg, tipo);
		this.qtdPassageiros = qtdPassageiros;
		this.capacidadeMax = capacidadeMax;
		this.autorizaçãoIntern = autorizaçãoIntern;
	}

	public double calcularCombustivelNec() {
		return getDistanciakm() * 3.5;
	}

	public double calcularCustoOp() {
		double custoBase = getDistanciakm() * 4.0;
		double custoPassageiros = qtdPassageiros * 80.0;
		double taxaIntern = 500.0;
		return custoBase + custoPassageiros + taxaIntern;
	}

	public boolean autorizarDecolagem() {
		return isDocumentacaoReg()
			&& autorizaçãoIntern
			&& getCombustivelDisp() >= calcularCombustivelNec()
			&& qtdPassageiros <= capacidadeMax;
	}

	public String getMotivoPend() {
		if (!isDocumentacaoReg()) {
			return "Documentação irregular";
		}
		if (!autorizaçãoIntern) {
			return "Autorização internacional pendente";
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