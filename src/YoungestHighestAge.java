import java.math.*;

public class YoungestHighestAge {
    public static void main (String[] args) {
        int ages[] = {20,12,56,28,37,75};
        int length = ages.length;
        int lowestAge = ages[0];

        for (int age : ages) {
            if (lowestAge > age) {
                lowestAge = age;
            }
        }
        System.out.println(lowestAge);
    }
}
