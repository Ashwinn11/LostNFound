package com.lost.found.repository;

import com.lost.found.entity.Found;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoundRepository extends JpaRepository<Found,Long> {
}
