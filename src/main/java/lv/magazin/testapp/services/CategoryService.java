package lv.magazin.testapp.services;

import lv.magazin.testapp.domain.Category;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class CategoryService {

    private Map<Long,Category> categories;

    @PostConstruct
    public void init() {
        categories = new HashMap<Long, Category>();
        put(new Category("Kitchen", 1));
        put(new Category("Bedroom", 2));
        put(new Category("Bathroom", 3));
        put(new Category("Lounge", 4));
    }

    private void put(Category category) {
        if (categories.containsKey(category.getCategoryId())) {
            throw new IllegalArgumentException("Category id already exist " + category.getCategoryId());
        }
        categories.put(category.getCategoryId(), category);
    }

    public List<Category> getAll(){
        return new ArrayList<Category>(categories.values());
    }

    public Category getCategoryById(long categoryId){
        return categories.get(categoryId);
    }
}
