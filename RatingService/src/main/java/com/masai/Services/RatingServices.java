package com.masai.Services;

import com.masai.Entities.Rating;
import com.masai.Exceptions.ResourcesNotFoundException;

import java.util.List;

public interface RatingServices {
    public Rating createRating(Rating rating);
    public Rating getRatingByRatingId(Integer ratingId) throws ResourcesNotFoundException;

    public List<Rating> getAllRating() throws ResourcesNotFoundException;
    public List<Rating> getRatingByUserEmail(String email) throws ResourcesNotFoundException;

    public List<Rating> getRatingByHotelId(Integer hotelId)  throws ResourcesNotFoundException;
}
