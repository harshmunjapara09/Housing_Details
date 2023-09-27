package com.Housing_Details.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int Bedrooms;
    double Bathrooms;
    double SquareFootage;
    String Location;
    int SalePrice;
}
