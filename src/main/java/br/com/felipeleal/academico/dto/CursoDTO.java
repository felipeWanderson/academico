package br.com.felipeleal.academico.dto;

import java.io.Serializable;

import br.com.felipeleal.academico.domain.Curso;

public class CursoDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	
	public CursoDTO() {
	}

	public CursoDTO(Curso obj) {
		super();
		this.id = obj.getId();
		this.nome = obj.getNome();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
