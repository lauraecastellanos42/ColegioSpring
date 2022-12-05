package com.Colegio20221204.PruebaTecnicaColegio.repository;

import com.Colegio20221204.PruebaTecnicaColegio.persistence.dtos.ProfesorDto;
import com.Colegio20221204.PruebaTecnicaColegio.persistence.entities.ProfesorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProfesorRepository extends JpaRepository<ProfesorEntity, Long> {

    /**
     * Proyección cerrada nativo
     */
    @Query(value = "SELECT profesor.* \n" +
            "FROM profesor\n", nativeQuery = true)
    List<Object[]> findAllTeachersDto();
}
