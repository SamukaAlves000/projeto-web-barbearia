package com.samuel.barbearia.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_FUNCIONARIO")
@Data
public class Funcionario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_FUNCIONARIO")
	private Long id;

	@NotNull
	@Column(name = "SALARIO_FUNCIONARIO")
	private double salario;

	@JsonBackReference
	@NotNull
	@OneToOne
	@JoinColumn(name = "ID_PESSOA")
	private Pessoa pessoa;
	
	@JsonIgnore
	@OneToMany(mappedBy = "funcionario")
	Set<FuncionarioServico> funcionarioServicos;

	@JsonIgnore
	@OneToMany(mappedBy = "funcionario")
	Set<Atendimento> atendimentos;

}
