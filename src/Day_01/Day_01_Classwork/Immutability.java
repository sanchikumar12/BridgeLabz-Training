package Day_01.Day_01_Classwork;

public class Immutability {

    public static void main(String[] args) {

        String str = "Hello";

        System.out.println(str);

        str.concat(" World");

        System.out.println(str);

        str = str.concat(" World");

        System.out.println(str);

        Integer num1 = 10;
        Integer num2 = num1;

        num1 = 20;

        System.out.println(num1);
        System.out.println(num2);
    }
}
