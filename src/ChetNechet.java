import java.util.Scanner;

/**Создать программу, проверяющую и сообщающую на экран, является ли целое число,
 *  записанное в переменную n, чётным либо нечётным (n – вводит пользователь).
 * Created by slaventiykoss on 14.08.16.
 */
public class ChetNechet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = scanner.nextInt();

        if (x%2 == 0)
            System.out.println("Число Четное");
        else
            System.out.println("Число НЕ Четное");
        }
    }
}
