package lira.talentos.talentos.adolescente.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;
import lira.talentos.talentos.adolescente.application.api.request.AdolescenteResquest;
import lira.talentos.talentos.adolescente.application.api.response.AdolescenteResponse;

@RestController
@RequestMapping("/v1/adolescente")
public interface AdolescenteAPI {

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	AdolescenteResponse postAdolescente(@Valid @RequestBody AdolescenteResquest adolescenteRequest);
}
