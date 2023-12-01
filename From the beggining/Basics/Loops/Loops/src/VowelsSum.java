import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {

        /*
        Да се напише програма, която чете текст (стринг), въведен от потребителя, и изчислява и отпечатва сумата от стойностите на
        гласните букви според таблицата по-долу:
            буква	    a	e	i	o	u
            стойност	1	2	3	4	5
         */

        Scanner console = new Scanner(System.in);

        String input = console.nextLine();

        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a'){
                sum += 1;
            } else if (input.charAt(i) == 'e'){
                sum += 2;
            } else if (input.charAt(i) == 'i'){
                sum += 3;
            } else if (input.charAt(i) == 'o'){
                sum += 4;
            } else if (input.charAt(i) == 'u'){
                sum += 5;
            }
        }

        System.out.println(sum);
    }
}
