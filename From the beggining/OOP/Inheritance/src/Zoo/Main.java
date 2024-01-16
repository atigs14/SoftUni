package Zoo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        Animal animal = new Animal("Animal");
        Snake snake = new Snake("Snake");

        System.out.println(snake);
        System.out.println(animal);
    }
}
