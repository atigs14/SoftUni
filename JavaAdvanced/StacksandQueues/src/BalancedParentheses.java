import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //{[()]}
//elements[i] != "]" || elements[i] != ")"|| elements[i] != "}"
        ArrayDeque<String> leftPart = new ArrayDeque<>();
        ArrayDeque<String> rightPart = new ArrayDeque<>();

        boolean isTrue = true;
        String[] elements = scanner.nextLine().split("");
        for (int i = 0; i < elements.length; i++) {
            if (elements[i].equals("]") || elements[i].equals(")")|| elements[i].equals("}")){
                rightPart.add(elements[i]);
            } else {
                leftPart.push(elements[i]);
            }
        }

        while (!leftPart.isEmpty()){
            String leftElement = leftPart.pop();
            String rightElement = rightPart.remove();

            if (leftElement.equals("{") && rightElement.equals("}")){

            } else if (leftElement.equals("(") && rightElement.equals(")")){

            } else if (leftElement.equals("[") && rightElement.equals("]")){

            }
            else {
                isTrue = false;
                break;
            }



        }
        if (isTrue) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
