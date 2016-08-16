/**Создать класс Dog, который будет содержать 2 поля name и says.
 * В main( ) создать 2 экземпляра класса с name “spot” (says, “Ruff!”) и “scruffy” (says, “Wurf!”).
 * И распечатать поля объектов.
 * Created by slaventiykoss on 13.08.16.
 */
public class Dog {

    String name;
    String says;

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.name = "Spot";
        dog1.says = "Ruff!";

        dog2.name = "Scruffy";
        dog2.says = "Wurf!";

        System.out.println(dog1.name + " " + dog1.says);
        System.out.println(dog2.name + " " + dog2.says);

    }



}
