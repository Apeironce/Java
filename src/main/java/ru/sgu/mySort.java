package src.main.java.ru.sgu;

public class mySort implements Comparable<mySort>{
    private String fio;
    private String company;
    private int rating;

    public mySort(String fio, String company, int rating) {
        this.fio = fio;
        this.company = company;
        this.rating = rating;
    }

    @Override
    public int compareTo(mySort other) {
        if (rating != other.rating){
            return Integer.compare(rating, other.rating);
        } else {
            String[] newFio = fio.split(" ");
            String[] otherNewFio = other.fio.split(" ");
            if (newFio[0].compareTo(otherNewFio[0]) != 0){
                return newFio[0].compareTo(otherNewFio[0]);
            }
            if (otherNewFio[1].compareTo(newFio[1]) != 0){
                return otherNewFio[1].compareTo(newFio[1]);
            }
            return newFio[2].compareTo(otherNewFio[2]);
        }
    }

    @Override
    public String toString() {
        return fio + " " + company + " " + rating;
    }
}