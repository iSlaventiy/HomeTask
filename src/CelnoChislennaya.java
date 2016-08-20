/**Создать класс, который будет хранить в одной целочисленной переменной несколько значений меньшей длины.
 *  Например, возраст, вес, рост и год рождения. Добавить методы получения и добавления параметров отдельно.
 * Created by slaventiykoss on 18.08.16.
 */
public class CelnoChislennaya {
    public static void main(String[] args) {
        int age=29;
        int weight = 74;
        int height = 182;
        int birthday = 1287;
        int combined = (age) | (weight << 8) | (height << 16) | (birthday <<24);
        int mask = 0b11111111; // что тут поменять?

        System.out.printf("Age: %d, weight: %d, height: %d, birthday: %d",
                mask & combined,
                mask & combined >>> 8,
                mask & combined >>> 16,
                mask & combined >>>24);
    }
}
