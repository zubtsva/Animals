public class Bear extends Animal{
    Bear(String animalType, String name) {
        super(animalType, name);
    }
    void makeNoise() {
        System.out.println("Рычит");
    }
    void eat() {
        System.out.println("Кушает: ягоды, мед");

    }
    void getDescription() {
        System.out.println("Мидведь - опасное животное");
    }
}
