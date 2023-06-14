public abstract class Worker implements Comparable<Worker> {

    public String firstName;
    public String lastName;
    public int age;

    public Worker(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public abstract int calculationSalary();

    @Override
    public String toString() {
        return String.format("FirstName - %s, LastName - %s, age = %d", firstName, lastName, age);
    }

    @Override
    public int compareTo(Worker o) {
        return this.lastName.compareTo(o.lastName);
    }
}