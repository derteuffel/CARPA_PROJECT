package com.derteuffel.repository;

import com.derteuffel.entities.Rapport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by derteuffel on 06/05/2019.
 */
@Repository
public interface RapportRepository extends JpaRepository<Rapport,Long> {

    @Query("select r from Rapport as r join r.project rp where rp.projectId=:id order by r.rapportId desc")
    List<Rapport> findAllByProject(@Param("id") Long rapporId);
}
