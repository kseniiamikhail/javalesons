package homework_15;

public class PeoplesMain {
    public static void main(String[] args) {
        People people = new People();
        people.fosters();
        people.show();
        people.teach();

        String peopleNameVar = people.name;
        System.out.println("Имя человека: " + peopleNameVar);
        System.out.println("Профессия: " + people.Profession);
        System.out.println("Опыт работы: " + people.workExperience);

        System.out.println("========================");

        People people1 = new People("Olha");
        System.out.println("Педагог");


    }
}
