package ss.spring.cloud.prodocts.conroller;

import lombok.RequiredArgsConstructor;
import ss.spring.cloud.prodocts.model.ProductDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ss.spring.cloud.prodocts.service.ProductService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin //позволяет сюда стучаться с других серваков
//@RequestMapping ("/api/v1/products") zuul итак редиректит на этот адрес
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public List<ProductDto> findAllProducts() {
        return productService.findAllProducts();
    }

    @GetMapping("/{id}")
    public ProductDto findProductById(@PathVariable Long id) {
        return productService.findProductById(id).get();
    }

    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable Long id) {
        productService.deleteProductById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductDto saveNewProduct(ProductDto product) {
        product.setId(null);
        return productService.saveNewProduct(product);
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
