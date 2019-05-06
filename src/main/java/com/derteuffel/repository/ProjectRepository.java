package com.derteuffel.repository;

import com.derteuffel.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by derteuffel on 06/05/2019.
 */
@Repository
public interface ProjectRepository extends JpaRepository<Project,Long>{
    List<Project> findByUsers_userId(Long userId);
}
