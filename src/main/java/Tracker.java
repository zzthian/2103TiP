import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Tracker {

    public Tracker() {
    }

    public void simulate() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.equals("bye")) {

            System.out.println(input);
            input = sc.nextLine();
            }


        System.out.println("Bye. Hope to see you again soon!");
        sc.close();
    }

}
