package com.masai.Services;

import com.masai.Entities.Rating;
import com.masai.Exceptions.ResourcesNotFoundException;
import com.masai.Repositories.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RatingServiceImple implements RatingServices{

    @Autowired
    private RatingRepository ratingRepository;
    @Override
    public Rating createRating(Rating rating) {
        return ratingRepository.save(rating);
    }

    @Override
    public Rating getRatingByRatingId(Integer ratingId) throws ResourcesNotFoundException {
        return ratingRepository.findById(ratingId).orElseThrow(() -> new ResourcesNotFoundException("Rating not present with this rating id"));
    }

    @Override
    public List<Rating> getAllRating() throws ResourcesNotFoundException {
        List<Rating> ratings = ratingRepository.findAll();

        if(ratings.isEmpty()) throw new ResourcesNotFoundException("No rating is present in the database");

        return ratings;
    }

    @Override
    public List<Rating> getRatingByUserEmail(String email) throws ResourcesNotFoundException {
        List<Rating> ratings = ratingRepository.findByUserEmail(email);

        if(ratings.isEmpty()) throw new ResourcesNotFoundException("No rating is present in the database");

        return ratings;
    }

    @Override
    public List<Rating> getRatingByHotelId(Integer hotelId) throws ResourcesNotFoundException {
        List<Rating> ratings = ratingRepository.findByHotelId(hotelId);

        if(ratings.isEmpty()) throw new ResourcesNotFoundException("No rating is present in the database");

        return ratings;
    }
}
