package com.samuel.barbearia.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
public class AtendimentoServicoKey implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = "ID_ATENDIMENTO")
	Long idAtendimento;

	@Column(name = "ID_SERVICO")
	Long idServico;

}
