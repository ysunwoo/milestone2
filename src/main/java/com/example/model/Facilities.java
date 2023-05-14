package com.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
@Data
@Document(collection = "facilities")
@JsonInclude(JsonInclude.Include.NON_NULL)

public class Facilities {
    @Id
    private String id;
    private String facilityId;
    private String facilityName;
    private String status;

    public Facilities(){
    }

    public Facilities(String facilityId, String facilityName, String status){
        this.facilityId = facilityId;
        this.facilityName = facilityName;
        this.status = status;
    }
}
