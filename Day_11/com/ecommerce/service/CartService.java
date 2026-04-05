package Day_11.com.ecommerce.service;
import Day_11.com.ecommerce.model.*;
import java.util.*;
public class CartService {
    private ArrayList<Product> cart=new ArrayList<>();
    public void addProduct(Product product){
        cart.add(product);
    }public int calculateTotal(){
        int total=0;
        for(Product product:cart){
            total+=product.getPrice();
        }
        return total;
    }
    public void showCart(){
        for(Product p:cart){
            p.display();
        }
    }
}