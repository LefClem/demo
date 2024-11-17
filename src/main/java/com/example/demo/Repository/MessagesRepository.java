package com.example.demo.Repository;

import com.example.demo.Entity.MESSAGES;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessagesRepository extends CrudRepository<MESSAGES, Integer> {
}
