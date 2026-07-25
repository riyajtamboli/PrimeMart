package com.primemart.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.primemart.dto.request.CategoryRequest;
import com.primemart.dto.response.CategoryResponse;
import com.primemart.entity.Category;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class CategoryMapper {

    private final ModelMapper mapper;

    public Category toEntity(CategoryRequest request) {
        return mapper.map(request, Category.class);
    }

    public CategoryResponse toResponse(Category category) {
        return mapper.map(category, CategoryResponse.class);
    }

}