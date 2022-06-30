package mz.co.horaciojunior.technopluschallenge.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import mz.co.horaciojunior.technopluschallenge.domain.enums.EstadoCivil;

@Entity
@Table(name = "TBL_FUNCIONARIO")
public class Funcionario implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@TableGenerator(name = "TBL_FUNC_ID_SEQ",initialValue = 100, allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.TABLE, generator = "TBL_FUNC_ID_SEQ")
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String apelido;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	private Date dataNascimento;
	
	private Integer estadoCivil;
	
	@JsonManagedReference
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "funcionario")
	private DocumentoIdentificacao documentoIdentificacao;
	
	@Column(unique = true)
	private String email;
	
	@Column(unique = true)
	private String nuit;
	
	@JsonManagedReference
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "funcionario")
	private Endereco endereco;
	
	@ElementCollection
	@CollectionTable(name = "TBL_CONTACTO")
	private Set<String> contactos = new HashSet<>();
	
	public Funcionario() {}

	public Funcionario(Long id, String nome, String apelido, Date dataNascimento, EstadoCivil estadoCivil, String email, String nuit) {
		super();
		this.id = id;
		this.nome = nome;
		this.apelido = apelido;
		this.dataNascimento = dataNascimento;
		this.estadoCivil = estadoCivil.getCodigo();
		this.email = email;
		this.nuit = nuit;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public EstadoCivil getEstadoCivil() {
		return EstadoCivil.toEnum(estadoCivil);
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil.getCodigo();
	}

	public DocumentoIdentificacao getDocumentoIdentificacao() {
		return documentoIdentificacao;
	}

	public void setDocumentoIdentificacao(DocumentoIdentificacao documentoIdentificacao) {
		this.documentoIdentificacao = documentoIdentificacao;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNuit() {
		return nuit;
	}

	public void setNuit(String nuit) {
		this.nuit = nuit;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Set<String> getContactos() {
		return contactos;
	}

	public void setContactos(Set<String> contactos) {
		this.contactos = contactos;
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
		Funcionario other = (Funcionario) obj;
		return Objects.equals(id, other.id);
	}

}
