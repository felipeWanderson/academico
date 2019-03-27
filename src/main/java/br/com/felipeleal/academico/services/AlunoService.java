package br.com.felipeleal.academico.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.felipeleal.academico.domain.Aluno;
import br.com.felipeleal.academico.repositories.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository repo;
	
	
	public Aluno find(Integer id){
		Optional<Aluno> obj = repo.findById(id);
		return obj.orElse(null);
		
	}


	public Aluno insert(Aluno obj) {
		obj.setId(null);
		return repo.save(obj);
	}


	public Aluno update(Aluno obj) {
		find(obj.getId());
		return repo.save(obj);
	}


	public void delete(Integer id) {
		find(id);
		repo.deleteById(id);
	}


	public List<Aluno> findAll() {
		return repo.findAll();
	}
}
