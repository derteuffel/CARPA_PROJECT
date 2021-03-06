package com.derteuffel.repository;

import com.derteuffel.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by derteuffel on 06/05/2019.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
