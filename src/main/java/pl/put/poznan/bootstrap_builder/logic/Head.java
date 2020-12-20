package pl.put.poznan.bootstrap_builder.logic;

import java.util.ArrayList;

public class Head extends HtmlComponent {

    public Head() {
        this(new ArrayList<HtmlComponent>());
    }
    public Head(ArrayList<HtmlComponent> components) {
        super("head", "content", components);
    }
}
