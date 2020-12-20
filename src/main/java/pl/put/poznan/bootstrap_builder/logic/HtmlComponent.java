package pl.put.poznan.bootstrap_builder.logic;

import java.util.ArrayList;
import java.util.List;

public class HtmlComponent {

    private String tag;
    private String content;
    private ArrayList <HtmlComponent> components;

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

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("<" + this.getTag() + ">\n");
        result.append(this.getContent());
        for (HtmlComponent comp : this.components)
        {
            result.append(comp.toString());
        }
        result.append("\n</").append(this.getTag()).append(">\n");
        return result.toString();
    }
}
