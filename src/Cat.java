public class Cat extends Animal{
    Cat(String animalType, String name) {
        super(animalType, name);
    }
    void makeNoise() {
        System.out.println("Мурлычет");
    }
    void eat() {
        System.out.println("Кушает: колбасу, корм, мясо");

    }
    void getDescription() {
        System.out.println("Кот сыт, здоров и весел");
    }

}
