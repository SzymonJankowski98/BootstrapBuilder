package pl.put.poznan.bootstrap_builder.logic;

import java.util.ArrayList;

/**
 * Head class - head of html code
 */
public class Head extends HtmlComponent {

    /**
     * Constructor of Head class without parameters creates Head without any components inside
     */
    public Head() {
        this(new ArrayList<HtmlComponent>());
    }

    /**
     * Constructor of Head class with 1 parameter
     * @param components - ArrayList of components inside this Head
     */
    public Head(ArrayList<HtmlComponent> components) {
        super("head", "", components);
    }
}
