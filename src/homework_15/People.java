package homework_15;

public class People {
    String name;
    String Profession;
    int workExperience;

    public People() {
        System.out.println("Конструктор 1");
    }

    public People(String peopleName) {
        System.out.println("Конструктор 2");
        name = peopleName;
    }

    public void whoThat() {
        System.out.println("Я Оля " + name + ", моя профессия: " +
                Profession + "; опыт работы: " + workExperience);
    }

    void teach() {

        System.out.println("преподавать");
    }

    void fosters() {
        System.out.println("воспитывать");
    }

    void show() {
        System.out.println("показывать");

    }

}