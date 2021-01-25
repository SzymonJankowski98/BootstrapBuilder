package pl.put.poznan.bootstrap_builder.logic;

import java.util.ArrayList;

/**
 * Meta class - meta tag in head components of html code
 */
public class Meta extends HtmlComponent{

    String name;

    /**
     * Constructor of Meta class with 1 parameter
     * @param name - String what should be in name parameter in this meta tag
     */
    public Meta(String name) {
        this(new ArrayList<HtmlComponent>(), name);
    }
    /**
     * Constructor of Meta class with 2 parameters
     * @param components - ArrayList of components inside this meta tag
     * @param name - String what should be in name parameter in this meta tag
     */
    public Meta(ArrayList<HtmlComponent> components, String name) {
        super("meta", "", components);
        this.name = name;
    }
    /**
     * Provides String of this Meta with filled name parameter
     * @return Complete String of this Meta tag
     */
    @Override
    public String toString()
    {
        StringBuilder result = new StringBuilder();
        if (!this.getTag().equals("")) {
            result.append("<").append(this.getTag()).append(" name=\"").append(this.getName()).append("\"").append(" content=\"\"").append(">\n");
        }
        for (HtmlComponent comp : this.getComponents())
        {
            result.append(comp.toString());
        }

        return result.toString();
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
