package com.masai.Controller;


import com.masai.Entities.Hotels;
import com.masai.Exceptions.ResourcesNotFoundException;
import com.masai.Services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hotels")
public class HotelCtroller {

    @Autowired
    private HotelService hotelService;


    @PostMapping
    public ResponseEntity<?> registerHotel(@RequestBody Hotels hotel) {
        Hotels registeredHotel = hotelService.registerHotel(hotel);
        return ResponseEntity.status(HttpStatus.CREATED).body(registeredHotel);
    }


    @GetMapping("/{hotelId}")
    public ResponseEntity<?> getHotelByHotelId(@PathVariable Integer hotelId) throws ResourcesNotFoundException {
        Hotels hotel = hotelService.getHotelByHotelId(hotelId);
        return ResponseEntity.status(HttpStatus.FOUND).body(hotel);
    }


    @GetMapping
    public ResponseEntity<?> getAllHotel() throws ResourcesNotFoundException {
        return ResponseEntity.ok(hotelService.getAllHotels());
    }


}
