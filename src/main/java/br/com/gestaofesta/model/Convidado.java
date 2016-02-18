package br.com.gestaofesta.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "convidado")
public class Convidado implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long codigo;
	private String nome;
	private Integer quantidadeAcompanhante;
	
	public Convidado() {
		
	}

	public Convidado(String nome, Integer quantidadeAcompanhante) {
		this.nome = nome;
		this.quantidadeAcompanhante = quantidadeAcompanhante;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	@NotBlank(message = "Nome é obrigatório!")
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	@NotNull(message = "Quantidade de convidados é obrigatório!")
	public Integer getQuantidadeAcompanhante() {
		return quantidadeAcompanhante;
	}
	public void setQuantidadeAcompanhante(Integer quantidadeAcompanhante) {
		this.quantidadeAcompanhante = quantidadeAcompanhante;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if ((obj == null) || getClass() != obj.getClass()) {
			return false;
		}
		Convidado other = (Convidado) obj;
		return new EqualsBuilder().append(codigo, other.codigo).isEquals();
	}
	
}
