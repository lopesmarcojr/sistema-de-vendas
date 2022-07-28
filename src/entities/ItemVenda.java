package entities;

public class ItemVenda {
	
	private Integer quantidade;
	private Double preco;
	private Produto produto;
	
	public ItemVenda() {
		
	}

	public ItemVenda(Integer quantidade, Double preco, Produto produto) {
		super();
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public Double subTotal() {
		double total = quantidade * preco;
		return total;
	}

	@Override
	public String toString() {
		return getProduto().getNome() + ", Preço: R$" + String.format("%.2f", preco) + ", Quantidade: " + quantidade + ", Subtotal: R$" + String.format("%.2f", subTotal());
	}
	
	

}
