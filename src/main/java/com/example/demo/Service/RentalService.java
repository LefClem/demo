package com.example.demo.Service;

import com.example.demo.Entity.RENTALS;
import com.example.demo.Repository.RentalRepository;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RentalService {
    @Autowired
    private RentalRepository rentalRespository;
    @Autowired
    private UserRepository userRepository;

    public String createRental(String name, Float surface, Float price, String picture, String description){
        RENTALS n = new RENTALS();
        n.setName(name);
        n.setSurface(surface);
        n.setPrice(price);
        n.setPicture(picture);
        n.setDescription(description);
        n.setCreatedAt();
        n.setUpdatedAt();

        //n.setOwner();
        rentalRespository.save(n);
        return "OK";
    }

    public Iterable<RENTALS> displayRentals(){
        return rentalRespository.findAll();
    }
}
