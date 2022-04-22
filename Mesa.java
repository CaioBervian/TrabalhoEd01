package com.FilaEntrada;

public class Mesa {

	private int numero;
	private String status;
	private Mesa next;
	
	public Mesa getNext() {
		return next;
	}

	public void setNext(Mesa next) {
		this.next = next;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n");
		builder.append("\n");
		builder.append(" ======================");
		builder.append("\n");
		builder.append("   |  Mesa numero ");
		builder.append(numero + " |");
		builder.append("\n");
		builder.append("   |  ");
		if (status.equalsIgnoreCase("Está Livre")) {
			builder.append(status + "    |");
		} else
			builder.append(status + "  |");
		builder.append("\n");
		if (status.equalsIgnoreCase("Está ocupada")) {
			
		}
		return builder.toString();
	}
}
