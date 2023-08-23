package OpenG2.gestion.des.produits.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "produit")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nom_produit",length = 70,unique = true,nullable = false)
    private String name;
    @Column(length = 100,nullable = false)
    private  String description;
    private double cost;
    @OneToMany(mappedBy = "product")
    private List<Comment> comments;
    @ManyToMany
    @JoinTable(name = "produit_categorie",
    joinColumns = @JoinColumn(name = "produit_id"),
    inverseJoinColumns = @JoinColumn(name = "category_id"))
    private List<Category> categories;
}
