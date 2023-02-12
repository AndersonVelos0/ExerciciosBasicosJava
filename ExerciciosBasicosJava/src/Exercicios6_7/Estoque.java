package Exercicios6_7;

public class Estoque {
	private String nome;
	private int qtdAtual;
	private int qtdMinima;

	public Estoque() {
	}

	public Estoque(String nome, int qtdAtual, int qtdMinima) {
		this.nome = nome;
		this.qtdAtual = qtdAtual;
		this.qtdMinima = qtdMinima;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtdAtual() {
		return qtdAtual;
	}

	public void setQtdAtual(int qtdAtual) {
		this.qtdAtual = qtdAtual;
	}

	public int getQtdMinima() {
		return qtdMinima;
	}

	public void setQtdMinima(int qtdMinima) {
		this.qtdMinima = qtdMinima;
	}

	// Metodos

	public void mudarNome(String nome) {
		setNome(nome);
	}

	public void mudarQtdMinima(int qtdMinima) {
		if (qtdMinima <= 0) {
			System.out.println("A quantidade mínima não pode ser negativa");
		}
		setQtdMinima(qtdMinima);
	}

	public void repor(int qtd) {
		qtdAtual = qtdAtual + qtd;
	}

	public void darBaixa(int qtd) {
		if (qtdAtual <= 0) {
			System.out.println("O estoque esta negativo");
		}
		qtdAtual = qtdAtual - qtd;
	}

	public void mostrar() {
		System.out.println("\n" + "Nome do produto: " + nome + "\n" + "Quantidade minima: " + qtdMinima + "\n"
				+ "Quantidade atual: " + qtdAtual + "\n" + "Precisa repor? " + precisaRepor());
	}

	public Boolean precisaRepor() {
		if (qtdAtual <= qtdMinima) {
			return true;
		} else {
			return false;
		}
	}

}