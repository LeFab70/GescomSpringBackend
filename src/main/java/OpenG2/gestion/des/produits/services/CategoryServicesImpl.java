package OpenG2.gestion.des.produits.services;

import OpenG2.gestion.des.produits.entities.Category;
import OpenG2.gestion.des.produits.repositories.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
@AllArgsConstructor
public class CategoryServicesImpl implements CategoryServices {
    @Autowired
    private final CategoryRepository categoryRepository;

    @Override
    public Iterable<Category> getCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Optional<Category> getCategoryById(Long id) {
        return categoryRepository.findById(id);
    }

    @Override
    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }
}
