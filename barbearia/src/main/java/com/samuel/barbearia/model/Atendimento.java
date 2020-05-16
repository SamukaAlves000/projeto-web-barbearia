package com.samuel.barbearia.model;

import java.io.Serializable;
import java.sql.Time;
import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_ATENDIMENTO")
@Data
public class Atendimento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ATENDIMENTO")
	private Long id;

	@NotNull
	@Column(name = "DATA_ATENDIMENTO")
	private LocalDate dataAtendimento;

	@NotNull
	@Column(name = "HORARIO_ATENDIMENTO")
	private Time horarioAtendimento;

	@NotNull
	@Column(name = "STATUS_ATENDIMENTO", length = 45)
	private String statusAtendimento;

	@Column(name = "AVALIACAO_ATENDIMENTO")
	private int avaliacaoAtendimento;

	@OneToMany(mappedBy = "atendimento")
	Set<AtendimentoServico> atendimentoServicos;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "ID_FUNCIONARIO")
	Funcionario funcionario;
	@NotNull
	@ManyToOne
	@JoinColumn(name = "ID_CLIENTE")
	Cliente cliente;

}
