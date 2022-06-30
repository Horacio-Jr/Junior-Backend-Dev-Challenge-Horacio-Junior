package mz.co.horaciojunior.technopluschallenge.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

import mz.co.horaciojunior.technopluschallenge.domain.enums.TipoDocumento;

@Entity
@Table(name = "TBL_DOC_IDENTIFICACAO")
public class DocumentoIdentificacao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	private Integer tipo;
	
	@Column(unique = true)
	private String numero;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	private Date dataValidade;

	@JsonBackReference
	@OneToOne
	@JoinColumn(name = "funcionario_id")
	@MapsId
	private Funcionario funcionario;

	public DocumentoIdentificacao() {
	}

	public DocumentoIdentificacao(Long id, TipoDocumento tipo, String numero, Date dataValidade) {
		super();
		this.id = id;
		this.tipo = tipo.getCodigo();
		this.numero = numero;
		this.dataValidade = dataValidade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoDocumento getTipo() {
		return TipoDocumento.toEnum(tipo);
	}

	public void setTipo(TipoDocumento tipo) {
		this.tipo = tipo.getCodigo();
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
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
		DocumentoIdentificacao other = (DocumentoIdentificacao) obj;
		return Objects.equals(id, other.id);
	}

}
