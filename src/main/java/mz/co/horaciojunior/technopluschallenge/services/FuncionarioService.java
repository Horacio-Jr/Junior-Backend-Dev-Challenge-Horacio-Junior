package mz.co.horaciojunior.technopluschallenge.services;

import java.util.List;

import mz.co.horaciojunior.technopluschallenge.domain.Funcionario;

public interface FuncionarioService {

	Funcionario create(Funcionario funcionario);

	Funcionario update(Funcionario funcionario);

	void delete(Long id);

	Funcionario getById(Long id);

	List<Funcionario> getAll();

}
