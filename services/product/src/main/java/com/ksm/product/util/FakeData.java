package com.ksm.product.util;

import com.github.javafaker.Faker;

import com.ksm.product.request.CategoryRequest;
import com.ksm.product.request.ProductRequest;
import com.ksm.product.service.CategoryService;
import com.ksm.product.service.ProductService;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@RequiredArgsConstructor
public class FakeData {
    private final ProductService productService;
    private final CategoryService categoryService;

    public void addFakeCategories(int count) {
        Faker faker = new Faker();
        for (int i = 0; i < count; i++) {
            String category = faker.commerce().department();
            CategoryRequest categoryRequest = new CategoryRequest(null,
                    category,
                    "Description for " + category);
            categoryService.createCategory(categoryRequest);
        }
    }

    public Integer addFakeCategory(Integer categoryId) {
        Faker faker = new Faker();
        String category = faker.commerce().department();
        CategoryRequest categoryRequest = new CategoryRequest(categoryId,
                category + " - " + faker.number().numberBetween(1, 100),
                "Description for " + category);
        return categoryService.createCategory(categoryRequest);
    }

    public void addFakeProducts(int count) {
        Faker faker = new Faker();
        for (int i = 0; i < count; i++) {
            Integer categoryId = faker.number().numberBetween(1, 100);
            if (!isCategory(categoryId)) {
                categoryId = addFakeCategory(categoryId);
            }

            String productName = faker.commerce().productName();
            ProductRequest productRequest = new ProductRequest(null,
                    productName,
                    "Description for " + productName,
                    faker.number().numberBetween(10, 100),
                    new BigDecimal(faker.number().randomDouble(3, 40, 150)),
                    categoryId);
            productService.createProduct(productRequest);
        }
    }

    public boolean isCategory(Integer categoryId) {
        return categoryService.existsById(categoryId);
    }
}
