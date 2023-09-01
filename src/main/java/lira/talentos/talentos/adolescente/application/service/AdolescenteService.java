package lira.talentos.talentos.adolescente.application.service;

import jakarta.validation.Valid;
import lira.talentos.talentos.adolescente.application.api.request.AdolescenteResquest;
import lira.talentos.talentos.adolescente.application.api.response.AdolescenteResponse;

public interface AdolescenteService {
	AdolescenteResponse criaAdolescente(@Valid AdolescenteResquest adolescenteRequest);

}
