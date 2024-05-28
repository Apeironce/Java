package src.main.java.ru.sgu;

import java.util.Objects;

public abstract class Animal implements Cloneable,  Zoo{
    private String name;
    private int quantity;
    private int caloriesInDay;

    public Animal(String name, int quantity, int caloriesInDay) {
        this.name = name;
        this.quantity = quantity;
        this.caloriesInDay = caloriesInDay;
    }

    public void setCaloriesInDay(int caloriesInDay) {
        this.caloriesInDay = caloriesInDay;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getCaloriesInDay() {
        return caloriesInDay;
    }

    abstract String typeOfFood();

    @Override
    public String toString() {
        return "название = " + name +
                ", количество = " + quantity +
                ", требуется калорий в день = " + caloriesInDay;
    }

    public int compareTo(Animal o) {
        int compName = name.compareTo(o.name);
        if (compName != 0) {
            return compName;
        }
        int compQuantity = quantity - o.quantity;
        if (compQuantity != 0) {
            return compQuantity;
        }
        return caloriesInDay - o.caloriesInDay;
    }

    public int hashCode() {
        return Objects.hash(name, quantity, caloriesInDay);
    }

    public Animal shallowCopy() {
        try {
            return (Animal) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public abstract Animal deepCopy();


}
