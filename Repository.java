import java.util.Iterator;

public class Repository implements Iterable<Worker> {
    Worker[] workers;

    public Repository(Worker[] workers) {
        this.workers = workers;
    }

    @Override
    public Iterator<Worker> iterator() {
        Iterator<Worker> it = new Iterator<>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < workers.length;
            }

            @Override
            public Worker next() {
                return workers[index++];
            }

        };
        return it;
    }
}