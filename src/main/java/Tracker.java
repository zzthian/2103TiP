import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Tracker {
    public static List<String> list = new ArrayList<>();

    public Tracker() {
    }

    public void printList() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i+1) +". " + list.get(i));
        }
    }

    public void simulate() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.equals("bye")) {
            if (input.equals("list")) {
                printList();
            } else {
                System.out.println("added: " + input);
                list.add(input);

            }
            input = sc.nextLine();
        }
        System.out.println("Bye. Hope to see you again soon!");
        sc.close();
    }

}
