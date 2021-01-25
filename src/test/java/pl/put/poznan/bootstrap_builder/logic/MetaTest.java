package pl.put.poznan.bootstrap_builder.logic;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class MetaTest {
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
}