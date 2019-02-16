package corejava.trywithresoucre;

public class AutoCloseableResourceSecond implements AutoCloseable{

    public AutoCloseableResourceSecond() {
        System.out.println("Inside Constructor of AutoCloseableResourceSecond");
    }
    public void PrintClassDetails()
    {
        System.out.println("Inside class AutoCloseableResourceSecond");
    }
    @Override
    public void close() throws Exception{
        System.out.println("Exception inside class AutoCloseableResourceSecond");

    }
}