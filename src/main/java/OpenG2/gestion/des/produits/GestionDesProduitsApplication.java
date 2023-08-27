package OpenG2.gestion.des.produits;

import OpenG2.gestion.des.produits.entities.Category;
import OpenG2.gestion.des.produits.entities.Product;
import OpenG2.gestion.des.produits.services.CategoryServices;
import OpenG2.gestion.des.produits.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

import java.util.stream.Stream;

//implements CommandLineRunner
@SpringBootApplication
public class GestionDesProduitsApplication   {

	public static void main(String[] args) {
		SpringApplication.run(GestionDesProduitsApplication.class, args);
	}


//	@Autowired
//	private CategoryServices categoryServices;
//	@Autowired
//	private ProductServices productServices;
////	@Override
//	@Transactional
//	public void run(String... args) throws Exception {
//
//		Stream.of("biere","jus","water").forEach(cat->{
//			Category category=new Category();
//			category.setName(cat.toUpperCase());
//			category=categoryServices.addCategory(category);
//		});
//
//
//		Stream.of("break","milk","coca").forEach(prod->{
//			Product product=new Product();
//			product.setName(prod.toUpperCase());
//			product.setCost(Math.random()*10000);
//			product.setDescription("desc_"+prod.toLowerCase());
//			productServices.addProduct(product);
//		});
//
//		categoryServices.getCategories().forEach(category1 -> System.out.println(category1.getName()));
//		System.out.println("======================================");
//		productServices.getProducts().forEach(product -> System.out.println(product.getName()+" "+ product.getDescription()+" "+ product.getCost()));
//	}



}
