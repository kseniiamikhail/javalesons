package homework_04;

public class Homework_4N {
    public static void main(String[] args) {

        char ch1 = 'k';
        char ch2 = 's';
        char ch3 = 'e';
        char ch4 = 'n';
        char ch5 = 'i';
        char ch6 = 'i';
        char ch7 = 'a';

        System.out.println("Befor: " + ch1);
      //  ch1 = (char) (ch1 - 32);
        ch1-= 32;
        System.out.println("After: " + ch1);

        ch2 -= 32;
        ch3 -= 32;
        ch4 -= 32;
        ch5 -= 32;
        ch6 -= 32;
        ch7 -= 32;

        System.out.print(ch1);
        System.out.print(ch2);
        System.out.print(ch3);
        System.out.print(ch4);
        System.out.print(ch5);
        System.out.print(ch6);
        System.out.print(ch7);
        System.out.println("");
     //   или так: System.out.println("" + ch1 + ch2 + ch3 + ch4 + ch5 + ch6 + ch7);




    }
}
