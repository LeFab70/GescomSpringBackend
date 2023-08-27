package OpenG2.gestion.des.produits.services;

import OpenG2.gestion.des.produits.entities.Comment;
import OpenG2.gestion.des.produits.repositories.CommentRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class CommentServicesImpl implements CommentServices {
    @Autowired
    private final CommentRepository commentRepository;

    @Override
    public void saveComment(Comment comment) {
        commentRepository.save(comment);
    }
}
