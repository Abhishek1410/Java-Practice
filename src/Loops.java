public class Loops {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i = i + 2) {
            if (i < 9) {
                System.out.print(i + ", ");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
