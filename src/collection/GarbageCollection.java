package collection;

/**
 * This is a Document
 */
public class GarbageCollection {



    public int value;
    /**
     * this can be used to end sql
     * @throws Throwable
     */
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("I'm collected.");















    }
}
