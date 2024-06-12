package com.ksm.product.service;

import com.ksm.product.mapper.CategoryMapper;
import com.ksm.product.repository.CategoryRepository;
import com.ksm.product.request.CategoryRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    public Integer createCategory(CategoryRequest categoryRequest) {
        var category = categoryMapper.toCategory(categoryRequest);
        return categoryRepository.save(category).getId();
    }

    public boolean existsById(Integer id) {
        return categoryRepository.findById(id)
                .isPresent();
    }
}
