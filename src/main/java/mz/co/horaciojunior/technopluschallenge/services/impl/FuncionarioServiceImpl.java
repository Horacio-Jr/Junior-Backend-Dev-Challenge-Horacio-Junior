package mz.co.horaciojunior.technopluschallenge.services.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mz.co.horaciojunior.technopluschallenge.domain.Funcionario;
import mz.co.horaciojunior.technopluschallenge.exceptions.DataIntegrityException;
import mz.co.horaciojunior.technopluschallenge.exceptions.ObjectNotFoundException;
import mz.co.horaciojunior.technopluschallenge.repositories.FuncionarioRepository;
import mz.co.horaciojunior.technopluschallenge.services.FuncionarioService;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {

	@Autowired
	private FuncionarioRepository funcionarioRepository;

	@Override
	public Funcionario create(Funcionario funcionario) {
		try {
			return funcionarioRepository.save(funcionario);

		} catch (Exception e) {
			throw new DataIntegrityException("Não foi possivel criar o funcionario no sistema.");
		}
	}

	@Override
	public Funcionario update(Funcionario funcionario) {
		getById(funcionario.getId());
		try {
			return funcionarioRepository.save(funcionario);
		} catch (Exception e) {
			throw new DataIntegrityException("Não foi possivel actualizar os dados do funcionario no sistema.");
		}
	}

	@Override
	public void delete(Long id) {
		getById(id);
		try {
			funcionarioRepository.deleteById(id);
		} catch (Exception e) {
			throw new DataIntegrityException("Não foi possivel excluir o funcionario.");
		}
	}

	@Override
	public Funcionario getById(Long id) {
		Optional<Funcionario> obj = funcionarioRepository.findById(id);
		if (obj.isEmpty()) {
			throw new ObjectNotFoundException("Objecto não encontrado.");
		}
		return obj.get();
	}

	@Override
	public List<Funcionario> getAll() {
		return funcionarioRepository.findAll();
	}

}
