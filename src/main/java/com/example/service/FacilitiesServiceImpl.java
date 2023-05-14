package com.example.service;

import org.springframework.stereotype.Service;
import com.example.model.Facilities;
import com.example.repositories.FacilitiesRepository;
import java.util.List;

@Service
public class FacilitiesServiceImpl implements FacilitiesService {

    private final FacilitiesRepository facilitiesRepository;

    public FacilitiesServiceImpl(FacilitiesRepository facilitiesRepository) {
        this.facilitiesRepository = facilitiesRepository;
    }

    @Override
    public Facilities createFacility(Facilities facilities) {
        return facilitiesRepository.save(facilities);
    }

    @Override
    public List<Facilities> getAllFacilities() {
        return facilitiesRepository.findAll();
    }

    @Override
    public List<Facilities> getFacilitiesByStatus(String status) {
        return facilitiesRepository.findByStatus(status);
    }
}
