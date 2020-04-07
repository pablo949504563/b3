package com.delhos.b3.domain;

import java.io.Serializable;

public class Empresa implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String razaoSocial;
	private String nomePregao;
	private String segmento;
	
	
	public Empresa() {
		
	}


	public Empresa(Integer id, String razaoSocial, String nomePregao, String segmento) {
		super();
		this.id = id;
		this.razaoSocial = razaoSocial;
		this.nomePregao = nomePregao;
		this.segmento = segmento;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getRazaoSocial() {
		return razaoSocial;
	}


	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}


	public String getNomePregao() {
		return nomePregao;
	}


	public void setNomePregao(String nomePregao) {
		this.nomePregao = nomePregao;
	}


	public String getSegmento() {
		return segmento;
	}


	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
