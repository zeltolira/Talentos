package lira.talentos.talentos.adolescente.application.service;

import org.springframework.stereotype.Repository;

import lira.talentos.talentos.adolescente.domain.Adolescente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class AdolescenteInfraRepository implements AdolescenteRepository {

	private final AdolescenteSpringDataJPARepository adolescenteSpringDataJPARepository;

	@Override
	public Adolescente salva(Adolescente adolescente) {
		log.info("[inicia] AdolescenteInfraRepository - salva");
		adolescenteSpringDataJPARepository.save(adolescente);
		log.info("[finaliza] AdolescenteInfraRepository - salva");
		return adolescente;
	}

}
