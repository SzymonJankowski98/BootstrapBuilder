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
    public void navFTest() {
        String res = new BootstrapBuilderController().test("","","","");
        boolean isFound = res.indexOf("fixed") !=-1? true: false;
        assertFalse(isFound);
    }
    @Test
    public void navFixedTest() {
        String res = new BootstrapBuilderController().test("fixed","","","");
        boolean isFound = res.indexOf("fixed") !=-1? true: false;
        assertTrue(isFound);
    }
    @Test
    public void navStaticTest() {
        String res = new BootstrapBuilderController().test("static","","","");
        boolean isFound = res.indexOf("nav") !=-1? true: false;
        assertTrue(isFound);
    }
    @Test
    public void metaOGTest() {
        String res = new BootstrapBuilderController().test("","","","og");
        boolean isFound = res.indexOf("og:url") !=-1? true: false;
        assertTrue(isFound);
    }
    @Test
    public void metaTTTest() {
        String res = new BootstrapBuilderController().test("","","","tt");
        boolean isFound = res.indexOf("twitter:url") !=-1? true: false;
        assertTrue(isFound);
    }
    @Test
    public void metaNormalTest() {
        String res = new BootstrapBuilderController().test("","","","normal");
        boolean isFound = res.indexOf("description") !=-1? true: false;
        assertTrue(isFound);
    }
    @Test
    public void sidebarTest() {
        String res = new BootstrapBuilderController().test("","true","","");
        boolean isFound = res.indexOf("aside") !=-1? true: false;
        assertTrue(isFound);
    }
    @Test
    public void sidebarFTest() {
        String res = new BootstrapBuilderController().test("","","","");
        boolean isFound = res.indexOf("aside") !=-1? true: false;
        assertFalse(isFound);
    }
    @Test
    public void footTest() {
        String res = new BootstrapBuilderController().test("","","true","");
        boolean isFound = res.indexOf("foot") !=-1? true: false;
        assertTrue(isFound);
    }
    @Test
    public void footFTest() {
        String res = new BootstrapBuilderController().test("","","false","");
        boolean isFound = res.indexOf("foot") !=-1? true: false;
        assertFalse(isFound);
    }

}