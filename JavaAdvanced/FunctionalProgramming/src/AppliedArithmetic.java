import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int[] numbers = Arrays.stream(input.split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();

        Function<int[], int[]> add = arr -> Arrays.stream(arr).map(num -> num+= 1).toArray();
        Function<int[], int[]> sub = arr -> Arrays.stream(arr).map(num -> num -= 1).toArray();
        Function<int[], int[]> multiply = arr -> Arrays.stream(arr).map(num -> num * 2).toArray();
        Consumer<int[]> print = arr -> Arrays.stream(arr).forEach(el -> System.out.print(el + " "));


        while (!command.equals("end")){

            switch (command){
                case "add":
                    numbers = add.apply(numbers);
                    break;
                case "print":
                    print.accept(numbers);
                    break;
                case "subtract":
                    numbers = sub.apply(numbers);
                    break;
                case "multiply":
                    numbers = multiply.apply(numbers);
                    break;
            }


            command = scanner.nextLine();
        }
    }
}
