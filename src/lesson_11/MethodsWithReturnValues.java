package lesson_11;

public class MethodsWithReturnValues {


    public static void main(String[] args)  {


        int x = 5;
        int y = 10;
        sumNumbers(x, y);

        int sum = sumNumbersWithReturn(x, y);
        System.out.println("sum: " + sum);

        System.out.println(sumNumbersWithReturn(10, 45));

        int[] testArray = {11, 55, 34, 65, 43};
        int findMe = 100;

       // boolean isExist = isDigitInArray(testArray, findMe);
       // System.out.println("is digit in Array? -> " + isExist);
    }
    public static void sumNumbers(int i, int k){
        int result = 1 + k;
        System.out.println(result);

    }


    public static int sumNumbersWithReturn(int i, int k) {
    int result = i + k;
       return result;

    }

}

