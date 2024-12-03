public class JavaHomeWork {

    public static void main(String[] args) {

        //Арифметичеслкие операторы
        int a = 20;
        int b = 30;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));

        //Логические операторы

        String work = "Test";
        int age = 8;

        System.out.println(work.equals("Test") && age == 8); //оба параметра должны совпасть // true
        System.out.println(work.equals("Apple") || age == 8); //может совпасть только один //true
        System.out.println(work.equals("Apple") || age == 34); //может совпасть только один //false
        System.out.println(work.equals("Test") && age == 34); //оба параметра должны совпасть // false

        //Переполнение

        byte value1 = 127;
        byte value2 = 10;

        byte result = (byte) (value1 + value2);
        System.out.println("Result: " + result);

        //Вычисления комбинаций типов данных

        int c = 10;
        double d = 4.5;

        System.out.println("c + d = " + (c + d));
        System.out.println("c - d = " + (c - d));
        System.out.println("c / d = " + (c / d));
        System.out.println("c % d = " + (c % d));


    }
}
