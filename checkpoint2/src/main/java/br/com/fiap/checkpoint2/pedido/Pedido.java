package br.com.fiap.checkpoint2.pedido;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.checkpoint2.cliente.Cliente;

public class Pedido {

	private String id;
	private String dataPedido;
	private String codigoCliente;
	private String dataCadastro;
	private String valorTotal;
	private List<Cliente> clientes;

	public Pedido(String dataPedido, String codigoCliente, String dataCadastro, String valorTotal) {
		this.dataPedido = dataPedido;
		this.codigoCliente = codigoCliente;
		this.dataCadastro = dataCadastro;
		this.valorTotal = valorTotal; 	
		}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(String dataPedido) {
		this.dataPedido = dataPedido;
	}

	public String getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public void addCliente(Cliente clientes) {
		if (this.clientes == null)
			this.clientes = new ArrayList<Cliente>();

		this.clientes.add(clientes);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pedido [id=");
		builder.append(id);
		builder.append(", Data do Pedido = ");
		builder.append(dataPedido);
		builder.append(", Codigo do Cliente = ");
		builder.append(codigoCliente);
		builder.append(", Data do Cadastro = ");
		builder.append(dataCadastro);
		builder.append(", Valor Total = ");
		builder.append(valorTotal);
		builder.append(", Clientes = ");
		builder.append(clientes);
		builder.append("]");
		return builder.toString();
	}

}
