public class vooCarga extends Voo {

	private double pesoCargaKg;

	private double capacidadeMaxKg;

	private boolean cargaInspecionada;

	public vooCarga(String codigo, String origem, String destino, double distanciaKm, double combustivelDisp, boolean documentacaoReg, String tipo, double pesoCargaKg, double capacidadeMaxKg, boolean cargaInspecinada) {
		super(codigo, origem, destino, distanciaKm, combustivelDisp, documentacaoReg, tipo);
		this.pesoCargaKg = pesoCargaKg;
		this.capacidadeMaxKg = capacidadeMaxKg;
		this.cargaInspecionada = cargaInspecinada;
	}

	public double calcularCombustivelNec() {
		return getDistanciakm() * 5.0 + (pesoCargaKg / 1000.0) * 2.0;
	}

	public double calcularCustoOp() {
		double custoBase = getDistanciakm() * 3.0;
		double custoCarga = pesoCargaKg * 0.5;
		return custoBase + custoCarga;
	}

	public boolean autorizarDecolagem() {
		return isDocumentacaoReg()
			&& cargaInspecionada
			&& pesoCargaKg <= capacidadeMaxKg
			&& getCombustivelDisp() >= calcularCombustivelNec();
	}

	public String getMotivoPend() {
		if (!isDocumentacaoReg()) {
			return "Documentação irregular";
		}
		if (!cargaInspecionada) {
			return "Carga não inspecionada";
		}
		if (pesoCargaKg > capacidadeMaxKg) {
			return "Peso da carga excede a capacidade máxima";
		}
		if (getCombustivelDisp() < calcularCombustivelNec()) {
			return "Combustível insuficiente";
		}
		return "Sem pendências";
	}

}