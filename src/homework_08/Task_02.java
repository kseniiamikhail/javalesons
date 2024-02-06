package homework_08;

import java.util.Scanner;

//Task 2 Программа просит пользователя ввести произвольное число Вывести сумму цифр этого числа
//
//567432 -> 5+6+7+4+3+2 -> 27
public class Task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Сумма цифр числа: " + sum);
    }
}

