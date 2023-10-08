package test.task1;

import java.util.ArrayList;
import java.util.List;

public class Verding {

    private final List<Product> list;

    public Verding() {
        list=new ArrayList<>();
    }

    void addProduct(Product product){
        list.add(product);
    }


    Product getProduct(String king){
        for (Product product : list) {
            if (king.equals(product.getCoffee())){
                return product;
            }
        }
        return null;
    }
    Product getProduct(Integer temp){
        for (Product product : list) {
            if (temp.equals(product.getTemp())){
                return product;
            }
        }
        return null;
    }
}
