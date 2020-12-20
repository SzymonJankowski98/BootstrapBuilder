package pl.put.poznan.bootstrap_builder.logic;

public abstract class HtmlCreator {

    private HtmlComponent component;

    public void setComponent(HtmlComponent component) {
        this.component = component;
    }

    public HtmlComponent getComponent() {
        return component;
    }

    @Override
    public String toString() {
        return component.toString();
    }
}
