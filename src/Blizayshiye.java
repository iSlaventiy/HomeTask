import java.util.Scanner;

/**Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
 *  Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45 (n и m – вводит пользователь).
 * Created by slaventiykoss on 14.08.16.
 */
public class Blizayshiye {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        while (true){
            double m = scanner.nextDouble();
            double n = scanner.nextDouble();
            if (Math.abs(10-m)>Math.abs(10-n))
                System.out.println("N ближе к 10");
            else
                System.out.println("M ближе к 10");
        }
    }
}
