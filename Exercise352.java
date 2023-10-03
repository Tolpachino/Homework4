import java.util.Scanner;

public class Exercise352 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt(), y = input.nextInt(), z;
        if (x > 2)
            if (y > 2) {
                z = x + y;
                System.out.println("z равно " + z);
            } else System.out.println("x равно " + x);
    }
}
