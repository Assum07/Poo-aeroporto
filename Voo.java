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
		this.distanciaKm = distanciaKm;
		this.combustivelDisp = combustivelDisp;
		this.documentacaoReg = documentacaoReg;
		
	}

	public String getCodigo() {
		return null;
	}

	public String getOrigem() {
		return null;
	}

	public String getDestino() {
		return null;
	}

	public double getDistanciakm() {
		return 0;
	}

	public double getCombustivelDisp() {
		return 0;
	}

	public boolean isDocumentacaoReg() {
		return false;
	}

	public double calcularCombustivelNec() {
		return 0;
	}

	public abstract double calcularCustoOp();

	public String getTipo(){
		return tipo;
	};

	public abstract boolean autorizarDecolagem();

	public abstract String getMotivoPend();

	public void exibirResumo() {

	}


	/**
	 * @see autorizacao#autorizaDecolagem()
	 *  
	 */
	public boolean autorizaDecolagem() {
		return false;
	}

}
