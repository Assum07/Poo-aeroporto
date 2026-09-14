import java.util.*;
public class aeroporto {

	private String nome;

	private ArrayList<Voo> voos;

	public void Aeroporto(String nome) {
		this.nome = nome;
		this.voos = new ArrayList<>();
	}

	public boolean adicionarVoo(Voo voo) {
		return false;
	}

	public Voo buscarVoo(String codigo) {
		return null;
	}

	public void listarVoos() {

	}

	public void listarVoosAutorizados() {

	}

	public void listarVoosNãoAutorizados() {

	}

	public double calcularCustoTotal() {
		return 0;
	}

	public Voo encontrarVooMaisCaro() {
		return null;
	}

	public void contarVoosPorCategoria() {

	}

	public void ordenarVoosPorCusto() {

	}

}
