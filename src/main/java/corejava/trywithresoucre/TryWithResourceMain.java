package corejava.trywithresoucre;

public class TryWithResourceMain {

    public void TestTrywithResources()
    {
        try (
                AutoCloseableResourceFirst _firstResource = new AutoCloseableResourceFirst();
                AutoCloseableResourceSecond _secResource = new AutoCloseableResourceSecond())
        { _firstResource.PrintClassDetails();
            _secResource.PrintClassDetails();}
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String... args) {

        TryWithResourceMain objTest= new  TryWithResourceMain();
        objTest.TestTrywithResources();

    }
}
