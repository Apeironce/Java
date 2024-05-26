package src.main.java.ru.sgu;

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
        return this.name.compareTo(o.name);
    }

    public abstract int hashCode();

    public Animal shallowCopy() {
        try {
            return (Animal) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public abstract Animal deepCopy();


}
