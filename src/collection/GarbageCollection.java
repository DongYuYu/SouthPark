package collection;

public class GarbageCollection {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("I'm collected.");

    }
}
