public class StringCounter {
    public static void main(String[] args) {

        String numbers = "2743338823081";
        int total = 0;

        for (int i = 0; i < numbers.length(); i++) {
            total ++;
        }

        System.out.println(total);
    }
}
