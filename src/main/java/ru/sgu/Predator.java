package src.main.java.ru.sgu;

import java.util.Objects;

public class Predator extends Animal {
    final String type = "Хищник";

    public Predator(String name, int quantity, int caloriesInDay) {
        super(name, quantity, caloriesInDay);
    }

    @Override
    String typeOfFood() {
        return type + " питается мясом";
    }

    @Override
    public void foodInMonth() {
        System.out.println("Требуется " +
                (30 * super.getQuantity() * super.getCaloriesInDay() / 460) +
                " уе мяса в месяц");
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
        Predator predator = (Predator) o;
        return getName().equals(predator.getName());
    }

    @Override
    public int  hashCode() {
        return Objects.hash(
                super.hashCode(),
                type.hashCode());
    }

    @Override
    public Animal deepCopy() {
        return new Predator(getName(), getQuantity(), getCaloriesInDay());
    }
}
