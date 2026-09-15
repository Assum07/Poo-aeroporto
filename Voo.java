public abstract class Voo implements autorizacao {

	private String codigo;

	private String origem;

	private String destino;

	private double distanciaKm;

	private double combustivelDisp;

	private boolean documentacaoReg;

	private String tipo;

	public Voo(String codigo, String origem, String destino, double distanciaKm, double combustivelDisp, boolean documentacaoReg, String tipo) {
		this.codigo = codigo;
		this.origem = origem;
		this.destino = destino;
		this.distanciaKm = distanciaKm;
		this.combustivelDisp = combustivelDisp;
		this.documentacaoReg = documentacaoReg;
		this.tipo = tipo;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getOrigem() {
		return origem;
	}

	public String getDestino() {
		return destino;
	}

	public double getDistanciakm() {
		return distanciaKm;
	}

	public double getCombustivelDisp() {
		return combustivelDisp;
	}

	public boolean isDocumentacaoReg() {
		return documentacaoReg;
	}

	public double calcularCombustivelNec() {
		return distanciaKm * 3.0;
	}

	public abstract double calcularCustoOp();

	public String getTipo(){
		return tipo;
	};

	public abstract boolean autorizarDecolagem();

	public abstract String getMotivoPend();

	public void exibirResumo() {
		System.out.printf("Voo %s [%s] : %s -> %s \nDistância: %.1f km \nCombustível necessário: %.1f L \nCusto operacional: R$ %.2f \nAutorizado: %s%n", codigo, tipo, origem, destino, distanciaKm, calcularCombustivelNec(), calcularCustoOp(), autorizarDecolagem() ? "Sim" : "Não (" + getMotivoPend() + ")"
		);
	}

	public boolean autorizaDecolagem() {
		return this.autorizarDecolagem();
	}
}