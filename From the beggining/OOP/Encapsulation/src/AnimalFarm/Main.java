package AnimalFarm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String chickenName = console.nextLine();
        int years = Integer.parseInt(console.nextLine());

        try{
            Chicken chicken = new Chicken(chickenName, years);

            System.out.println(chicken);

        } catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }
}
