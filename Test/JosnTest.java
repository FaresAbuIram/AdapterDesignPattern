import com.company.Josn;
import org.junit.Assert;
import org.junit.Test;

public class JosnTest {
   private Josn josn = new Josn();

    @Test
    public void testingJson() {
        String s = "{\"note\":{\"heading\":\"Reminder\",\"from\":\"Smith\",\"to\":\"John\",\"body\":\"Don't forget me this weekend!\"}}";
        Assert.assertEquals(s, josn.element());
    }


}