package pl.put.poznan.bootstrap_builder.logic;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import org.mockito.*;
import java.util.ArrayList;

class HtmlComponentTest {

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

        assert(idxh<idxt && idxt<idxh2);
    }
}