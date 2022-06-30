package mz.co.horaciojunior.technopluschallenge.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "TBL_ENDERECO")
public class Endereco implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	private String avenida;
	private String bairro;
	private int casa;
	private int quarteirao;
	private int predio;
	private int andar;
	
	@ManyToOne
	@JoinColumn(name = "distrito_id")
	private Distrito distrito;

	@JsonBackReference
	@OneToOne
	@JoinColumn(name = "funcionario_id")
	@MapsId
	private Funcionario funcionario;

	public Endereco() {
	}

	public Endereco(Long id, String avenida, String bairro, int casa, int quarteirao, int predio, int andar,
			Distrito distrito) {
		super();
		this.id = id;
		this.avenida = avenida;
		this.bairro = bairro;
		this.casa = casa;
		this.quarteirao = quarteirao;
		this.predio = predio;
		this.andar = andar;
		this.distrito = distrito;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAvenida() {
		return avenida;
	}

	public void setAvenida(String avenida) {
		this.avenida = avenida;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getCasa() {
		return casa;
	}

	public void setCasa(int casa) {
		this.casa = casa;
	}

	public int getQuarteirao() {
		return quarteirao;
	}

	public void setQuarteirao(int quarteirao) {
		this.quarteirao = quarteirao;
	}

	public int getPredio() {
		return predio;
	}

	public void setPredio(int predio) {
		this.predio = predio;
	}

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}

	public Distrito getDistrito() {
		return distrito;
	}

	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		return Objects.equals(id, other.id);
	}
	
}
