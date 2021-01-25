package pl.put.poznan.bootstrap_builder.logic;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class MetaTest {
    public static String resExp = "<meta name=\"\" content=\"\">\n";
    public static String resExp2 = "<meta name=\"description\" content=\"\">\n";

    @Test
    void metaFTest() {
        Meta tester = new Meta("");
        String res = tester.toString();
        assertEquals(res,resExp);
    }

    @Test
    void metaTest() {
        Meta tester = new Meta("description");
        String res = tester.toString();
        assertEquals(res,resExp2);
    }
}