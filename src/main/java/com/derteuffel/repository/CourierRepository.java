package com.derteuffel.repository;

import com.derteuffel.entities.Courier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by derteuffel on 06/05/2019.
 */
@Repository
public interface CourierRepository extends JpaRepository<Courier, Long> {
    List<Courier> findByUsers_userId(Long userId);
    @Query("select c from Courier as c join c.status cs where cs.statusId=:id order by c.courierId desc")
    List<Courier> findAllByStatus(@Param("id") Long statusId);
}
