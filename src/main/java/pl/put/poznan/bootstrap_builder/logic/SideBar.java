package pl.put.poznan.bootstrap_builder.logic;

import java.util.ArrayList;


/**
 * SideBar class - side bar in html code
 */
public class SideBar extends HtmlComponent{

    /**
     * Constructor of SideBar class without parameters creates SideBar without any components inside
     */
    public SideBar() {
        this(new ArrayList<HtmlComponent>());
    }
    /**
     * Constructor of SideBar class with 1 parameter
     * @param components - ArrayList of components inside this SideBar
     */
    public SideBar(ArrayList<HtmlComponent> components) {
        super("aside", "", components);
    }

}
