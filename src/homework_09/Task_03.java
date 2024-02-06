package homework_09;
/*
Заполните массив 50 случайными числами от 1 до 100.
Программа должна найти, и вывести на экран все простые числа.
Посчитайте сколько получилось таких чисел в массиве.
Простое число - число, которое делится на цело только на 1 и само себя.

Пример простых чисел: 2, 3, 5, 7, 11, 13, 17, 19, 23 и т.д.
 */

import java.util.Random;

public class Task_03 {
    public static void main(String[] args) {
        Random random = new Random();

        int size = 100_00;
        int range = 500_001;

        int[] ints = new int[size];

        System.out.print("[");
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(range);

          System.out.print(ints[i] + ((i < ints.length - 1)? "," : "]\n"));
        }
    }


}
