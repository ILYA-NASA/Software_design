package Lecure_03.Ex006;

public class Worker1 implements Comparable<Worker1> {
    public String firstName;
    public String lastName;
    public int age;
    public int salary;

    public Worker1(String firstName,
            String lastName,
            int age,
            int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }

    @Override
    public String toString() {
        return String.format("\n%s %d %d", fullName(), age, salary);
    }

    @Override
    public int compareTo(Worker1 o) {
        if (this.age > o.age)
            return 1;
        else if (this.age < o.age)
            return -1;
        else
            return 0;
    }
}
