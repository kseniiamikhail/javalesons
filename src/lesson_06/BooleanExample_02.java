package lesson_06;

public class BooleanExample_02 {
    public static void main(String[] args) {
        boolean bl = true ^ false;
        System.out.println("true ^ false - >" + bl);
        System.out.println("false ^ true -> " + (false ^ true));
        System.out.println("true ^ true -> " + (true ^ true));
        System.out.println("false ^ false -> " + (false ^ false));

        int a = 5;
        int b = 10;

        a = 0;

        boolean b2 = (a != 0) && (b / a > 5);
        System.out.println("(b / a > 5) -> " + b2);

        boolean b3 = (a == 0) || (b / a > 5);
        System.out.println("(a != 0) || (b / a) -> " +b3);

    }
}
