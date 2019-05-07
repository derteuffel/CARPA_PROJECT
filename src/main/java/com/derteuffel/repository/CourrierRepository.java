package com.derteuffel.repository;

import com.derteuffel.entities.Courrier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by derteuffel on 06/05/2019.
 */
@Repository
public interface CourrierRepository extends JpaRepository<Courrier, Long> {
    List<Courrier> findByUsers_userId(Long userId);
    @Query("select c from Courrier as c join c.status cs where cs.statusId=:id order by c.courrierId desc")
    List<Courrier> findAllByStatus(@Param("id") Long statusId);
}
