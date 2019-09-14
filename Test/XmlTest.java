import com.company.Xml;
import org.junit.Assert;
import org.junit.Test;

public class XmlTest {
   private Xml xml = new Xml();

    @Test
    public void testingXml() {
        String s = "<note>" +
                "    <to>John</to>" +
                "    <from>Smith</from>" +
                "    <heading>Reminder</heading>" +
                "    <body>Don't forget me this weekend!</body>" +
                "</note>";
        Assert.assertEquals(s, xml.getElement());
    }
}