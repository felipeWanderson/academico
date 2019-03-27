package br.com.felipeleal.academico.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.felipeleal.academico.domain.Curso;
import br.com.felipeleal.academico.repositories.CursoRepository;
@Service
public class CursoService {

	@Autowired
	private CursoRepository repo;
	
	public Curso find(Integer id) {
		Optional<Curso> obj = repo.findById(id);
		return obj.orElse(null);
	}

	public Curso insert(Curso obj) {
		obj.setId(null);
		return repo.save(obj);
	}

	public Curso update(Curso obj) {
		find(obj.getId());
		return repo.save(obj);
	
	}

	public void delete(Integer id) {
		find(id);
		repo.deleteById(id);
	}

	public List<Curso> findAll() {
		return repo.findAll();
	}
}
