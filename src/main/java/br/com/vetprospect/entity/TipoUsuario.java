package br.com.vetprospect.entity;

import java.util.Objects;

import javax.persistence.Entity;

@Entity
public class TipoUsuario {
	private Integer id;
	private String descricao;
	
	public TipoUsuario() {}

	@Override
	public int hashCode() {
		return Objects.hash(descricao, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoUsuario other = (TipoUsuario) obj;
		return Objects.equals(descricao, other.descricao) && Objects.equals(id, other.id);
	}

	public Integer getId() {
		return id;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
