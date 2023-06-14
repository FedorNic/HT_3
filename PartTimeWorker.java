public class PartTimeWorker extends Worker {
    private final int rate = 600;
    private int salary;

    public PartTimeWorker(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        this.salary = calculationSalary();
    }

    @Override
    public int calculationSalary() {
        return (int) Math.round(20.8 * 8 * rate);
    }

    @Override
    public String toString() {
        return String.format("%s, salary = %d", super.toString(), this.salary);
    }
}