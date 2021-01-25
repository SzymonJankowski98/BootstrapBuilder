package pl.put.poznan.bootstrap_builder.logic;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class BodyTest {
    public static String resExp =  "<body>\n<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n" +
            "<script>window.jQuery || document.write('<script src=\"../../assets/js/vendor/jquery-slim.min.js\"></script>')</script>\n"+
            "<script src=\"../../assets/js/vendor/popper.min.js\"></script>\n"+
            "<script src=\"../../dist/js/bootstrap.min.js\"></script>\n" +
            "</body>\n";
    @Test
    void bodyTest() {
        Body tester = new Body();
        String res = tester.toString();
        assertEquals(res,resExp);
    }
}