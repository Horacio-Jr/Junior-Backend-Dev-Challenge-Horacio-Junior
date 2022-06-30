package mz.co.horaciojunior.technopluschallenge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mz.co.horaciojunior.technopluschallenge.domain.Distrito;

@Repository
public interface DistritoRepository extends JpaRepository<Distrito, Long> {

}
