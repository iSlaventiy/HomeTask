import java.util.Scanner;

/**В переменных a и b лежат положительные длины катетов прямоугольного треугольника.
 *  Вычислить и вывести на экран площадь треугольника и его периметр (a и b – вводит пользователь).
 * Created by slaventiykoss on 15.08.16.
 */
public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            double a = scanner.nextInt();
            double b = scanner.nextInt();
            if (a<0 || b<0){
                System.out.println("Катетов НЕТ");
            }

            double pl = a*b*0.5;
            double c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
            double p = a+b+c;

            System.out.println("Площадь равняеться"+pl +"\nПериметр"+p);

        }
    }
}
