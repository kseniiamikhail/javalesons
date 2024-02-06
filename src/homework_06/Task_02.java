package homework_06;
/* распечатать все четные числа от 0 до 21:
Перебрать все числа от 1 до 21 с шагом 1
является ли текущее число четным. если "да" РАСПЕЧАТАТЬ
*/
public class Task_02 {
    public static void main(String[] args) {
        int i1 = 1;
        while (i1 <= 21); {
            if (i1 % 2 == 0); {
                System.out.println(i1);
            }
            i1++;
        }
    }
}
