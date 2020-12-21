package pl.put.poznan.bootstrap_builder.logic;

import java.util.ArrayList;

/**
 * Navigation class - navigation of head can be fixed or static
 */
public class Nav extends HtmlComponent{

    private Boolean nav_fixed;

    /**
     * Constructor of Nav class with only 1 parameter
     * @param nav_fixed - fixed head if ("true"), static head if ("false")
     */
    public Nav(Boolean nav_fixed) {
        this(new ArrayList<HtmlComponent>(), nav_fixed);
    }

    /**
     * Constructor of Nav class with 2 parameter
     * @param components - List of components inside Navigation tag
     * @param nav_fixed - fixed head if ("true"), static head if ("false")
     */
    public Nav(ArrayList<HtmlComponent> components, Boolean nav_fixed) {
        super("nav", "", components);
        if (nav_fixed)
        {
            this.setContent("<nav class=\"fixed-top\">\n</nav>");
            this.setTag("");
        }
    }

    public void setNav_fixed(Boolean nav_fixed) {
        this.nav_fixed = nav_fixed;
    }

    public Boolean getNav_fixed() {
        return this.nav_fixed;
    }
}
