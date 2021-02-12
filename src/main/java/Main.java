import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        System.out.println("Ex. 1 and 2");

        Integer[] Numb = new Integer[5];

        Numb[0] = 1;
        Numb[1] = 2;
        Numb[2] = 3;
        Numb[3] = 4;
        Numb[4] = 5;

        System.out.println(Arrays.deepToString(Numb));

        SwapInt(Numb);

        System.out.println(Arrays.deepToString(Numb));

        System.out.println();
        System.out.println("Ex. 3");
        System.out.println();

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        Box<Apple> box1 = new Box<Apple>(apple1, apple2, apple3);
        System.out.println("Weight of box 1 (3 fruits in box): " + box1.getWeight());

        Box<Orange> box2 = new Box<Orange>(orange1, orange2);
        System.out.println("Weight of box 2 (2 fruits in box): " + box2.getWeight());

        System.out.println();

        System.out.println("Compare boxes weight: ");
        System.out.println("Box with apples: " + box1.getWeight());
        System.out.println("Box with oranges: " + box2.getWeight());
        box2.add(orange3);
        System.out.println();
        System.out.println("Put 1 orange in box 2 and it weight: " + box2.getWeight());
        System.out.println();
        System.out.println("Compare boxes: ");
        System.out.println("Box with apples: " + box1.getWeight());
        System.out.println("Box with oranges: " + box2.getWeight());


    }

    private static void SwapInt(Object[] array) {
        System.out.println();
        Object tempo = array[0];
        array[0] = array[1];
        array[1] = array[2];
        array[2] = array[3];
        array[3] = array[4];
        array[4] = tempo;


    }
}