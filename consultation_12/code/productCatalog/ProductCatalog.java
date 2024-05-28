package productCatalog;

import java.util.Map;
import java.util.TreeMap;

public class ProductCatalog {
    private static Integer productId = 0;
    private Map<Integer, Product> catalog;

    public ProductCatalog() {
        this.catalog = new TreeMap<>() {
        };
    }

    public void addProduct (Product product){
            if(!catalog.containsValue(product.getName())){
                catalog.put(productId, product);
                System.out.println("Product " + '\"' + product.getName() + '\"' + " added");
                productId++;
            }
    }
    public boolean deleteProductbyId (Integer productId){
        if (catalog.containsKey(productId) ){
            catalog.remove(productId);
            System.out.println("Product with id " + productId + " has been deleted");
            return true;
        }
        System.out.println("Product with id " + productId + " was not found");
        return false;
    }
    public Product findProduct (Integer productId){
             return catalog.get(productId);
    }

    @Override
    public String toString() {
        return "ProductCatalog{" +
                "catalog=" + catalog +
                '}';
    }
}
