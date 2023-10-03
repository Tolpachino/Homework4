public class Exercise323 {// тип данных boolean нельзя преобразовывать в другие типы данных

    public static void main(String[] args) {
        boolean b = true;
        int i = (boolean) b;

        int i1 = 1;
        boolean b1 = (int) i1;
    }
}
