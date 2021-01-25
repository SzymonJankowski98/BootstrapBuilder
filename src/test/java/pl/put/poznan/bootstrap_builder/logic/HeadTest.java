package pl.put.poznan.bootstrap_builder.logic;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import org.mockito.*;
import java.util.ArrayList;

class HeadTest {
    public static String resExp = "<head>\n<title>Starter Template for Bootstrap</title>\n"+
            "<link rel=\"canonical\" href=\"https://getbootstrap.com/docs/4.0/examples/starter-template/\">\n"+
            "<link href=\"../../dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n" +
            "</head>\n";
    @Test
    void HeaderTest() {
        Head tester = new Head();
        String res = tester.toString();
        assertEquals(res,resExp);
    }

    @Test
    public void toStringTest() {
        HtmlComponent hc = mock(HtmlComponent.class);

        when(hc.toString()).thenReturn("<test>Content</test>");

        Head head = new Head(new ArrayList<HtmlComponent>( ));
        head.addComponent(hc);
        String result = head.toString();

        int idxh = result.indexOf("<head>");
        int idxh2 = result.indexOf("</head>");
        int idxt = result.indexOf("<test>");

        assertTrue(idxh<idxt && idxt<idxh2);
    }
}