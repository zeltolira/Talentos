package lira.talentos.talentos.adolescente.application.api.request;

import java.time.LocalDate;

import lira.talentos.talentos.adolescente.domain.Sexo;
import lombok.Value;

@Value
public class AdolescenteResquest {
	private String nomeAdolescente;
	private String documento;
	private LocalDate dataNascimento;
	private String celular;
	private Sexo sexo;
}
