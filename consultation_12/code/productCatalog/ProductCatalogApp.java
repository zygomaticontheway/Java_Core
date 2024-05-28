package productCatalog;

public class ProductCatalogApp {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();

        catalog.addProduct(new Product("Bitburger", 0.95));
        catalog.addProduct(new Product("Woinemer", 2.70));
        catalog.addProduct(new Product("Carlsberg", 0.80));
        catalog.addProduct(new Product("Warsteiner", 0.75));
        catalog.addProduct(new Product("Corona Extra", 1.2));
        catalog.addProduct(new Product("Somersby", 1.49));

        System.out.println(catalog);

        System.out.println(catalog.findProduct(3).getName() + " " + catalog.findProduct(3).getPrice());

        catalog.deleteProductbyId(5);

        System.out.println(catalog);
    }
}
