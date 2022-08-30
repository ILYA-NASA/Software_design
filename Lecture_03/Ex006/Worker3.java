package Lecure_03.Ex006;

public class Worker3 {
    public String firstName;
    public String lastName;
    public int age;
    public int salary;

    public Worker3(String firstName,
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
    public boolean equals(Object obj) {
        Worker3 temp = (Worker3) obj;

        return this.age == temp.age
                && this.salary == temp.salary
                && this.firstName == temp.firstName
                && this.lastName == temp.lastName;
    }

    @Override
    public int hashCode() {
        return age;
    }
}
