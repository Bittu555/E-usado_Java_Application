package com.stackroute.emailservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.UUID;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {


    private UUID id;


    private String productName;
    private Double productPrice;


    private String productBrand;
    private String productCategory;


    private String productDescription;
    private HashMap<String, String> productSpecs;
    private String productManufacturedYear;
    private Long productPurchasedDate;
    private String productOwnerEmail;
    private Float productDiscount;
    private Boolean warrantyStatus;
    private Float productDamageLevel;
    private Location location;
   // private Binary[] productImages;
    private Boolean productAvailability;
    private Long productAddedTime;
}
