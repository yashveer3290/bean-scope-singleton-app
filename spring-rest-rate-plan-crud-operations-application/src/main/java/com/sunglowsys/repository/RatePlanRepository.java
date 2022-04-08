package com.sunglowsys.repository;

import com.sunglowsys.domain.RatePlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatePlanRepository extends JpaRepository<RatePlan, Long> {
}
