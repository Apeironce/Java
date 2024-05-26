package src.main.java.ru.sgu;

import java.util.Objects;

public class Herbivore extends Animal{

    public Herbivore(String name, int quantity, int caloriesInDay) {
        super(name, quantity, caloriesInDay);
    }

    @Override
    String typeOfFood() {
        return "Травоядное питается растениями";
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
                " тип питания = травоядное" +
                ", количество = " + getQuantity() +
                ", требуется калорий в день = " + getCaloriesInDay();
    }

    @Override
    public int  hashCode() {
        return Objects.hash(getName().hashCode(), "травоядное".hashCode());
    }

    public Animal deepCopy() {
        return new Herbivore(getName(), getQuantity(), getCaloriesInDay());
    }

}
