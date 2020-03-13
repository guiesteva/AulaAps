package Builder;

public class Produto {
	private String descricao;
	private double Preco;

	public Produto(String descricao, double preco) {
		this.descricao = descricao;
		Preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return Preco;
	}

	public void setPreco(double preco) {
		Preco = preco;
	}

}
