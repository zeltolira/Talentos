package lira.talentos.talentos.adolescente.application.api.request;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lira.talentos.talentos.adolescente.domain.Sexo;
import lombok.Value;

@Value
public class AdolescenteResquest {
	private String nomeAdolescente;
	@NotNull
	private LocalDate dataNascimento;
	@NotBlank
	private String celular;
	@NotNull
	private Sexo sexo;
}
