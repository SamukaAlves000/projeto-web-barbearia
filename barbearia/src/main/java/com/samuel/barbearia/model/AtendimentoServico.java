package com.samuel.barbearia.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "TB_ATENDIMENTO_SERVICO")
public class AtendimentoServico implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	AtendimentoServicoKey id;

	@ManyToOne
	@MapsId("ID_ATENDIMENTO")
	@JoinColumn(name = "ID_ATENDIMENTO")
	Atendimento atendimento;

	@ManyToOne
	@MapsId("ID_SERVICO")
	@JoinColumn(name = "ID_SERVICO")
	Servico servico;

}
