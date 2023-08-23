package OpenG2.gestion.des.produits.services;

import OpenG2.gestion.des.produits.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class ProductServicesImpl implements ProductServices {
    @Autowired
    private final ProductRepository productRepository;
}
