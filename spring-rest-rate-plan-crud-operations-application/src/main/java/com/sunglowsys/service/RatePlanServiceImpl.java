package com.sunglowsys.service;

import com.sunglowsys.domain.RatePlan;
import com.sunglowsys.repository.RatePlanRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RatePlanServiceImpl implements RatePlanService{
    private  final RatePlanRepository ratePlanRepository;

    public RatePlanServiceImpl(RatePlanRepository ratePlanRepository) {
        this.ratePlanRepository = ratePlanRepository;
    }

    @Override
    public RatePlan save(RatePlan ratePlan) {
        return ratePlanRepository.save(ratePlan);
    }

    @Override
    public RatePlan update(RatePlan ratePlan, Long id) {
        return null;
    }

    @Override
    public List<RatePlan> findAll() {
        return null;
    }

    @Override
    public RatePlan findById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
