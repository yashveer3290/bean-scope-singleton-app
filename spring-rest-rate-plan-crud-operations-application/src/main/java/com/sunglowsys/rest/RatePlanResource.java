package com.sunglowsys.rest;

import com.sunglowsys.domain.RatePlan;
import com.sunglowsys.service.RatePlanService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RatePlanResource {
    private static final Logger LOGGER = LoggerFactory.getLogger(RatePlanResource.class);

    private final RatePlanService ratePlanService;


    public RatePlanResource(RatePlanService ratePlanService) {
        this.ratePlanService = ratePlanService;
    }
    @PostMapping("/rate-plans")
    public ResponseEntity<RatePlan> createRatePlan(@RequestBody RatePlan ratePlan){
        RatePlan result = ratePlanService.save(ratePlan);
        return ResponseEntity.
                ok(result);
    }
}
