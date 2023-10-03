import java.util.Scanner;

public class Exercise351 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt(), y = input.nextInt(), z;
        if (x > 2) {
            if (y > 2) {
                z = x + y;
                System.out.println("z равно " + z);
            }
        }
        else System.out.println("x равно " + x);
    } // чтобы не писать трижды один и тот же код я просто сканнер добавил, сначала x=3 y=2, потом x=3 y=4, потом x=2, y=2
}
