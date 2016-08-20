import java.util.Scanner;

/**В три переменные a, b и c записаны три вещественных числа.
 * Создать программу, которая будет находить и выводить на экран вещественные корни квадратного уравнения
 * ax^2+bx+c=0, либо сообщать, что корней нет (a, b и c – вводит пользователь).
 * Created by slaventiykoss on 15.08.16.
 */
public class Korny {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            float a = scanner.nextInt();
            float b = scanner.nextInt();
            float c = scanner.nextInt();

            double d = (b * b) - (4 * a * c);
            float e = 0;
            float f = 0;
            if (d == 0) {
                e = -1 * (b / (2 * a));
                System.out.println("Уравнеие имеет 1 квадратный корень, который равен " + e);
            } else {
                if (d > 0) {
                    e = ((-1 * b) + (float) Math.sqrt(d)) / (2 * a);
                    f = ((-1 * b) - (float) Math.sqrt(d)) / (2 * a);
                    System.out.println("Уравнение имеет 2 квадратных корня: " + e + " и " + f);
                } else {
                    System.out.println("Уравнение не имеет квадратных корней");

                }
            }
        }
    }
}
