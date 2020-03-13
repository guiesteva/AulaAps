package Builder;

import java.util.List;
import java.util.ArrayList;

public class Venda {
	private String data;
	private VendaBuilder builder;
	private List<ItemVenda> itens = new ArrayList<>();
	private Cliente cliente;
	private Funcionario funcionario;
	private Frete frete;

	public void addItem(ItemVenda Produto) {
		itens.add(Produto);
	}

	public Venda(VendaBuilder builder) {
		this.builder = builder;
	}

	public Venda(String Data) {
		this.data = data;
	}

	public Venda() {
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public VendaBuilder getBuilder() {
		return builder;
	}

	public void setBuilder(VendaBuilder builder) {
		this.builder = builder;
	}

	public List<ItemVenda> getItens() {
		return itens;
	}

	public void setItens(List<ItemVenda> itens) {
		this.itens = itens;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Frete getFrete() {
		return frete;
	}

	public void setFrete(Frete frete) {
		this.frete = frete;
	}

}
