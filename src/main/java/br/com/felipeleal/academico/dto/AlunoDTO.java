package br.com.felipeleal.academico.dto;

import java.io.Serializable;

import br.com.felipeleal.academico.domain.Aluno;

public class AlunoDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer cpd;
	private String nome;
	private String curso;
	
	public AlunoDTO() {
	}

	public AlunoDTO(Aluno obj) {
		super();
		this.cpd = obj.getCpd();
		this.nome = obj.getNome();
		this.curso = obj.getCurso().getNome();
	}

	public Integer getCpd() {
		return cpd;
	}

	public void setCpd(Integer cpd) {
		this.cpd = cpd;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
}
