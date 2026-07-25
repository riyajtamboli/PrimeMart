package com.primemart.service;

import java.util.List;

import com.primemart.dto.request.CategoryRequest;
import com.primemart.dto.response.CategoryResponse;

public interface CategoryService {

    CategoryResponse createCategory(CategoryRequest request);

    List<CategoryResponse> getAllCategories();

    CategoryResponse getCategoryById(Long id);

    CategoryResponse updateCategory(Long id, CategoryRequest request);

    void deleteCategory(Long id);
}