package com.Colegio20221204.PruebaTecnicaColegio.repository;

import com.Colegio20221204.PruebaTecnicaColegio.persistence.dtos.AsignaturaInfoDto;
import com.Colegio20221204.PruebaTecnicaColegio.persistence.entities.AsignaturaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AsignaturaRepository extends JpaRepository <AsignaturaEntity, Long>{

    /**
     * Proyecciones basadas en clases
     * @param id_profesor
     * @return
     */
    @Query("SELECT new com.Colegio20221204.PruebaTecnicaColegio.persistence.dtos.AsignaturaInfoDto(a.id, a.nombre) " +
            "FROM AsignaturaEntity a " +
            "WHERE a.id_profesor = :id_profesor " )
    List<AsignaturaInfoDto> GetAsignatureByTeacher(Long id_profesor);
}
