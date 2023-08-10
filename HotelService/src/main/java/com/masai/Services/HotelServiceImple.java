package com.masai.Services;

import com.masai.Dao.HotelRepository;
import com.masai.Entities.Hotels;
import com.masai.Exceptions.ResourcesNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HotelServiceImple implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotels registerHotel(Hotels hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public Hotels getHotelByHotelId(Integer hotelId) throws ResourcesNotFoundException {
        return hotelRepository.findById(hotelId).orElseThrow(() -> new ResourcesNotFoundException("No hotel is present with this hotel id"));
    }

    @Override
    public List<Hotels> getAllHotels() throws ResourcesNotFoundException {
        List<Hotels> hotels = hotelRepository.findAll();
        if(hotels.isEmpty()) throw new ResourcesNotFoundException("No hotel is present in database");
        return hotels;
    }
}
