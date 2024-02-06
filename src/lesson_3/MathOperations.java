package lesson_3;

public class MathOperations {

    public static void main(String[] args) {

        int var1 = 20;
        int var2 = 7;

        int result;
        // сложение

        result = var1 + var2; //результат вычислений выражения в правой части присваивается в
        // переменную в левой части панели
//      result = 15+6;
        System.out.println("result " + result);

        int result2 = var1 + var2; // обьявление и инициализация результатом вычисления

        // вычитание
        result = var1 - var2;
        System.out.println("result - : " + result);

        //* умножение
        result = var1 * var2;
        System.out.println("multResult: " + result);

        //  / - целочисленное деление
        result = var1 / var2;

        System.out.println("devResult: " + result);

        // % остаток от деления
        result = var1 % var2;
        System.out.println("restResult:" + result);

        System.out.println("целочисленное деление 4 / 2 = " + (4 / 2 ) ); // 2
        System.out.println("Остаток от деления 4 % 2 = " + (4 % 2 )); // 0

        System.out.println((5 / 10));
        System.out.println((5 % 10));

        // 28 / -> 2 целая и 8 в остатке -> 2 * 10 + 8

        System.out.println("=============================\n");

        double doubleVar = 20/0d; // явно указано, что число записано в double
        double doubleSeven = 7.0; // все числа, записанные в нашем коде с "." считаются числами в формате double

        double doubleResult = doubleVar / doubleSeven;
        System.out.println("doubleResult dev = " + doubleResult);

        // Форматированный вывод
        // %f шаблон для числа с плавающей точкой
        // %d шаблон для цифры (целочисленное)
        // .2f - вывести число с плавающей точкой. Отобразить ровно 2 знака после запятой

        int a = 20;
        int b = 7;
        int intResult = a / b;
        System.out.println("Результат деления" + a + " на " + b + " равен = " + intResult);
        System.out.printf("Результат деления %d на %d равен = %d\n", a, b, intResult);
        // \n -> перевод каретки (курсора) на новую строку System.out.println();
        System.out.println("Что-нибудь!");
        // Форматированный выводю Мы используем шаблон вывода и список значений, которые будут поставлены в этот шаблон

        System.out.printf("Округленный вывод результата деления %.2f\n", 20.0 + 1.0);
        System.out.printf("Округленный вывод результата деления %.2f\n", doubleResult);

        // IEEE 754
        // Проблемы с double
        double x = 0.1;
        double y = 0.2;
        double z = x + y;
        System.out.println("z = " + z); // z = 0.30000000000000004

        x = 1.0;
        y = 3.0;
        z = x / y; // 0.3333333333333
        System.out.println(z);









    }
}
