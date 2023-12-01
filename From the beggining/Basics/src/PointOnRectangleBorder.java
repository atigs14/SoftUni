import java.util.Scanner;

public class PointOnRectangleBorder {
    public static void main(String[] args) {

        /*
        Напишете програма, която проверява дали точка {x, y} се намира върху някоя от страните на правоъгълник {x1, y1} – {x2, y2}.
        Входните данни се четат от конзолата и се състоят от 6 реда, въведени от потребителя: десетичните числа x1, y1, x2, y2, x и y
        (като се гарантира, че x1 < x2 и y1 < y2). Да се отпечата „Border“ (точката лежи на някоя от страните) или
        „Inside / Outside“ (в противен случай).
         */
        Scanner console = new Scanner(System.in);
        double x1 = Double.parseDouble(console.nextLine());
        double y1 = Double.parseDouble(console.nextLine());
        double x2 = Double.parseDouble(console.nextLine());
        double y2 = Double.parseDouble(console.nextLine());
        double x = Double.parseDouble(console.nextLine());
        double y = Double.parseDouble(console.nextLine());

        if ((x == x1 || x == x2) && y >= y1 && y <= y2) {
            PrintOutput();
        } else if ((y == y1 || y == y2) && x >= x1 && x <= x2){
            PrintOutput();
        } else {
            System.out.println("Inside / Outside");
        }
    }

    private static void PrintOutput(){
        System.out.println("Border");
    }
}


