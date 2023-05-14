package com.example.service;

import com.example.model.Facilities;
import java.util.List;

public interface FacilitiesService {
    Facilities createFacility(Facilities facilities);
    List<Facilities> getAllFacilities();
    List<Facilities> getFacilitiesByStatus(String status);
}
