package com.patikapaycoreumutyildiz.BookShop.Controller;

import com.patikapaycoreumutyildiz.BookShop.Business.abstracts.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/category/")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;
}