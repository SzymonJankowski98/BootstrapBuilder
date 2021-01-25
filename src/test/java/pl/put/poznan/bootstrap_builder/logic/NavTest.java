package pl.put.poznan.bootstrap_builder.logic;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class NavTest {
    public static String resExp = "<nav>\n" +
            "</nav>\n";
    public static String resExp2 = "<nav class=\"fixed-top\">\n" +
            "</nav>\n";
    @Test
    void navFalseTest() {
        Nav tester = new Nav(false);
        String res = tester.toString();
        assertEquals(res,resExp);
    }

    @Test
    void navTrueTest() {
        Nav tester = new Nav(true);
        String res = tester.toString();
        assertEquals(res,resExp2);
    }
}