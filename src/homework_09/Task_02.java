package homework_09;
/*
За каждый месяц банк начисляет к сумме вклада 7% от суммы.
Напишите консольную программу, в которую пользователь вводит сумму вклада и количество месяцев.
А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
Для вычисления суммы с учетом процентов используйте цикл for.

Пусть сумма вклада будет представлять тип float.

Введите сумму вклада: 100
Введите срок вклада в месяцах: 1
После 1 месяцев сумма вклада составит 107,00
 */
import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int percentPerMonth = 7;

        float sumDeposit;
        int months;

        System.out.println("сумма вклада?");
        sumDeposit = scanner.nextFloat();

        System.out.println("На какой срок ( в месяцах)?");
        months = scanner.nextInt();

        for (int i = 1; i <= months; i++) {
            sumDeposit += sumDeposit * percentPerMonth / 100;
            System.out.printf("Через %d месяцев мы вернем вам %.2f", months, sumDeposit);

        }


    }
}
