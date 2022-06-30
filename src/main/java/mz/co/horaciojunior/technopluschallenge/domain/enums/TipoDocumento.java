package mz.co.horaciojunior.technopluschallenge.domain.enums;

public enum TipoDocumento {

	BI(1, "Bilhete de Identidade"), PASSAPORTE(2, "Passaporte Nacional");

	private int codigo;
	private String descritivo;

	private TipoDocumento(int codigo, String descritivo) {
		this.codigo = codigo;
		this.descritivo = descritivo;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescritivo() {
		return descritivo;
	}

	public static TipoDocumento toEnum(Integer codigo) {
		if (codigo == null) {
			return null;
		}

		for (TipoDocumento tipoDocumento : TipoDocumento.values()) {
			if (codigo.equals(tipoDocumento.getCodigo())) {
				return tipoDocumento;
			}
		}

		throw new IllegalArgumentException("Id inválido: " + codigo);
	}
}
