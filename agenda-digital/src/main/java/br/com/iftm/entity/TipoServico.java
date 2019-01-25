package br.com.iftm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "TB_TIPO_SERVICO", schema = "EVERIS", uniqueConstraints = {
		@UniqueConstraint(name = "UNQ_TIPO_SERVICO", columnNames = { "NOM_TIPO_SERVICO" }) })
@SequenceGenerator(name = "SQ_TIPO_SERVICO", sequenceName = "SQ_TIPO_SERVICO", initialValue = 1, allocationSize = 1, schema = "EVERIS")
public class TipoServico {

	@Id
	@Column(name = "COD_TIPO_SERVICO")
	@GeneratedValue(generator = "SQ_TIPO_SERVICO", strategy = GenerationType.SEQUENCE)
	private Integer codigo;

	@Column(name = "NOM_TIPO_SERVICO", nullable = false, length = 100)
	private String nome;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
