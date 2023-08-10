package com.masai.Controller;

import com.masai.Entities.Rating;
import com.masai.Exceptions.ResourcesNotFoundException;
import com.masai.Services.RatingServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    private RatingServices ratingServices;

    @PostMapping
    public ResponseEntity<?> createRating(@RequestBody Rating rating) {
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingServices.createRating(rating));
    }

    @GetMapping("/ratingId/{ratingId}")
    public ResponseEntity<?> getRatingByRatingId(@PathVariable Integer ratingId) throws ResourcesNotFoundException {
        return ResponseEntity.status(HttpStatus.FOUND).body(ratingServices.getRatingByRatingId(ratingId));
    }

    @GetMapping("/userEmail/{userEmail}")
    public ResponseEntity<List<?>> getRatingByUserEmail(@PathVariable String userEmail) throws ResourcesNotFoundException {
        return ResponseEntity.status(HttpStatus.OK).body(ratingServices.getRatingByUserEmail(userEmail));
    }


    @GetMapping("/hotelId/{hotelId}")
    public ResponseEntity<List<?>> getRatingByUserEmail(@PathVariable Integer hotelId) throws ResourcesNotFoundException {
        return ResponseEntity.status(HttpStatus.OK).body(ratingServices.getRatingByHotelId(hotelId));
    }

    @GetMapping
    public ResponseEntity<List<?>> getAllRating() throws ResourcesNotFoundException {
        return ResponseEntity.status(HttpStatus.OK).body(ratingServices.getAllRating());
    }
}
