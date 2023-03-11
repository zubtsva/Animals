import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Кот ", "Тедди");
        Animal dog = new Dog("Пес ", "Айс");
        Animal bear = new Bear("Мишутка ", "Балу");

        List<Animal> animalList = new ArrayList<>();
        animalList.add(cat);
        animalList.add(dog);
        animalList.add(bear);

        Veterinarian vet = new Veterinarian();

        for (int i = 0; i < animalList.size(); i++) {
            System.out.print(i + 1 + " ");
            vet.treatAnimal(animalList.get(i));
            System.out.println();

        }

        for (int j = 0; j < animalList.size(); j++) {
            System.out.print(animalList.get(j).getAnimalType());
            System.out.print(animalList.get(j).getName() + " ");
            animalList.get(j).makeNoise();
            animalList.get(j).eat();
            System.out.println();


        }
    }
}