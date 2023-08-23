package OpenG2.gestion.des.produits.services;

import OpenG2.gestion.des.produits.repositories.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class CategoryServicesImpl implements CategoryServices {
    @Autowired
    private final CategoryRepository categoryRepository;
}
