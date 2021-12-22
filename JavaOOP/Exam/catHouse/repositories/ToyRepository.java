package catHouse.repositories;

import catHouse.entities.toys.Toy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ToyRepository  implements Repository{
    private List<Toy> toys;

    public ToyRepository() {
        toys = new ArrayList<>();
    }

    @Override
    public void buyToy(Toy toy) {
        toys.add(toy);
    }

    @Override
    public boolean removeToy(Toy toy) {
        return toys.removeIf(t -> t.getPrice() == toy.getPrice()
        && t.getSoftness() == toy.getSoftness());
    }

    @Override
    public Toy findFirst(String type) {
        return toys.stream().filter(t -> t.getClass().getSimpleName().equals(type))
                .findFirst()
                .orElse(null);

    }
}
