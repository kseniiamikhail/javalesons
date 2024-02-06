package lesson_09;

import java.util.Random;

public class Task {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int [random.nextInt(11) + 5];
        System.out.println("size: " + nums.length);

        System.out.println("[");
        for (int k = 0; k < nums.length; k++) {
            nums[k] = random.nextInt(15);
            System.out.println(nums[k] + "");
            k++;
            System.out.println("]");
        }


    }
}
