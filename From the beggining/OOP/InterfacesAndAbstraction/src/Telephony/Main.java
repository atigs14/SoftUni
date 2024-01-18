package Telephony;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        List<String> line1 = Arrays.stream(console.nextLine().split("\\s+")).toList();
        List<String> line2 = Arrays.stream(console.nextLine().split("\\s+")).toList();


        Smartphone smartphone = new Smartphone(line1, line2);

        System.out.println(smartphone.call());
        System.out.println(smartphone.browse());


    }
}
