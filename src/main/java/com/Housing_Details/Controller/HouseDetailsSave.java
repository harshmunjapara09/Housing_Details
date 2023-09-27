package com.Housing_Details.Controller;

import com.Housing_Details.Entity.House;
import com.Housing_Details.Service.HouserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/housingdetail")
public class HouseDetailsSave {
    @Autowired
    HouserService houserService;
    @PostMapping("/add")
    public List<House> addDetails(@RequestBody List<House> list){
        return houserService.addDetails(list);
    }

    @GetMapping("/avg")
    public Integer average(){
        return houserService.average();
    }

    @GetMapping("/avgBYLocation")
    public List<Object[]> avgByLocation(){
        return houserService.avgByLocation();
    }

    @GetMapping("/max")
    public List<Object[]> maxSalePrice(){
        return houserService.maxSalePrice();
    }
    @GetMapping("min")
    public List<Object[]> minSalePrice(){
        return houserService.minSalePrice();
    }
}
