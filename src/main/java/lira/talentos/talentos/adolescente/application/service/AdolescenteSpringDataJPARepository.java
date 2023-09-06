package lira.talentos.talentos.adolescente.application.service;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import lira.talentos.talentos.adolescente.domain.Adolescente;

public interface AdolescenteSpringDataJPARepository extends JpaRepository<Adolescente, UUID>{

}
