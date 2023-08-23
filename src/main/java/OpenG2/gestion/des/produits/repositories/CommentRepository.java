package OpenG2.gestion.des.produits.repositories;

import OpenG2.gestion.des.produits.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Long> {
}
