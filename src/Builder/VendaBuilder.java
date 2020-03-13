package Builder;

public class VendaBuilder {

	private Venda venda;

	public VendaBuilder() {
		venda = new Venda();
	}

	public VendaBuilder Data(String data) {
		venda.setData(data);
		return this;
	}

	public VendaBuilder ClientePf(String nome, String cpf) {
		venda.setCliente(new ClientePf(nome, cpf));
		return this;
	}

	public VendaBuilder ClientePj(String cnpj, String razaoSocial) {
		venda.setCliente(new ClientePj(cnpj, razaoSocial));
		return this;
	}

	public VendaBuilder item(int quant, Produto produto) {
		venda.addItem(new ItemVenda(quant, produto));
		return this;
	}

	public VendaBuilder Funcionario(String nome) {
		venda.setFuncionario(new Funcionario(nome));
		return this;
	}

	public VendaBuilder Frete(double valor) {
		venda.setFrete(new Frete(valor));
		return this;
	}

	public Venda Build() {
		return new Venda(this);
	}

}
