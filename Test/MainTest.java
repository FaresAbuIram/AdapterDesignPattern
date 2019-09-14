import com.company.Main;
import org.junit.Test;

import java.io.IOException;

public class MainTest {
    @Test
    public void testMain() throws IOException {
        System.out.println("main");
        String[] args = null;
        Main.main(args);
    }
}