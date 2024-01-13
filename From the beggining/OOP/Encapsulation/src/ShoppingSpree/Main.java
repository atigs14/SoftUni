package ShoppingSpree;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        Scanner console = new Scanner(System.in);


        List<Person> people = new ArrayList<>();
        List<Product> products = new ArrayList<>();

        String[] tokens1 = console.nextLine().split(";");

        //Reading Person info - name and money
        for (String string : tokens1) {

            Result result = getDetails(string);

            try {
                Person person = new Person(result.name(), result.money());
                people.add(person);

            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
        }

        String[] tokens2 = console.nextLine().split(";");

        //Reading Products info
        for (String s : tokens2) {
            Result result = getDetails(s);

            try {
                Product product = new Product(result.name, result.money);
                products.add(product);

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        }

        String command = console.nextLine();

        //Shopping part
        while (!command.equals("END")){
            String[] tokens = command.split(" ");
            String name = tokens[0];
            String productName = tokens[1];

            Person person = getNameFromList(people, name);
            Product product = getNameFromList(products, productName);

            assert person != null;
            assert product != null;
            try {
                person.buyProduct(product);

            } catch (IllegalArgumentException e){

                System.out.println(e.getMessage());
            }

            command= console.nextLine();
        }

        //PrintShoppingResult

        for (Person person : people) {
            System.out.println(person);
        }
    }



    private static <T> T getNameFromList(List<T> list, String name) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        for (T item : list) {
            String getName = (String) item.getClass().getMethod("getName").invoke(item);
            if (getName.equals(name)){
                return item;
            }
        }
        return null;
    }

    private static Result getDetails(String tokens) {
        String[] personDetails = tokens.split("=");
        String name = personDetails[0];
        double money = Double.parseDouble(personDetails[1]);
        return new Result(name, money);
    }

    private record Result(String name, double money) {
    }
}
