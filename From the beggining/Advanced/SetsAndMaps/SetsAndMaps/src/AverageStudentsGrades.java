import java.util.*;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        /*
        Write a program, which reads the name of a student and their grades and adds them to the student record,
        then prints grades along with their average grade – ordered the output by the names of the students.
        Input
          On the first line N – the number of students, then on the next N lines student name with grade.
         */

        int linesOfInput = Integer.parseInt(console.nextLine());

        Map<String, ArrayList<Double>> grades = new TreeMap<>();

        for (int i = 0; i < linesOfInput; i++) {
            String[] line = console.nextLine().split(" ");
            String name = line[0];
            Double grade =  Double.parseDouble(line[1]);

            if (!grades.containsKey(name)) {
                grades.put(name, new ArrayList<>());
            }
            grades.get(name).add(grade);
        }

        for (String kid : grades.keySet()) {
            System.out.print(kid + " -> ");

            double sumGrade = 0;
            for (Double grade : grades.get(kid)) {
                 sumGrade += grade;
                System.out.printf("%.2f ",grade);
            }

            double avgGrade = sumGrade / grades.get(kid).size();

            System.out.printf("(avg: %.2f)",avgGrade);
            System.out.println();
        }
    }
}
