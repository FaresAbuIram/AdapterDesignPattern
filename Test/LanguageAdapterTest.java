import com.company.Josn;
import com.company.LanguageAdapter;
import org.junit.Assert;
import org.junit.Test;

public class LanguageAdapterTest {
    private Josn josn = new Josn();
    private LanguageAdapter languageAdapter = new LanguageAdapter(josn);

    @Test
    public void testingLanguageAdapter() {
        String s = "{\"note\":{\"heading\":\"Reminder\",\"from\":\"Smith\",\"to\":\"John\",\"body\":\"Don't forget me this weekend!\"}}";

        Assert.assertEquals(s, languageAdapter.getElement());

    }
}