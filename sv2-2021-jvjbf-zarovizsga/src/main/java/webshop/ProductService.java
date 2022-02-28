package webshop;

public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void saleProduct(long id, int amount) {
        Product productFromDatabase = productRepository.findProductById(id);
        if(productFromDatabase.getStock() >= amount) {
            productRepository.updateProductStock(id, amount);
        } else {
            throw new IllegalArgumentException("Cannot enough stock!");
        }
    }
}
