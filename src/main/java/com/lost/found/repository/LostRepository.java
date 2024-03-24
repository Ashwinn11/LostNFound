package com.lost.found.repository;

import com.lost.found.entity.Lost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LostRepository extends JpaRepository<Lost,Long> {
}
