public class Dog extends Animal {
    Dog(String animalType, String name) {
        super(animalType, name);
        this.name = name;
    }
    void makeNoise() {
        System.out.println("Лает");
    }
    void eat() {
        System.out.println("Кушает:  кости, мясо");
    }
    void getDescription() {
        System.out.println("Пес сыт и счастлив");
    }
}
