package pl.put.poznan.bootstrap_builder.logic;

import java.util.ArrayList;

public class Nav extends HtmlComponent{

    private Boolean nav_fixed;

    public void setNav_fixed(Boolean nav_fixed) {
        this.nav_fixed = nav_fixed;
    }

    public Boolean getNav_fixed() {
        return nav_fixed;
    }

    public Nav(Boolean nav_fixed) {
        this(new ArrayList<HtmlComponent>(), nav_fixed);
    }
    public Nav(ArrayList<HtmlComponent> components, Boolean nav_fixed) {
        super("nav", "", components);
        if (nav_fixed)
        {
            this.setContent("<nav class=\"fixed-top\">\n</nav>");
            this.setTag("");
        }
    }
}
