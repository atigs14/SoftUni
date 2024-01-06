package OpinionPoll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        TreeSet<Person> people = new TreeSet<>(Comparator.comparing(Person::getName));

        int n = Integer.parseInt(console.nextLine());

        while (n-- > 0){
            String[] tokens = console.nextLine().split(" ");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);

            Person person = new Person(name, age);

            people.add(person);

        }

        for (Person person : people) {
            if (person.getAge() > 30){
                System.out.printf("%s - %d%n",person.getName(), person.getAge());
            }
        }
    }
}
