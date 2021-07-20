import java.util.concurrent.Callable;

public class CallableImp implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("Callable Started");
        return "Callable returned";
    }
}
