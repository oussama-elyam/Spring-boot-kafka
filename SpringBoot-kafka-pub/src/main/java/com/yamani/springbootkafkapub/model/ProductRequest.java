package com.yamani.springbootkafkapub.model;

import lombok.Data;

@Data
public class ProductRequest {
    private String name;
    private String description;
    private int price;
}
