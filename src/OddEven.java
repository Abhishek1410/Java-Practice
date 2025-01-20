import java.util.*;

public class OddEven {
    public static void main (String[] args) {
        Scanner myNum = new Scanner(System.in);
        int num = myNum.nextInt();
        //System.out.println(num);
        if (num % 2 == 0) {
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }
    }
}
