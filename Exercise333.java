import java.rmi.MarshalException;

public class Exercise333 {
    public static void main(String[] args) {
        int radius = 31;
        Double area;
        Double PI = 3.14;
        if (radius >=0)      // Нет скобок изначально, поставил, чтоб компилятор не ругался было if radius >=0
        {
            area = radius * radius * PI;
            System.out.println("Площадь круга " + " радиуса " + radius + "равна " + area); //лишние пробелы
        }
    }
}
