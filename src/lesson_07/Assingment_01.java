package lesson_07;

import java.util.Random;

public class Assingment_01 {
    public static void main(String[] args) {
        Random random = new Random();
           int money = 100;
           int note = random.nextInt(5) + 1;

           note = 1;
           double w = 1.0;
           System.out.println("Оценка: " + note);

           switch (note) {

               case 5:
                   money += 20;
                   break;
               case 4:
                   money += 10;
                   break;
               case 3:
                   break;
               case 2:
                   money -= 20;
                   break;
               case 1:
                   money = 0;
                   break;
               default:
                   System.out.println("Таких оценок нет " + money);



           }

    }

}
