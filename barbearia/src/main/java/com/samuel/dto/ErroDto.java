package com.samuel.dto;

import java.io.Serializable;

/**
 * @author samukaAlves000
 *
 */
public class ErroDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final String campo;
	private final String mensagem;
	private final Object valor;

	public ErroDto(String campo, String mensagem, Object valor) {
		this.campo = campo;
		this.mensagem = mensagem;
		this.valor = valor;
	}

	public String getCampo() {
		return campo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public Object getValor() {
		return valor;
	}
}
