package com.masai.Dao;

import com.masai.Entities.Hotels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotels, Integer> {
}
