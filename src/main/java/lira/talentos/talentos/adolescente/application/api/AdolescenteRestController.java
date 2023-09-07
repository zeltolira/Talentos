package lira.talentos.talentos.adolescente.application.api;


import org.springframework.web.bind.annotation.RestController;

import lira.talentos.talentos.adolescente.application.api.request.AdolescenteResquest;
import lira.talentos.talentos.adolescente.application.api.response.AdolescenteResponse;
import lira.talentos.talentos.adolescente.application.service.AdolescenteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class AdolescenteRestController implements AdolescenteAPI {

	private final AdolescenteService adolescenteService;

	@Override
	public AdolescenteResponse postAdolescente(AdolescenteResquest adolescenteRequest) {
		log.info("[inicia] AdolescenteRestController - postAdolescente");
		AdolescenteResponse adolescente = adolescenteService.criaAdolescente(adolescenteRequest);
		log.info("[finaliza] AdolescenteRestController - postAdolescente");
		return adolescente;
	}

}
	