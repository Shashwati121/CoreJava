package corejava.trywithresoucre;



public class AutoCloseableResourceFirst implements AutoCloseable{

    public AutoCloseableResourceFirst()
    { System.out.println("First Constructor AutoCloseableResourceFirst");}

    public void PrintClassDetails()
    {
        System.out.println("Inside class AutoCloseableResourceFirst");
    }

    @Override
    public void close() throws Exception{
        System.out.println("Exception inside class AutoCloseableResourceFirst");

    }
}