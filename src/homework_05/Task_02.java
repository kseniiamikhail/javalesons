package homework_05;

public class Task_02 {
        public static void main(String[] args) {
            String str = "Java";
            String str1 = "is";
            String str2 = "a";
            String str3 = "powerful";
            String str4 = "language";

            String concatStr = String.join(" ", str, str1, str2, str3, str4);

            concatStr = str.concat(" ")
                    .concat(str1).concat(" ")
                    .concat(str2).concat(" ")
                    .concat(str3).concat(" ")
                    .concat(str4);

            System.out.println(concatStr);
            System.out.println("Длина строки: " + concatStr.length()) ;

            boolean isContainAge = concatStr.contains("age");

            System.out.println("isContainAge: " + isContainAge);

        }
    }

