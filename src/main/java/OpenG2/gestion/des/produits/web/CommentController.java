package OpenG2.gestion.des.produits.web;


import OpenG2.gestion.des.produits.entities.Comment;
import OpenG2.gestion.des.produits.services.CommentServices;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comment")
@AllArgsConstructor
@Slf4j
public class CommentController {

    private final CommentServices commentServices;
@PostMapping
@ResponseStatus(HttpStatus.CREATED)
    public void newComment(@RequestBody Comment comment)
{
    commentServices.saveComment(comment);
    log.info("comment save, status pending");
}
}
