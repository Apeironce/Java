package src.main.java.ru.sgu;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        Predator predator = new Predator("Тигр", 2, 10000);
        Herbivore herbivore = new Herbivore("Коала", 4, 500);
        animals.add(predator);
        animals.add(herbivore);
        for (Animal animal : animals) {
            System.out.println(animal.toString());
            System.out.println(animal.typeOfFood());
            animal.foodInMonth();
        }

        System.out.println(predator.equals(herbivore));
        System.out.println(predator.compareTo(herbivore));
        System.out.println(predator.hashCode());
        System.out.println(new Herbivore("Тигр", 2, 10000).hashCode());

        Animal predatorShallowCopy = predator.shallowCopy();
        Animal herbivoreDeepCopy = herbivore.deepCopy();

        System.out.println(predatorShallowCopy);
        System.out.println(herbivoreDeepCopy);


    }
}
