package com.sunglowsys.service;

import com.sunglowsys.domain.RatePlan;

import java.util.List;

public interface RatePlanService {
    RatePlan save(RatePlan ratePlan);

    RatePlan update(RatePlan ratePlan,Long id);

    List<RatePlan> findAll();

    RatePlan findById(Long id);

    void delete(Long id);
}
