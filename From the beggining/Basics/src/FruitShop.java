import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        /*
        Напишете програма, която чете от конзолата плод (banana / apple / orange / grapefruit / kiwi / pineapple / grapes),
        ден от седмицата (Monday / Tuesday / Wednesday / Thursday / Friday / Saturday / Sunday) и количество (десетично число) ,
        въведени от потребителя, и пресмята цената според цените от таблиците по-горе. При невалиден ден от седмицата или
        невалидно име на плод да се отпечата „error“.
         */

        String product = console.nextLine().toLowerCase();
        String weekDay = console.nextLine().toLowerCase();
        double quantity = Double.parseDouble(console.nextLine());


        double price = -1;
        boolean IsThereError = false;

        if (weekDay.equals("saturday") || weekDay.equals("sunday")) {
            switch (product) {
                case "banana":
                    price = quantity * 2.70;
                    break;
                case "apple":
                    price = quantity * 1.25;
                    break;
                case "orange":
                    price = quantity * 0.90;
                    break;
                case "grapefruit":
                    price = quantity * 1.60;
                    break;
                case "kiwi":
                    price = quantity * 3.00;
                    break;
                case "pineapple":
                    price = quantity * 5.60;
                    break;
                case "grapes":
                    price = quantity * 4.20;
                    break;
                default:
                    IsThereError = true;
            }
        } else if (weekDay.equals("monday") || weekDay.equals("tuesday") || weekDay.equals("wednesday") || weekDay.equals("thursday") || weekDay.equals("friday")) {
            switch (product) {
                case "banana":
                    price = quantity * 2.50;
                    break;
                case "apple":
                    price = quantity * 1.20;
                    break;
                case "orange":
                    price = quantity * 0.85;
                    break;
                case "grapefruit":
                    price = quantity * 1.45;
                    break;
                case "kiwi":
                    price = quantity * 2.70;
                    break;
                case "pineapple":
                    price = quantity * 5.50;
                    break;
                case "grapes":
                    price = quantity * 3.85;
                    break;
                default:
                    IsThereError = true;
            }
        } else {
            IsThereError = true;
        }

        if (!IsThereError) {
            System.out.printf("%.2f", price);
        } else {
            System.out.println("error");
        }


    }
}
