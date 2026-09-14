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
