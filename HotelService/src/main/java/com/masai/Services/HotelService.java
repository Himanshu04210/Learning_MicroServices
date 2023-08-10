package com.masai.Services;

import com.masai.Entities.Hotels;
import com.masai.Exceptions.ResourcesNotFoundException;

import java.util.List;

public interface HotelService {

    public Hotels registerHotel(Hotels hotel);
    public Hotels getHotelByHotelId(Integer hotelId) throws ResourcesNotFoundException;
    public List<Hotels> getAllHotels() throws ResourcesNotFoundException;
}
