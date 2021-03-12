package service;

import lombok.RequiredArgsConstructor;
import model.Product;
import model.ProductDto;
import org.springframework.stereotype.Service;
import repository.ProductRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public Optional<ProductDto> findProductById(Long id){
        return productRepository.findById(id).map(ProductDto::new);
    }

    public List<ProductDto> findAllProducts() {
        return productRepository.findAll().stream().map(ProductDto::new).collect(Collectors.toList());
    }

    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }

    public ProductDto saveNewProduct(ProductDto product) {
        Product newProduct = new Product();
        newProduct.setTitle(product.getTitle());
        newProduct.setPrice(product.getPrice());
        productRepository.save(newProduct);
        product.setId(newProduct.getId());
        return product;
    }
}
