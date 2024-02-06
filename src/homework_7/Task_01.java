package homework_7;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 , 2 или 3 ");
        int input = scanner.nextInt();
        scanner.close();
        switch (input){
            case 1:
                System.out.println("switch x == 1");
                break;
            case 2:
                System.out.println("switch x == 2");
                break;
            case 3:
                System.out.println("switch x == 3");
                break;
            default:
                System.out.println("switch x another meaning");

        }

    }
}


