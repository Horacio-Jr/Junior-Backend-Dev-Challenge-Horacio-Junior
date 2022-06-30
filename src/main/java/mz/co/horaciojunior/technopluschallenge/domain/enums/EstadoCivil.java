package mz.co.horaciojunior.technopluschallenge.domain.enums;

public enum EstadoCivil {
	SOLTEIRO(1, "Solterio (a)"), CASADO(2, "Casado (a)");

	private int codigo;
	private String descritivo;

	private EstadoCivil(int codigo, String descritivo) {
		this.codigo = codigo;
		this.descritivo = descritivo;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescritivo() {
		return descritivo;
	}

	public static EstadoCivil toEnum(Integer codigo) {
		if (codigo == null) {
			return null;
		}

		for (EstadoCivil estadoCivil : EstadoCivil.values()) {
			if (codigo.equals(estadoCivil.getCodigo())) {
				return estadoCivil;
			}
		}

		throw new IllegalArgumentException("Id inválido: " + codigo);
	}

}
