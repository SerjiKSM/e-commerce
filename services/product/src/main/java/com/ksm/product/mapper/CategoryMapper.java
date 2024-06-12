package com.ksm.product.mapper;

import com.ksm.product.entity.Category;
import com.ksm.product.request.CategoryRequest;
import org.springframework.stereotype.Service;

@Service
public class CategoryMapper {
    public Category toCategory(CategoryRequest request) {
        return Category.builder()
                .id(request.id())
                .name(request.name())
                .description(request.description())
                .build();
    }
}
