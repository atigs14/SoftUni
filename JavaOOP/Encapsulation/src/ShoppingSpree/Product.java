package ShoppingSpree;

public class Product {
    private String name;
    private double cost;

    public Product(String name, double cost) {
        this.setName(name);
        this.setCost(cost);
    }

    private void setCost(double cost){
        if (cost < 0){
            throw new IllegalArgumentException("Cost can't be negative");
        }
        this.cost = cost;
    }

    private void setName(String name){
        if (name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be negative");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }


}
