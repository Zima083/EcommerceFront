package com.ecom.productcatalog.config;

import com.ecom.productcatalog.model.Category;
import com.ecom.productcatalog.model.product;
import com.ecom.productcatalog.repository.CategoryRepository;
import com.ecom.productcatalog.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataSeeder implements CommandLineRunner {
   private final ProductRepository productRepository;
   private final CategoryRepository categoryRepository;

    public DataSeeder(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        //Clear all existing data
        productRepository.deleteAll();
        categoryRepository.deleteAll();

        //Create Categories
        Category electronics = new Category();
        electronics.setName("Electronics");

        Category clothing = new Category();
        clothing.setName("Clothing");

        Category home = new Category();
        home.setName("Home and Kitchen");

        categoryRepository.save(electronics);
        categoryRepository.save(clothing);
        categoryRepository.save(home);
        //Create products
        product phone = new product();
        phone.setName("SmartPhone");
        phone.setDescription("Latest model phone with amazing features ");
        phone.setPrice(899.78);
        phone.setImageUrl("https://placehold.co/600x400");
        phone.setCategory(electronics);

        product laptop = new product();
        laptop.setName("Laptop");
        laptop.setDescription("High amazing features ");
        laptop.setPrice(899.78);
        laptop.setImageUrl("https://placehold.co/600x400");
        laptop.setCategory(electronics);

        product jacket = new product();
        jacket.setName("Leather");
        jacket.setDescription("Warm and cozy jacket for winter");
        jacket.setPrice(199.45);
        jacket.setImageUrl("https://placehold.co/600x400");
        jacket.setCategory(clothing);

        product blender = new product();
        blender.setName("blender");
        blender.setDescription("High speed blender for smoothy ");
        blender.setPrice(899.78);
        blender.setImageUrl("https://placehold.co/600x400");
        blender.setCategory(home);
        productRepository.saveAll(Arrays.asList(phone, laptop, jacket,blender));
    }


}
