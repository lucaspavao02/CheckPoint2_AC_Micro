package br.com.fiap.checkpoint2.cliente;

public class Cliente {

	private String id;
	private String codigoCliente;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public String getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Valor Total [id= ");
		builder.append(id);
		builder.append(", Codigo do Cliente = ");
		builder.append(codigoCliente);
		builder.append("]");
		return builder.toString();
	}

}
