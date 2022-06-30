package mz.co.horaciojunior.technopluschallenge.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mz.co.horaciojunior.technopluschallenge.domain.Funcionario;
import mz.co.horaciojunior.technopluschallenge.services.FuncionarioService;

@CrossOrigin
@RestController
@RequestMapping(value = "funcionarios")
public class FuncionarioResource {

	@Autowired
	private FuncionarioService funcionarioService;

	@PostMapping
	public ResponseEntity<Funcionario> create(@Validated @RequestBody Funcionario obj) {
		Funcionario fObj = funcionarioService.create(obj);
		return new ResponseEntity<Funcionario>(fObj, HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Funcionario> update(@PathVariable Long id, @Validated @RequestBody Funcionario obj) {
		obj.setId(id);
		Funcionario fObj = funcionarioService.update(obj);
		return new ResponseEntity<Funcionario>(fObj, HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<Funcionario>> getAll() {
		return ResponseEntity.ok().body(funcionarioService.getAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Funcionario> getById(@PathVariable Long id) {
		Funcionario obj = funcionarioService.getById(id);
		return ResponseEntity.ok().body(obj);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		funcionarioService.delete(id);
		return ResponseEntity.noContent().build();
	}

}
