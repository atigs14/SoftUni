import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (n >= 1 && n <= 7){
            System.out.println(days[n-1]);
        } else {
            System.out.println("Invalid day");
        }


    }
}