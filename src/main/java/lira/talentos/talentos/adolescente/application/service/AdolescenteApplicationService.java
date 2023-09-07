package lira.talentos.talentos.adolescente.application.service;

import org.springframework.stereotype.Service;

import lira.talentos.talentos.adolescente.application.api.request.AdolescenteResquest;
import lira.talentos.talentos.adolescente.application.api.response.AdolescenteResponse;
import lira.talentos.talentos.adolescente.application.repository.AdolescenteRepository;
import lira.talentos.talentos.adolescente.domain.Adolescente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class AdolescenteApplicationService implements AdolescenteService {

	private final AdolescenteRepository adolescenteRepository;

	@Override
	public AdolescenteResponse criaAdolescente(AdolescenteResquest adolescenteRequest) {
		log.info("[inicia] AdolescenteApplicationService - criaAdolescente");
		Adolescente adolescente = adolescenteRepository.salva(new Adolescente(adolescenteRequest));
		log.info("[finaliza] AdolescenteApplicationService - criaAdolescente");
		return AdolescenteResponse.builder()
				.idAdolescente(adolescente.getIdAdolescente())
				.build();
	}

}
