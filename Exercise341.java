import java.util.Scanner;

public class Exercise341 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();
        int pay = 0;
        if (score > 90) {
            pay = pay + 3;
        } else {
            pay = pay + 1;
        }
        System.out.println(pay);
    }
}
