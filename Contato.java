package com.FilaEntrada;
public class Contato {
	private Contato proximo;
	private Mesa valor;
	public Contato getProximo() {
		return proximo;
	}

	public void setProximo(Contato proximo) {
		this.proximo = proximo;
	}

	public Mesa getValor() {
		return valor;
	}

	public void setValor(Mesa valor) {
		this.valor = valor;
	}
}