import java.util.ArrayList;
import java.util.List;

public class ProductService {

    List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }

        return null;
    }


    public List<Product> getProductWithText(String inputText) {
        String text = inputText.toLowerCase();
        List<Product> products1 = new ArrayList<>();

        for (Product product : products) {
            String name = product.getName().toLowerCase();
            String place = product.getPlace().toLowerCase();
            String type = product.getType().toLowerCase();

            if (name.contains(text) || place.contains(text) || type.contains(text)) {
                products1.add(product);
            }
        }

        return products1;
    }

    public List<Product> getProductByPlace(String inputText) {
        String text = inputText.toLowerCase();
        List<Product> products1 = new ArrayList<>();

        for (Product product : products) {
            String place = product.getPlace().toLowerCase();

            if (place.contains(text)) {
                products1.add(product);
            }
        }

        return products1;
    }

    public List<Product> getProductOutOfWarranty(int year) {
        List<Product> products1 = new ArrayList<>();

        for (Product product : products) {
            if (product.getWarranty() <= year) {
                products1.add(product);
            }
        }

        return products1;
    }
}