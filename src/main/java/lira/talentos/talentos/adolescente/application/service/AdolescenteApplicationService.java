package lira.talentos.talentos.adolescente.application.service;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;
import lira.talentos.talentos.adolescente.application.api.request.AdolescenteResquest;
import lira.talentos.talentos.adolescente.application.api.response.AdolescenteResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class AdolescenteApplicationService implements AdolescenteService {

	@Override
	public AdolescenteResponse criaAdolescente(@Valid AdolescenteResquest adolescenteRequest) {
		log.info("[inicia] AdolescenteApplicationService - criaAdolescente");
		log.info("[finaliza] AdolescenteApplicationService - criaAdolescente");
		return null;
	}

}
