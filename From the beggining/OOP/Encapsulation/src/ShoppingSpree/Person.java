package ShoppingSpree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setName(String name) {
        if (name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void buyProduct(Product product) {

        if (money - product.getCost() < 0) {
            throw new IllegalArgumentException(String.format("%s can't afford %s", name, product.getName()));
        }

        money -= product.getCost();
        products.add(product);
        System.out.printf("%s bought %s%n",name, product.getName());
    }

    @Override
    public String toString() {
        if (products.isEmpty()){
            return name + " can't afford anything";
        }
        StringBuilder result = new StringBuilder(name + " - ");
        for (int i = 0; i < products.size(); i++) {
            result.append(products.get(i).getName());
            if (i < products.size() - 1){
                result.append(", ");
            }
        }

        return result.toString();
    }
}
