package projectecommerce;

import java.util.ArrayList;

public class ProductList implements Managemet {

    private final ArrayList<Product> products = new ArrayList<>();

    public ProductList() {

    }

    @Override
    public void addProduct(Product p) {
        products.add(p);
    }

    @Override
    public void removeProduct(Product p) {
        products.remove(p);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public String getNextId(){
        String id = products.get(products.size()-1).getId();
        id = String.valueOf(Integer.parseInt(id)+1);
        id = "0".repeat(3-id.length())+id;
        return id;
    }
}
