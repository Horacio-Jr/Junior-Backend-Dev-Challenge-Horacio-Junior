package mz.co.horaciojunior.technopluschallenge;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import mz.co.horaciojunior.technopluschallenge.domain.Distrito;
import mz.co.horaciojunior.technopluschallenge.domain.DocumentoIdentificacao;
import mz.co.horaciojunior.technopluschallenge.domain.Endereco;
import mz.co.horaciojunior.technopluschallenge.domain.Funcionario;
import mz.co.horaciojunior.technopluschallenge.domain.Provincia;
import mz.co.horaciojunior.technopluschallenge.domain.enums.EstadoCivil;
import mz.co.horaciojunior.technopluschallenge.domain.enums.TipoDocumento;
import mz.co.horaciojunior.technopluschallenge.repositories.DistritoRepository;
import mz.co.horaciojunior.technopluschallenge.repositories.FuncionarioRepository;
import mz.co.horaciojunior.technopluschallenge.repositories.ProvinciaRepository;

@SpringBootApplication
public class TechnopluschallengeApplication implements CommandLineRunner {

	@Resource
	ProvinciaRepository provinciaRepository;

	@Resource
	DistritoRepository distritoRepository;
	
	@Resource
	FuncionarioRepository funcionarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(TechnopluschallengeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Provincia p1 = new Provincia(null, "Cabo Delgado");
		Provincia p2 = new Provincia(null, "Gaza");
		Provincia p3 = new Provincia(null, "Inhambane");
		Provincia p4 = new Provincia(null, "Manica");
		Provincia p5 = new Provincia(null, "Maputo");
		Provincia p6 = new Provincia(null, "Maputo Cidade");
		Provincia p7 = new Provincia(null, "Nampula");
		Provincia p8 = new Provincia(null, "Niassa");
		Provincia p9 = new Provincia(null, "Sofala");
		Provincia p10 = new Provincia(null, "Tete");
		Provincia p11 = new Provincia(null, "Zambézia");

		Distrito d1 = new Distrito(null, "Ancuabe", p1);
		Distrito d2 = new Distrito(null, "Balama", p1);
		Distrito d3 = new Distrito(null, "Chiúre", p1);
		Distrito d4 = new Distrito(null, "Ibo", p1);
		Distrito d5 = new Distrito(null, "Macomia", p1);
		Distrito d6 = new Distrito(null, "Mecúfi", p1);
		Distrito d7 = new Distrito(null, "Meluco", p1);
		Distrito d8 = new Distrito(null, "Metuge", p1);
		Distrito d9 = new Distrito(null, "Mocímboa da Praia", p1);
		Distrito d10 = new Distrito(null, "Montepuez", p1);
		Distrito d11 = new Distrito(null, "Mueda", p1);
		Distrito d12 = new Distrito(null, "Muidumbe", p1);
		Distrito d13 = new Distrito(null, "Namuno", p1);
		Distrito d14 = new Distrito(null, "Nangade", p1);
		Distrito d15 = new Distrito(null, "Palma", p1);
		Distrito d16 = new Distrito(null, "Pemba", p1);
		Distrito d17 = new Distrito(null, "Quissanga", p1);
		Distrito d18 = new Distrito(null, "Bilene", p2);
		Distrito d19 = new Distrito(null, "Chibuto", p2);
		Distrito d20 = new Distrito(null, "Chicualacuala", p2);
		Distrito d21 = new Distrito(null, "Chigubo", p2);
		Distrito d22 = new Distrito(null, "Chókwè", p2);
		Distrito d23 = new Distrito(null, "Chongoene", p2);
		Distrito d24 = new Distrito(null, "Guijá", p2);
		Distrito d25 = new Distrito(null, "Limpopo", p2);
		Distrito d26 = new Distrito(null, "Mabalane", p2);
		Distrito d27 = new Distrito(null, "Manjacaze", p2);
		Distrito d28 = new Distrito(null, "Mapai", p2);
		Distrito d29 = new Distrito(null, "Massangena", p2);
		Distrito d30 = new Distrito(null, "Massingir", p2);
		Distrito d31 = new Distrito(null, "Xai-Xai", p2);
		Distrito d32 = new Distrito(null, "Funhalouro", p3);
		Distrito d33 = new Distrito(null, "Govuro", p3);
		Distrito d34 = new Distrito(null, "Homoíne", p3);
		Distrito d35 = new Distrito(null, "Inhambane", p3);
		Distrito d36 = new Distrito(null, "Inharrime", p3);
		Distrito d37 = new Distrito(null, "Inhassoro", p3);
		Distrito d38 = new Distrito(null, "Jangamo", p3);
		Distrito d39 = new Distrito(null, "Mabote", p3);
		Distrito d40 = new Distrito(null, "Massinga", p3);
		Distrito d41 = new Distrito(null, "Maxixe", p3);
		Distrito d42 = new Distrito(null, "Morrumbene", p3);
		Distrito d43 = new Distrito(null, "Panda", p3);
		Distrito d44 = new Distrito(null, "Vilanculos", p3);
		Distrito d45 = new Distrito(null, "Zavala", p3);
		Distrito d46 = new Distrito(null, "Bárue", p4);
		Distrito d47 = new Distrito(null, "Chimoio", p4);
		Distrito d48 = new Distrito(null, "Gondola", p4);
		Distrito d49 = new Distrito(null, "Guro", p4);
		Distrito d50 = new Distrito(null, "Macate", p4);
		Distrito d51 = new Distrito(null, "Machaze", p4);
		Distrito d52 = new Distrito(null, "Macossa", p4);
		Distrito d53 = new Distrito(null, "Manica", p4);
		Distrito d54 = new Distrito(null, "Mossurize", p4);
		Distrito d55 = new Distrito(null, "Sussundenga", p4);
		Distrito d56 = new Distrito(null, "Tambara", p4);
		Distrito d57 = new Distrito(null, "Vanduzi", p4);
		Distrito d58 = new Distrito(null, "Boane", p5);
		Distrito d59 = new Distrito(null, "Magude", p5);
		Distrito d60 = new Distrito(null, "Manhiça", p5);
		Distrito d61 = new Distrito(null, "Marracuene", p5);
		Distrito d62 = new Distrito(null, "Matola", p5);
		Distrito d63 = new Distrito(null, "Matutuíne", p5);
		Distrito d64 = new Distrito(null, "Moamba", p5);
		Distrito d65 = new Distrito(null, "Namaacha", p5);
		Distrito d66 = new Distrito(null, "Urbano de KaMpfumo", p6);
		Distrito d67 = new Distrito(null, "Urbano de Nlhamankulu", p6);
		Distrito d68 = new Distrito(null, "Urbano de KaMaxaquene", p6);
		Distrito d69 = new Distrito(null, "Urbano de KaMavota", p6);
		Distrito d70 = new Distrito(null, "Urbano de KaMubukwana", p6);
		Distrito d71 = new Distrito(null, "Municipal de KaTembe", p6);
		Distrito d72 = new Distrito(null, "Municipal de KaNyaka", p6);
		Distrito d73 = new Distrito(null, "Angoche", p7);
		Distrito d74 = new Distrito(null, "Eráti", p7);
		Distrito d75 = new Distrito(null, "Ilha de Moçambique", p7);
		Distrito d76 = new Distrito(null, "Lalaua", p7);
		Distrito d77 = new Distrito(null, "Larde", p7);
		Distrito d78 = new Distrito(null, "Liúpo", p7);
		Distrito d79 = new Distrito(null, "Malema", p7);
		Distrito d80 = new Distrito(null, "Meconta", p7);
		Distrito d81 = new Distrito(null, "Mecubúri", p7);
		Distrito d82 = new Distrito(null, "Memba", p7);
		Distrito d83 = new Distrito(null, "Mogincual", p7);
		Distrito d84 = new Distrito(null, "Mogovolas", p7);
		Distrito d85 = new Distrito(null, "Moma", p7);
		Distrito d86 = new Distrito(null, "Monapo", p7);
		Distrito d87 = new Distrito(null, "Mossuril", p7);
		Distrito d88 = new Distrito(null, "Muecate", p7);
		Distrito d89 = new Distrito(null, "Murrupula", p7);
		Distrito d90 = new Distrito(null, "Nacala-a-Velha", p7);
		Distrito d91 = new Distrito(null, "Nacala Porto", p7);
		Distrito d92 = new Distrito(null, "Nacarôa", p7);
		Distrito d93 = new Distrito(null, "Nampula", p7);
		Distrito d94 = new Distrito(null, "Rapale", p7);
		Distrito d95 = new Distrito(null, "Ribaué", p7);
		Distrito d96 = new Distrito(null, "Chimbonila", p8);
		Distrito d97 = new Distrito(null, "Cuamba", p8);
		Distrito d98 = new Distrito(null, "Lago", p8);
		Distrito d99 = new Distrito(null, "Lichinga", p8);
		Distrito d100 = new Distrito(null, "Majune", p8);
		Distrito d101 = new Distrito(null, "Mandimba", p8);
		Distrito d102 = new Distrito(null, "Marrupa", p8);
		Distrito d103 = new Distrito(null, "Maúa", p8);
		Distrito d104 = new Distrito(null, "Mavago", p8);
		Distrito d105 = new Distrito(null, "Mecanhelas", p8);
		Distrito d106 = new Distrito(null, "Mecula", p8);
		Distrito d107 = new Distrito(null, "Metarica", p8);
		Distrito d108 = new Distrito(null, "Muembe", p8);
		Distrito d109 = new Distrito(null, "N'gauma", p8);
		Distrito d110 = new Distrito(null, "Nipepe", p8);
		Distrito d111 = new Distrito(null, "Sanga", p8);
		Distrito d112 = new Distrito(null, "Beira", p9);
		Distrito d113 = new Distrito(null, "Búzi", p9);
		Distrito d114 = new Distrito(null, "Caia", p9);
		Distrito d115 = new Distrito(null, "Chemba", p9);
		Distrito d116 = new Distrito(null, "Cheringoma", p9);
		Distrito d117 = new Distrito(null, "Chibabava", p9);
		Distrito d118 = new Distrito(null, "Dondo", p9);
		Distrito d119 = new Distrito(null, "Gorongosa", p9);
		Distrito d120 = new Distrito(null, "Machanga", p9);
		Distrito d121 = new Distrito(null, "Maringué", p9);
		Distrito d122 = new Distrito(null, "Marromeu", p9);
		Distrito d123 = new Distrito(null, "Muanza", p9);
		Distrito d124 = new Distrito(null, "Nhamatanda", p9);
		Distrito d125 = new Distrito(null, "Angónia", p10);
		Distrito d126 = new Distrito(null, "Cahora-Bassa", p10);
		Distrito d127 = new Distrito(null, "Changara", p10);
		Distrito d128 = new Distrito(null, "Chifunde", p10);
		Distrito d129 = new Distrito(null, "Chiuta", p10);
		Distrito d130 = new Distrito(null, "Dôa", p10);
		Distrito d131 = new Distrito(null, "Macanga", p10);
		Distrito d132 = new Distrito(null, "Magoé", p10);
		Distrito d133 = new Distrito(null, "Marara", p10);
		Distrito d134 = new Distrito(null, "Marávia", p10);
		Distrito d135 = new Distrito(null, "Moatize", p10);
		Distrito d136 = new Distrito(null, "Mutarara", p10);
		Distrito d137 = new Distrito(null, "Tete", p10);
		Distrito d138 = new Distrito(null, "Tsangano", p10);
		Distrito d139 = new Distrito(null, "Zumbo", p10);
		Distrito d140 = new Distrito(null, "Alto Molócue", p11);
		Distrito d141 = new Distrito(null, "Chinde", p11);
		Distrito d142 = new Distrito(null, "Derre", p11);
		Distrito d143 = new Distrito(null, "Gilé", p11);
		Distrito d144 = new Distrito(null, "Gurué", p11);
		Distrito d145 = new Distrito(null, "Ile", p11);
		Distrito d146 = new Distrito(null, "Inhassunge", p11);
		Distrito d147 = new Distrito(null, "Luabo", p11);
		Distrito d148 = new Distrito(null, "Lugela", p11);
		Distrito d149 = new Distrito(null, "Maganja da Costa", p11);
		Distrito d150 = new Distrito(null, "Milange", p11);
		Distrito d151 = new Distrito(null, "Mocuba", p11);
		Distrito d152 = new Distrito(null, "Mocubela", p11);
		Distrito d153 = new Distrito(null, "Molumbo", p11);
		Distrito d154 = new Distrito(null, "Mopeia", p11);
		Distrito d155 = new Distrito(null, "Morrumbala", p11);
		Distrito d156 = new Distrito(null, "Mulevala", p11);
		Distrito d157 = new Distrito(null, "Namacurra", p11);
		Distrito d158 = new Distrito(null, "Namarroi", p11);
		Distrito d159 = new Distrito(null, "Nicoadala", p11);
		Distrito d160 = new Distrito(null, "Pebane", p11);
		Distrito d161 = new Distrito(null, "Quelimane", p11);

		List<Distrito> distritos = Arrays.asList(d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d13, d14, d15, d16,
				d17, d18, d19, d20, d21, d22, d23, d24, d25, d26, d27, d28, d29, d30, d31, d32, d33, d34, d35, d36, d37,
				d38, d39, d40, d41, d42, d43, d44, d45, d46, d47, d48, d49, d50, d51, d52, d53, d54, d55, d56, d57, d58,
				d59, d60, d61, d62, d63, d64, d65, d66, d67, d68, d69, d70, d71, d72, d73, d74, d75, d76, d77, d78, d79,
				d80, d81, d82, d83, d84, d85, d86, d87, d88, d89, d90, d91, d92, d93, d94, d95, d96, d97, d98, d99,
				d100, d101, d102, d103, d104, d105, d106, d107, d108, d109, d110, d111, d112, d113, d114, d115, d116,
				d117, d118, d119, d120, d121, d122, d123, d124, d125, d126, d127, d128, d129, d130, d131, d132, d133,
				d134, d135, d136, d137, d138, d139, d140, d141, d142, d143, d144, d145, d146, d147, d148, d149, d150,
				d151, d152, d153, d154, d155, d156, d157, d158, d159, d160, d161);

		List<Provincia> provincias = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
		
		provinciaRepository.saveAll(provincias);
		distritoRepository.saveAll(distritos);
		
		
		Funcionario employer = new Funcionario(null, "Horacio Vicente", "Comate Junior", new Date(), EstadoCivil.SOLTEIRO, "hocomatejr@gmail.com", "13276310");
		
		DocumentoIdentificacao document = new DocumentoIdentificacao(null, TipoDocumento.BI, "110101197665P", new Date());
		document.setFuncionario(employer);
		
		Endereco address = new Endereco(null, "Av. Milagre Mabote", "Bairro de Maxaquene B", 60, 33, 0, 0, distritoRepository.findById(Long.valueOf(1)).get());
		address.setFuncionario(employer);
		
		employer.setDocumentoIdentificacao(document);
		employer.setEndereco(address);
		
		Set<String> contacts = new HashSet<String>();
		contacts.add("+258847557499");
		contacts.add("+258877557400");
		
		employer.setContactos(contacts);
		
		funcionarioRepository.save(employer);
		

	}

}
