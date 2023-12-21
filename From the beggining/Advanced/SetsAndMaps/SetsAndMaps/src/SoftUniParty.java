import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        /*
        There is a party in SoftUni. Many guests are invited, and they are two types: VIP and regular. When guest comes, you have to check if he/she exist in any of two reservation lists. All reservation numbers will be with 8 chars. All VIP numbers start with digit.
        There will be 2 command lines:
        · First is "PARTY" - party is on and guests start coming.
        · Second is "END" - then party is over, and no more guest will come.
        Output shows all guests, who didn't come to the party (VIP must be first).
         */

        Set<String> guests = new TreeSet<>();


        String line = console.nextLine();
        while (!line.equals("PARTY")) {
            guests.add(line);
            line = console.nextLine();
        }

        while (!line.equals("END")) {
            guests.remove(line);

            line = console.nextLine();

        }

        System.out.println(guests.size());
        for (String guest :
                guests) {
            System.out.println(guest);
        }
    }
}
