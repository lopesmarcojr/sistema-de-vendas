package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.StatusVenda;

public class Venda {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date horaDaCompra;
	private StatusVenda statusVenda;
	private Usuario usuario;
	
	List<ItemVenda> itens = new ArrayList<>();
	
	public Venda(Date horaDaCompra, StatusVenda statusVenda, Usuario usuario) {
		super();
		this.horaDaCompra = horaDaCompra;
		this.statusVenda = statusVenda;
		this.usuario = usuario;
	}

	public Date getHoraDaCompra() {
		return horaDaCompra;
	}

	public void setHoraDaCompra(Date horaDaCompra) {
		this.horaDaCompra = horaDaCompra;
	}

	public StatusVenda getStatusVenda() {
		return statusVenda;
	}

	public void setStatusVenda(StatusVenda statusVenda) {
		this.statusVenda = statusVenda;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<ItemVenda> getItems() {
		return itens;
	}

	public void addVenda(ItemVenda itemvenda) {
		itens.add(itemvenda);
	}
	
	public void removeVenda(ItemVenda itemvenda) {
		itens.remove(itemvenda);
	}
	
	public Double total() {
		double valorTotal = 0;
		for(ItemVenda precoItem : itens) {
			valorTotal += precoItem.subTotal();
		}
		
		return valorTotal;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Resumo da Venda:\n");
		sb.append("Momento da venda: " + sdf.format(horaDaCompra) + "\n");
		sb.append("Status da venda: " + statusVenda + "\n");
		sb.append("Cliente: " + usuario.getNome() + "\n");
		sb.append("Produtos da venda:\n");
		for(ItemVenda item : itens) {
			sb.append(item + "\n");
		}
		
		sb.append("Valor total da venda: R$" + String.format("%.2f", total()));

		return sb.toString();
	}
	
	
	
	
	

}
