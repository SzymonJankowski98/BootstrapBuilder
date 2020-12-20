package pl.put.poznan.bootstrap_builder.logic;

import java.util.ArrayList;

public class Body extends HtmlComponent {

    public Body() {
        this(new ArrayList<HtmlComponent>());
    }
    public Body(ArrayList<HtmlComponent> components) {
        super("body", "body content", components);
    }
}
