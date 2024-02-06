package lesson_3;

public class Variables {
    public static void main(String[] args) {

        int myFirstVariable; //обьявление (декларация) переменной

        myFirstVariable = 1;// присвоение значения переменной.

        // Первое присвоенное значение переменной называется инициализацией.
        int mySecondVariable = 25; // обьявление и инициализация в одной строке

        System.out.println(mySecondVariable);

        mySecondVariable = 50; // присвоение нового значения переменной

        System.out.println(mySecondVariable);

        byte byteVar = 125; // обьявление и инициализация переменной типа byte
        byteVar = 0;
        System.out.println("значение переменной byteVar:" + byteVar);


        short shortVar; // обьявление переменной типа short
        shortVar = 31000; // инициализация переменной

        long longVariable = 2_100_000_000_000_000L; //знак подчеркивание не влияет на значение переменной.
        // Исключительно для лучшего понимания
        System.out.println("longVariable: " + longVariable);
        //L в конце числа - сказать компилятору,  что это чисто в формате Long

        double doubleVar = 10.5421;
        System.out.println("doubleVar=" + doubleVar);
        float floatVar = 11.65F; // число в формате float




    }

}
