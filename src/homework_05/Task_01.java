package homework_05;
/*
Создайте переменную с типом String, в которой будет хранится Ваше имя.
Сколько букв в вашем имени? Выведите значение на экран
Создайте две переменные типа char. Одной присвойте первый символ имени, второй - последний символ
Выведите на экран десятичный код первого и последнего символа вашего имени
 */
public class Task_01 {
    public static void main(String[] args) {
        String name = "Kseniia";
        int nameLenght = name.length();

        System.out.println("numbers of letters: " + nameLenght);
        char firstChar = name.charAt(0);
        char lastChar = name.charAt(name.length() -1);

        System.out.println((int)firstChar);
        System.out.println((int)lastChar);

    }

}
