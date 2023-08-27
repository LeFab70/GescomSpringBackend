package OpenG2.gestion.des.produits.entities;

import OpenG2.gestion.des.produits.enums.CommentStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "commentaire")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComment;
    @Column(name = "contenu",length = 100)
    private String content;
    private CommentStatus commentStatus;
    @ManyToOne
    private Product product;

}
