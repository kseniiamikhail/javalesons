package homework_10;
/*
Написать метод, принимающий на вход целое число.
Метод должен вывести на экран 2 в степени этоЧисло

класс Math для нахождения степени числа использовать нельзя ;)
*/
public class Task_02 {
    public static void main(String[] args) {


        powTwo(7);
    }

    public static void powTwo(int pow) {

        int absPow = (pow > 0) ? pow : pow * -1;
        int result = 1;

        for (int i = 0; i < absPow; i++) {


        result *= 2;
    }


    if (pow > 0) {
        System.out.println(result);
    } else {
        System.out.printf("1/%d\n", result);
        System.out.printf("%.2f");
    } }
}
