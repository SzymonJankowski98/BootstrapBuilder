package pl.put.poznan.bootstrap_builder.rest;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * BootstrapBuilderControllerTest class - for testing
 */
class BootstrapBuilderControllerTest {

    @Test
    public void testTest() {
        String res = new BootstrapBuilderController().test("","","","");
        boolean isFound = res.indexOf("head") !=-1? true: false;
        assertTrue(isFound);
    }
    @Test
    public void navStaticTest() {
        String res = new BootstrapBuilderController().test("fixed","","","");
        boolean isFound = res.indexOf("fixed") !=-1? true: false;
        assertTrue(isFound);
    }
    @Test
    public void metaOGTest() {
        String res = new BootstrapBuilderController().test("","","","og");
        boolean isFound = res.indexOf("og:url") !=-1? true: false;
        assertTrue(isFound);
    }
    @Test
    public void sidebarTest() {
        String res = new BootstrapBuilderController().test("","true","","og");
        boolean isFound = res.indexOf("aside") !=-1? true: false;
        assertTrue(isFound);
    }
    @Test
    public void footTest() {
        String res = new BootstrapBuilderController().test("","","true","og");
        boolean isFound = res.indexOf("foot") !=-1? true: false;
        assertTrue(isFound);
    }

}