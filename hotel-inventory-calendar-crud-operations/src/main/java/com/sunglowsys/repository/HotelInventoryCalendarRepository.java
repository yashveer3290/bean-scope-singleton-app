package com.sunglowsys.repository;

import com.sunglowsys.domain.HotelInventoryCalendar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelInventoryCalendarRepository extends JpaRepository<HotelInventoryCalendar, Long> {
}
