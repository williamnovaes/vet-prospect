package br.com.vetprospect.entity;

import java.util.Objects;

public class Estado {
	private String uf;
	private String nome;
	
	public Estado() {}
	
	@Override
	public int hashCode() {
		return Objects.hash(uf);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estado other = (Estado) obj;
		return Objects.equals(uf, other.uf);
	}

	public String getUf() {
		return uf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
