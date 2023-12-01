import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double age = Double.parseDouble(console.nextLine());

        String gender = console.nextLine();

        if (gender.equals("m") && age >= 16){
            System.out.println("Mr.");
        }else if (gender.equals("m")){
            System.out.println("Master");
        }

        if (gender.equals("f") && age >= 16){
            System.out.println("Ms.");
        }else if (gender.equals("f")){
            System.out.println("Miss");
        }
    }
}
