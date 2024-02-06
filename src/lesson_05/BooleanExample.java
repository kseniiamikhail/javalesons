package lesson_05;

public class BooleanExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        boolean bol1;
        bol1 = true;
        bol1 = false;

         bol1 = x == y;
        System.out.println("x == y ->" + bol1);

        bol1 = x == 10;
        System.out.println("x == 10 ->" + bol1);

        boolean bol2 = x != y;
        System.out.println("x != y ->" + bol2);
        bol2 = 10 != x;
        System.out.println("x != 10 ->" + bol2);

        boolean bol3 = x > y ;
        System.out.println("x > y ->" + bol3);
        bol3 = x > 10;
        System.out.println("x > y ->" + bol3);

        boolean bol4 = x >= y;
        System.out.println("x >= y ->" + bol4);

        bol4 = x >= 10;
        System.out.println("x >= 10 ->" + bol4);

        boolean bol5 = x < y;
        System.out.println("x < y ->" + bol5);

        bol5 = x <= 10;
        System.out.println("x <= 10 ->" + bol1);

        boolean bol6 = true;
        System.out.println("true: " + bol6);

        bol6 = !true;
        System.out.println("!true: " + bol6);
        System.out.println("false: " + bol6);

        boolean bol7 = (2 < 5 ) & (11 == 10);

        System.out.println("(2 < 5) & (11 == 10) -> " + bol7);

         bol7 = (2 < 5) & (11 != 10);
        System.out.println("(2 < 5) & (11 != 10) " + bol7);



    }
}
