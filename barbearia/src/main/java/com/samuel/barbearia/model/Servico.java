package com.samuel.barbearia.model;

import java.io.Serializable;
import java.sql.Time;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_SERVICO")
@Data
public class Servico implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_SERVICO")
	private Long id;

	@NotNull
	@Column(name = "DESCRICAO_SERVICO", length = 45)
	private String descricao;

	@NotNull
	@Column(name = "VALOR_SERVICO")
	private double valor;

	@Column(name = "DURACAO_SERVICO")
	private Time duracao;

	@OneToMany(mappedBy = "servico")
	Set<FuncionarioServico> funcionarioServicos;

}
