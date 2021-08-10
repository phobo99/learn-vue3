package com.homework.apiproducts.repository;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.homework.apiproducts.model.Product;

import org.springframework.stereotype.Repository;

@Repository
public class ProductDao extends Dao<Product> {
    public ProductDao() {
        collections.add(new Product(1L, "IPhone XSMax 256GB", "PC", 599.99F, 12, "iphone-x.jpg"));
        collections.add(new Product(2L, "IPhone 11 Pro Max 256GB", "Headphone", 899.99F, 34, "iphone-11.jpg"));
        collections.add(new Product(3L, "IPhone 12 Pro Max 256GB", "Smartphone", 1299.99F, 14, "iphone-12.jpg"));
        collections.add(new Product(4L, "MacBook Pro M1 2020 8GB/256GB", "Laptop", 899.99F, 12, "laptop3.jpg"));
        collections.add(new Product(5L, "MSI Gaming GF65 10UE", "Laptop", 1299.99F, 34, "laptop2.jpg"));
        collections.add(new Product(6L, "Acer Nitro 5 Gaming AN515", "Laptop", 1699.99F, 14, "laptop1.jpg"));
        collections.add(new Product(7L, "Bluetooth AirPods Max Apple", "Headphone", 299.99F, 12, "phone1.jpg"));
        collections.add(new Product(8L, "Bluetooth AirPods 2 Wireless", "Headphone", 399.99F, 34, "phone2.jpg"));
        collections.add(new Product(9L, "Bluetooth AirPods Pro", "Headphone", 599.99F, 14, "phone3.jpg"));
    }

    @Override
    public List<Product> getAll() {
        // TODO Auto-generated method stub
        return collections;
    }

    @Override
    public Optional<Product> getById(Long id) {
        // TODO Auto-generated method stub
        return collections.stream().filter((ele) -> {
            return ele.getId().equals(id);
        }).findFirst();
    }

    @Override
    public void add(Product product) {
        // TODO Auto-generated method stub
        Long id;
        if (collections.isEmpty()) {
            id = 1L;
        } else {
            Product lastProduct = collections.get(collections.size() - 1);
            id = lastProduct.getId() + 1;
        }
        product.setId(id);
        collections.add(product);
    }

    @Override
    public void update(Product product) {
        // TODO Auto-generated method stub
        this.getById(product.getId()).ifPresent(existProduct -> {
            existProduct.setName(product.getName());
            existProduct.setCategory(product.getCategory());
            existProduct.setPrice(product.getPrice());
            existProduct.setImage(product.getImage());
            existProduct.setQuantity(product.getQuantity());
        });
    }

    @Override
    public void delete(Product product) {
        // TODO Auto-generated method stub
        this.getById(product.getId()).ifPresent(existProduct -> {
            collections.remove(existProduct);
        });
    }

    public List<Product> searchByKeyword(String keyword, String sort) {
        // List sau khi search
        List<Product> products = collections
                .stream()
                .filter(product -> {
                    return product.getName().toLowerCase().contains(keyword.toLowerCase())
                            || product.getCategory().toLowerCase().contains(keyword.toLowerCase());
                }).collect(Collectors.toList());
        // Kiểm tra điều kiện sort hiện tại
        if (sort.equals("asc")) {
            return products
                    .stream()
                    .sorted(Comparator.comparing(Product::getPrice, (o1, o2) -> {
                        return o1.compareTo(o2);
                    }))
                    .collect(Collectors.toList());
        } else if (sort.equals("desc")) {
            return products
                    .stream()
                    .sorted(Comparator.comparing(Product::getPrice, (o1, o2) -> {
                        return o2.compareTo(o1);
                    }))
                    .collect(Collectors.toList());
        }
        return products;
    }
}