package lira.talentos.talentos.adolescente.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lira.talentos.talentos.adolescente.application.api.request.AdolescenteResquest;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Table(name = "adolescente")
public class Adolescente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "id", updatable = false, unique = true, nullable = false)
	private UUID idAdolescente;
	@NotBlank
	private String nomeAdolescente;
	@NotNull
	private LocalDate dataNascimento;
	@NotBlank
	private String celular;
	@NotNull
	private Sexo sexo;
	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraultimaAlteracao;
	
	
	public Adolescente(AdolescenteResquest adolescenteRequest) {
		this.nomeAdolescente = adolescenteRequest.getNomeAdolescente();
		this.dataNascimento = adolescenteRequest.getDataNascimento();
		this.celular = adolescenteRequest.getCelular();
		this.sexo = adolescenteRequest.getSexo();
		this.dataHoraDoCadastro = LocalDateTime.now();
	}
	
	
}
