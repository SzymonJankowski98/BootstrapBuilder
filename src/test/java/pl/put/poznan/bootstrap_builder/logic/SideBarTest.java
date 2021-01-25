package pl.put.poznan.bootstrap_builder.logic;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SideBarTest {
    public static String resExp = "<aside>\n" +
            "</aside>\n";
    @Test
    void navFalseTest() {
        SideBar tester = new SideBar();
        String res = tester.toString();
        assertEquals(res,resExp);
    }
}