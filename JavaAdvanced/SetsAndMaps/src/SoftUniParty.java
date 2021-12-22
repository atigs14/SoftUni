import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> guest = new TreeSet<>();
        Set<String> VIP = new TreeSet<>();

        String guestID = scanner.nextLine();

        while (!guestID.equals("PARTY")) {
            if (Character.isDigit(guestID.charAt(0))){
                VIP.add(guestID);
            }else {
                guest.add(guestID);
            }
            guestID = scanner.nextLine();
        }

        while (!guestID.equals("END")){
            if (Character.isDigit(guestID.charAt(0))){
                VIP.remove(guestID);
            }else {
                guest.remove(guestID);
            }
            guestID = scanner.nextLine();
        }

        int whoDidntCome = VIP.size() + guest.size();

        System.out.println(whoDidntCome);
        if (!VIP.isEmpty()){
            System.out.println(String.join(System.lineSeparator(), VIP));
        }
        if (!guest.isEmpty()){
            System.out.println(String.join(System.lineSeparator(), guest));
        }

    }
}
