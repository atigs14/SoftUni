package GenericScale;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        Scale<String> scale = new Scale<>("left", "right");
        Scale<String> scale1 = new Scale<>("right", "right");
        Scale<Integer> scale2 = new Scale<>(2, 5);



        System.out.println(scale.getHeavier());
        System.out.println(scale1.getHeavier());
        System.out.println(scale2.getHeavier());
    }
}
