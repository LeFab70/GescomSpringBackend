package OpenG2.gestion.des.produits.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.engine.internal.Cascade;

import java.util.ArrayList;
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
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Comment> comments;
//    @ManyToMany(
//            mappedBy = "products",
//            cascade = CascadeType.ALL
//    )
//    private List<Category> categories = new ArrayList<>();



    @ManyToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinTable(name = "produit_categorie",
    joinColumns = @JoinColumn(name = "produit_id"),
    inverseJoinColumns = @JoinColumn(name = "category_id"))
    private List<Category> categories;
}
