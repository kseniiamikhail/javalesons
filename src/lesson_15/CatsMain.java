package lesson_15;

public class CatsMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sayMeow();
        cat.run();
        cat.sleep();

        String catNameVar = cat.name;
        System.out.println("Имя кота: "+ catNameVar);
        System.out.println("Возраст кота: " + cat.age);
        System.out.println("Цвет: " + cat.color);
        System.out.println("=======================");



      Cat cat1 = new Cat("Max");
        System.out.println("Имя кота: "+ cat1.name);
        System.out.println("Возраст кота: " + cat1.age);
        System.out.println("Цвет: " + cat1.color);

        System.out.println("=======================");
        cat.whoAmI();
        cat1.whoAmI();

    }
}
