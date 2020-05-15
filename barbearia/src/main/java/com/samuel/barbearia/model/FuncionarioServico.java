package com.samuel.barbearia.model;

import java.io.Serializable;
import java.sql.Time;
import java.util.Set;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class FuncionarioServico implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	FuncionarioServicoKey id;

	@ManyToOne
	@MapsId("ID_FUNCIONARIO")
	@JoinColumn(name = "ID_FUNCIONARIO")
	Funcionario funcionario;

	@ManyToOne
	@MapsId("ID_SERVICO")
	@JoinColumn(name = "ID_SERVICO")
	Servico servico;

}
