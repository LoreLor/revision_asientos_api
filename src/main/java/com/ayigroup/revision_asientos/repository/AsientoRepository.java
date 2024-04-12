package com.ayigroup.revision_asientos.repository;

import com.ayigroup.revision_asientos.entities.Asiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsientoRepository extends JpaRepository<Asiento, Integer> {

}
