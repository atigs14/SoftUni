import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        /*
        The printer queue is a simple way to control the order of files sent to a printer device.
        We know that a single printer can be shared between multiple devices. So to preserve the order of the files sent, we can use queue.
        Write a program, which takes filenames until "print" command is received.
        Then as output print the filenames in the order of printing. Some of the tasks may be canceled if
        you receive "cancel" you have to remove the first file to be printed. If there is no current file to be printed print "Printer is on standby".
         */

        ArrayDeque<String> queue = new ArrayDeque<>();

        String input = console.nextLine();

        while (!input.equals("print")){

            if (input.equals("cancel")){

                if (queue.isEmpty()){
                    System.out.println("Printer is on standby");
                }else {
                    System.out.println("Canceled " + queue.poll());
                }
            } else {
                queue.offer(input);
            }

            input = console.nextLine();
        }

        if (queue.isEmpty()){

        } else {
            for (String el :
                    queue) {
                System.out.println(el);
            }
        }
    }
}
