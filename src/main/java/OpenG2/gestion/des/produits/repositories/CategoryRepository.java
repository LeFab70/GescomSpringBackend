package OpenG2.gestion.des.produits.repositories;

import OpenG2.gestion.des.produits.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
}
