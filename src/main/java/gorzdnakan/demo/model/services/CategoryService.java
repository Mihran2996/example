package gorzdnakan.demo.model.services;

import gorzdnakan.demo.model.Category;
import gorzdnakan.demo.model.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;


}
