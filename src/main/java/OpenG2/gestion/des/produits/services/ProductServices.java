package OpenG2.gestion.des.produits.services;

import OpenG2.gestion.des.produits.entities.Product;

import java.util.Optional;

public interface ProductServices {
    Iterable<Product> getProducts();
    Optional<Product> getProductById(Long id);

    Product addProduct(Product product);
}
