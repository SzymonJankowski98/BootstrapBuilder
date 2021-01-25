package pl.put.poznan.bootstrap_builder.logic;

import java.util.ArrayList;

/**
 * Head class - head of html code
 */
public class Head extends HtmlComponent {

    /**
     * Constructor of Head class without parameters creates Head without any components inside
     */
    public Head() {
        this(new ArrayList<HtmlComponent>());
    }

    /**
     * Constructor of Head class with 1 parameter
     * @param components - ArrayList of components inside this Head
     */
    public Head(ArrayList<HtmlComponent> components) {
        super("head", "", components);
    }

    @Override
    public String toString() {
        String result = super.toString();
        result = result.substring(0, result.length() - this.getTag().length() - 4);
        result += "<title>Starter Template for Bootstrap</title>\n"+
        "<link rel=\"canonical\" href=\"https://getbootstrap.com/docs/4.0/examples/starter-template/\">\n"+
                "<link href=\"../../dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n" +
                "</"+this.getTag()+">\n";
        return result;
    }
}
