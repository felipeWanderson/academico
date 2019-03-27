package br.com.felipeleal.academico;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.felipeleal.academico.domain.Aluno;
import br.com.felipeleal.academico.domain.Curso;
import br.com.felipeleal.academico.repositories.AlunoRepository;
import br.com.felipeleal.academico.repositories.CursoRepository;

@SpringBootApplication
public class AcademicoApplication implements CommandLineRunner{

	@Autowired
	private AlunoRepository alunoRespository;
	
	@Autowired
	private CursoRepository cursoRespository;
	
	public static void main(String[] args) {
		SpringApplication.run(AcademicoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
				
		Curso c1 = new Curso(null, "Sistemas de Informação");
		Curso c2 = new Curso(null, "Enfermagem");
		Curso c3 = new Curso(null, "Direito");
		Curso c4 = new Curso(null, "Jornalismo");
		Curso c5 = new Curso(null, "Engenharia Civil");
		
		
		cursoRespository.saveAll(Arrays.asList(c1,c2,c3,c4,c5));
		
		Aluno a1 = new Aluno(null, "Felipe Leal", 55561);
		Aluno a2 = new Aluno(null, "Emerson Willian", 47683);
		Aluno a3 = new Aluno(null, "Iris Leal", 47673);
		Aluno a4 = new Aluno(null, "Cleyton Henrique", 47663);
		Aluno a5 = new Aluno(null, "Marcus Vinicios", 55683);
		Aluno a6 = new Aluno(null, "Amanda Pinheiro", 37683);
		Aluno a7 = new Aluno(null, "Lu Teixeira", 57683);
		
		a1.setCurso(c1);
		a2.setCurso(c2);
		a3.setCurso(c1);
		a4.setCurso(c1);
		a5.setCurso(c3);
		a6.setCurso(c4);
		a7.setCurso(c5);
		
		
		alunoRespository.saveAll(Arrays.asList(a1,a2,a3,a4,a5,a6,a7));

	}

}
