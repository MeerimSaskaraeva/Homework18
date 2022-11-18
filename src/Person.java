import java.util.Arrays;

public class Person {
    private Family[] name;

    public Person(Family[] name) {
        this.name = name;
    }

    public Family[] getName() {
        return name;
    }

    public void setName(Family[] name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + Arrays.toString(name) +
                '}';
    }
}
