package OpenG2.gestion.des.produits.services;

import OpenG2.gestion.des.produits.entities.Category;

import java.util.Optional;

public interface CategoryServices {
    Iterable<Category> getCategories();
    Optional<Category> getCategoryById(Long id);
    Category addCategory(Category category);
}
