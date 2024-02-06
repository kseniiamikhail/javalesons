package homework_10;

import java.util.Arrays;

/*
yНаписать метод принимающий массив целых чисел и распечатывающий массив в обратной последовательности.
{1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]
 */
public class Task_01 {
    public static void main(String[] args) {
        int[] array = {1, 4, 3, 6, 7};
        printReversArray(array);
    }


    public static void printReversArray(int[] ints) {
        System.out.print("[");
        for (int i = ints.length - 1 ; i>= 0; i--) {
            System.out.print(ints[i] + ((i > 0)? ", " : "]\n"));
        }

    }

}

