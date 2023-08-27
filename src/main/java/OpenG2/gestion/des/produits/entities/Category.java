package OpenG2.gestion.des.produits.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "categorie")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nom",length = 70,unique = true)
    private String name;
    @ManyToMany(mappedBy = "categories")
    private List<Product> products;

//    @ManyToMany(
//            fetch = FetchType.LAZY,
//            cascade = {
//                    CascadeType.PERSIST,
//                    CascadeType.MERGE
//            }
//    )
//    @JoinTable(
//            name = "categorie_produit",
//            joinColumns = @JoinColumn(name = "categorie_id"),
//            inverseJoinColumns = @JoinColumn(name = "produit_id")
//    )
//    private List<Product> products = new ArrayList<>();


}
