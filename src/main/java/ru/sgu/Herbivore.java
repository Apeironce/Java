package src.main.java.ru.sgu;

import java.util.Objects;

public class Herbivore extends Animal{
    final String type = "травоядное";

    public Herbivore(String name, int quantity, int caloriesInDay) {
        super(name, quantity, caloriesInDay);
    }

    @Override
    String typeOfFood() {
        return type + " питается растениями";
    }

    @Override
    public void foodInMonth() {
        System.out.println("Требуется " +
                (30 * super.getQuantity() * super.getCaloriesInDay() / 200) +
                " уе растений в месяц");
    }

    @Override
    public String toString() {
        return "название = " + getName() +
                " тип питания = " + type +
                ", количество = " + getQuantity() +
                ", требуется калорий в день = " + getCaloriesInDay();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Herbivore herbivore = (Herbivore) o;
        return getName().equals(herbivore.getName());
    }

    @Override
    public int  hashCode() {
        return Objects.hash(
                super.hashCode(),
                type.hashCode());
    }

    public Animal deepCopy() {
        return new Herbivore(getName(), getQuantity(), getCaloriesInDay());
    }

}
