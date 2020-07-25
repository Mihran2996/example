package gorzdnakan.demo.model.controller;

import gorzdnakan.demo.model.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

}
