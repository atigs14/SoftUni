package GenericArrayCreator;

import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


       // String[] strings = ArrayCreator.create(2, "String");
        String[] strings1 = ArrayCreator.create(String.class, 3, "a");
    }
}
