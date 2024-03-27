package com.sky.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class Product {

    private Long prodId;
    final private String prodName;
    final private int prodPrice;
}
