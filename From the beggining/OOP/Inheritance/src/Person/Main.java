package Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String name = console.nextLine();
        int age = Integer.parseInt(console.nextLine());

        Child child = new Child(name,age);

        System.out.println(child.getName());
        System.out.println(child.getAge());
    }
}