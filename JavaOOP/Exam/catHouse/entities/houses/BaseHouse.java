package catHouse.entities.houses;

import catHouse.entities.cat.Cat;
import catHouse.entities.toys.Toy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static catHouse.common.ConstantMessages.*;
import static catHouse.common.ExceptionMessages.*;

public abstract class BaseHouse implements House {
    private String name;
    private int capacity;
    private List<Toy> toys;
    private List<Cat> cats;

    protected BaseHouse(String name, int capacity) {
        setName(name);
        this.capacity = capacity;
        toys = new ArrayList<>();
        cats = new ArrayList<>();
    }



    @Override
    public int sumSoftness() {
        return toys.stream().mapToInt(Toy::getSoftness).sum();
    }

    @Override
    public void addCat(Cat cat) {
        if (capacity == this.cats.size()) {
            throw new IllegalStateException(NOT_ENOUGH_CAPACITY_FOR_CAT);
        }

        String catType = cat.getClass().getSimpleName().replaceAll("hairCat", "House");

        if (!this.getClass().getSimpleName().contains(catType)){
            throw new IllegalStateException(UNSUITABLE_HOUSE);
        }

        cats.add(cat);
    }

    @Override
    public void removeCat(Cat cat) {
        cats.remove(cat);
    }

    @Override
    public void buyToy(Toy toy) {
        toys.add(toy);
    }

    @Override
    public void feeding() {
        for (Cat c : cats) {
            c.eating();
        }
    }

    @Override
    public String getStatistics() {
        String catInfo = cats.isEmpty()
                ? "none"
                : cats.stream().map(Cat::getName).collect(Collectors.joining(" "));

        String catType = null;
        String catName = null;

        for (Cat c : cats) {
            catName = c.getName();
        }

        for (Cat c : cats) {
            catType = c.getClass().getSimpleName().replaceAll("hairCat", "House");
        }


        return String.format("%s %s:%n" +
                "Cats: %s%n" +
                "Toys: %d Softness: %d", name, catType, catInfo, toys.size(), sumSoftness());
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException(HOUSE_NAME_CANNOT_BE_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    @Override
    public Collection<Cat> getCats() {
        return cats;
    }

    @Override
    public Collection<Toy> getToys() {
        return toys;
    }
}
