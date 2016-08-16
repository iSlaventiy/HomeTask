import java.util.Scanner;

/**В переменной n хранится натуральное двузначное число.
 * Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n (n – вводит пользователь)
 * Created by slaventiykoss on 14.08.16.
 */
public class Summa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            int i = scanner.nextInt();
            if (i>9 && i<100){
                int x = i/10;
                int y = i-(x*10);
                System.out.println(x+y);

            }
            else
                System.out.println("Числа вне заданых педелов");
        }
    }
}
