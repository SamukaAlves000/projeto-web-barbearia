package com.samuel.barbearia.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_PESSOA")
@Data
public class Pessoa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PESSOA")
	private Long id;

	@NotNull
	@Column(name = "NOME_PESSOA", length = 90)
	private String nome;

	@Column(name = "EMAIL_PESSOA", length = 90)
	private String email;

	@Column(name = "TELEFONE_PESSOA", length = 15)
	private String telefone;

	@Column(name = "CIDADE_PESSOA", length = 90)
	private String cidade;

	@Column(name = "UF_PESSOA", length = 3)
	private String uf;

	@Column(name = "LOGRADOURO_PESSOA", length = 45)
	private String logradouro;

	@Column(name = "COMPLEMENTO_PESSOA", length = 45)
	private String complemento;

	@Column(name = "CPF_PESSOA", length = 11)
	private String cpf;

	@Column(name = "SEXO_PESSOA", length = 1)
	private String sexo;

	@Column(name = "DATA_NASCIMENTO_PESSOA")
	private LocalDate dataNascimento;


	@JsonManagedReference
	@OneToOne(mappedBy = "pessoa", fetch = FetchType.LAZY)
	private Funcionario funcionario;

	
	@JsonManagedReference
	@OneToOne(mappedBy = "pessoa", fetch = FetchType.LAZY)
	private Cliente cliente;

}
