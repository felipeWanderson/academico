package br.com.felipeleal.academico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.felipeleal.academico.domain.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer>{

}
