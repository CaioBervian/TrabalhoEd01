package com.FilaEntrada;
public class ListaDeMesas {
	private Contato primeiro;
	private Contato ultimo;

	public void adicionar(Mesa valor) {
		Contato contato = new Contato();
		contato.setValor(valor);
		if (primeiro == null && ultimo == null) {
			primeiro = contato;
			ultimo = contato;
		} else {
			ultimo.setProximo(contato);
			ultimo = contato;
		}
	}
	
	public int mesasDisponiveis() {
		int mesas = 0;
		Contato contato = primeiro;
		while (contato != null) {
			if (contato.getValor().getStatus().equalsIgnoreCase("Está Livre")) {
				mesas = mesas + 1;
				contato = contato.getProximo();
			} else
				contato = contato.getProximo();
		}
		return mesas;
	}

	public void selecionarMesa(int numero) {
		Contato contato = primeiro;
		while (contato != null) {
			if (contato.getValor().getStatus().equalsIgnoreCase("Está Livre")) {
				if (contato.getValor().getNumero() == numero) {
					contato.getValor().setStatus("Está ocupada");
					break;
				} else
					contato = contato.getProximo();
			}
		}
	}
	
	public String retornarNomeFimAlmoço (int num) {
		Contato contato = primeiro;
		String nome=" "; 
		while (contato != null) {
			if (contato.getValor().getNumero()==num) {
				contato.getValor().setStatus("Está Livre");
			} else
				contato=contato.getProximo();
		}
		return nome;
	}

	public void terminarAlmoço(int num) {
		Contato contato = primeiro;
		while (contato != null) {
			if (contato.getValor().getNumero()==num) {
				contato.getValor().setStatus("Está Livre");
			} else
				contato=contato.getProximo();
		}
	}

	public String listarDisponivels() {
		Contato contato = primeiro;
		StringBuffer sb = new StringBuffer();
		while (contato != null) {
			if (contato.getValor().getStatus().equalsIgnoreCase("Está Livre")) {
				sb.append(contato.getValor());
				contato = contato.getProximo();
			} else
				contato = contato.getProximo();
		}
		return sb.toString();
	}
	
	public String listarIndisponivels() {
		Contato contato = primeiro;
		StringBuffer sb = new StringBuffer();
		while (contato != null) {
			if (contato.getValor().getStatus().equalsIgnoreCase("Está ocupada")) {
				sb.append(contato.getValor());
				contato = contato.getProximo();
			} else
				contato = contato.getProximo();
		}
		return sb.toString();
	}

	public String listar() {
		Contato contato = primeiro;
		StringBuffer sb = new StringBuffer();
		while (contato != null) {
			sb.append(contato.getValor());
			contato = contato.getProximo();
		}
		return sb.toString();
	}
}