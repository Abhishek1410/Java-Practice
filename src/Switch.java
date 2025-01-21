import java.util.*;

public class Switch {
    public static void main (String[] args) {
        Scanner Number = new Scanner(System.in);
        int DayNumber = Number.nextInt();
        switch (DayNumber) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
        }
    }
}
