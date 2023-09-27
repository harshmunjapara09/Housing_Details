package com.Housing_Details.Service;

import com.Housing_Details.Entity.House;
import com.Housing_Details.Repositroy.HouserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouserService {

    @Autowired
    HouserRepo houserRepo;
    
    public List<House> addDetails(List<House> list) {
        return houserRepo.saveAll(list);
    }

    public Integer average() {
        return houserRepo.findAvg();
    }

    public List<Object[]> avgByLocation() {
        return houserRepo.avgByLocation();
    }

    public List<Object[]> maxSalePrice() {
        return houserRepo.maxSalePrice();
    }

    public List<Object[]> minSalePrice() {
        return houserRepo.minSalePrice();
    }
}
