package com.example.demo.Repository;

import com.example.demo.Entity.RENTALS;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalRepository extends CrudRepository<RENTALS, Integer> {
}
