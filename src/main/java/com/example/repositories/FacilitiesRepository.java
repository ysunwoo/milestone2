package com.example.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Facilities;

import java.util.List;

@Repository
public interface FacilitiesRepository extends MongoRepository<Facilities, String> {
    List<Facilities> findByStatus(String status);
}
