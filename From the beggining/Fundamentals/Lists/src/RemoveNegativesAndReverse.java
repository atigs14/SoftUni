import java.util.*;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        /*
        Read a list of integers, remove all negative numbers from it and print
        the remaining elements in reversed order. In case of no elements left in the list, print “empty”.
         */

        int[] input = Arrays.stream(console.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        List<Integer> numberList = new ArrayList<>();

        for (int el : input) {
            if (el >= 0){
                numberList.add(el);
            }
        }

        Collections.reverse(numberList);

        if (numberList.isEmpty()){
            System.out.println("empty");
        } else {
            for (int el : numberList) {
                System.out.print(el + " ");
            }
        }






    }
}