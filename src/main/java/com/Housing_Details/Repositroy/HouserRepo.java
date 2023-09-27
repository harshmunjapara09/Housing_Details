package com.Housing_Details.Repositroy;

import com.Housing_Details.Entity.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HouserRepo extends JpaRepository<House,Integer> {

    @Query (value = "SELECT AVG(sale_price) FROM house" , nativeQuery = true)
    public Integer findAvg();

    @Query(value = "SELECT location,AVG(sale_price)FROM house group by location",nativeQuery = true)
    List<Object[]> avgByLocation();

    @Query(value = "SELECT id, sale_price FROM house WHERE sale_price = (SELECT MAX(sale_price) FROM house)" , nativeQuery = true)
    List<Object[]> maxSalePrice();

    @Query(value = "SELECT id, sale_price FROM house WHERE sale_price = (SELECT MIN(sale_price) FROM house)" ,nativeQuery = true)
    List<Object[]> minSalePrice();
}
