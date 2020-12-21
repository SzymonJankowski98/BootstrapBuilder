package pl.put.poznan.bootstrap_builder.logic;

import java.util.ArrayList;
import java.util.List;

/**
 * Class of Html components.
 * Every component has a tag, content and list of components inside.
 */
public class HtmlComponent {

    private String tag;
    private String content;
    private ArrayList <HtmlComponent> components;

    /**
     * Constructor of Html Component
     * @param tag - String in tag
     * @param content - String between opening and closing tag
     * @param components - ArrayList of other components that can be inside this html component
     */
    public HtmlComponent(String tag, String content, ArrayList<HtmlComponent> components) {
        this.tag = tag;
        this.content = content;
        this.components = components;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void addComponent(HtmlComponent component) {
        this.components.add(component);
    }

    public List <HtmlComponent> getComponents()
    {
        return this.components;
    }

    /**
     * Provides String of this html component with components inside it
     * @return Complete String of this component
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        if (!this.getTag().equals("")) {
            result.append("<").append(this.getTag()).append(">\n");
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
