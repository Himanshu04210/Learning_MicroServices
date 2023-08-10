package com.masai.Repositories;

import com.masai.Entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RatingRepository extends JpaRepository<Rating, Integer> {

    List<Rating> findByUserEmail(String email);
    List<Rating> findByHotelId(Integer hotelId);
}
