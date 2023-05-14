package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.model.Facilities;
import com.example.service.FacilitiesService;

import java.util.List;

@RestController
@RequestMapping("/facility")
public class FacilitiesController {

    private final FacilitiesService facilitiesService;

    public FacilitiesController(FacilitiesService facilitiesService) {
        this.facilitiesService = facilitiesService;
    }

    @PostMapping
    public Facilities createFacility(@RequestBody Facilities facilities) {
        return facilitiesService.createFacility(facilities);
    }

    @GetMapping
    public List<Facilities> getAllFacilities() {
        return facilitiesService.getAllFacilities();
    }

    @GetMapping("/status/{status}")
    public List<Facilities> getFacilitiesByStatus(@PathVariable String status) {
        return facilitiesService.getFacilitiesByStatus(status);
    }
}
