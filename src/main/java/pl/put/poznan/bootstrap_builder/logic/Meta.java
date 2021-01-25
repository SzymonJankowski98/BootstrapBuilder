package pl.put.poznan.bootstrap_builder.logic;

import java.util.ArrayList;


public class Meta extends HtmlComponent{

    String property;

    public Meta(Boolean nav_fixed) {
        this(new ArrayList<HtmlComponent>(), "");
    }

    public Meta(ArrayList<HtmlComponent> components, String property) {
        super("meta", "", components);
        this.property = property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getProperty() {
        return this.property;
    }

    @Override
    public String toString()
    {
        StringBuilder result = new StringBuilder();
        if (!this.getTag().equals("")) {
            result.append("<").append(this.getTag()).append("property=\"").append(this.getProperty()).append("\")").append("content=\"\"").append(">\n");
        }
        result.append(this.getContent());
        if (!this.getContent().equals("")) {
            result.append("\n");
        }
        for (HtmlComponent comp : this.getComponents())
        {
            result.append(comp.toString());
        }
        if (!this.getTag().equals("")) {
            result.append("</").append(this.getTag()).append(">\n");
        }
        return result.toString();
    }

}
