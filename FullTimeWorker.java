public class FullTimeWorker extends Worker {
    private int salary;

    public FullTimeWorker(String firstName, String lastName, int age, int salary) {
        super(firstName, lastName, age);
        this.salary = salary;
    }

    @Override
    public int calculationSalary() {
        return this.salary;
    }
    @Override
    public String toString() {
        return String.format("%s, salary = %d", super.toString(), this.salary);
    }
}