public class Exercise353 {
    public static void main(String[] args) {
        int score = 87;
        if (score >= 60)
            System.out.println("D");
        else if (score >= 70)
            System.out.println("C");
        else if (score >= 80)
            System.out.println("B");
        else if (score >= 90)
            System.out.println("A");
        else
            System.out.println("F"); // Программа сначала проверяет на оценку D и не идет дальше даже если балл высокий, чтобы программа работала нормально нужно проверять на высокий балл и далее по убыванию
    }
}
