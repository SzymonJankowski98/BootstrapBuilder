package pl.put.poznan.bootstrap_builder.logic;

import java.util.ArrayList;

public class Main extends HtmlComponent{
    public Main() {
        this(new ArrayList<HtmlComponent>());
    }
    public Main(ArrayList<HtmlComponent> components) {
        super("", "<main class=\"container\">\n</main>", components);
    }
}
