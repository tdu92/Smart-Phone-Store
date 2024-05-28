package com.codegym.smartphonestore.service;

import com.codegym.smartphonestore.model.Product;
import com.codegym.smartphonestore.service.IGenerateService;

import java.util.List;

public interface IProductService extends IGenerateService<Product> {
    List<Product> findByNameContaining(String name);
}
