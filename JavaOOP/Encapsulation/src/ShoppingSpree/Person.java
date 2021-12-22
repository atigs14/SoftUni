package ShoppingSpree;

import java.util.List;

public class Person {

    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
    }

    private void setName(String name){
        if (name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money){
        if (money < 0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public void buyProduct (Product product){
        if (money < product.getCost()){
            String message = String.format("%s can't afford %s", name, product.getName());
            throw new IllegalArgumentException(message);
        }
        products.add(product);
        money -= product.getCost();
        System.out.printf("%s bought %s%n", name, product.getName());
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts(){
        return this.products;
    }
}
