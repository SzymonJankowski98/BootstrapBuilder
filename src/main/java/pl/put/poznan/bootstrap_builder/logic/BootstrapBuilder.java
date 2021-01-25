package pl.put.poznan.bootstrap_builder.logic;

import java.awt.*;
import java.util.ArrayList;

/**
 * Main class of Bootstrap Builder.
 */
public class BootstrapBuilder {

    String nav = "";
    private String foot = "";
    private String sidebar = "";
    /**
     * Constructor of Bootstrap Builder. In parameters you decide if you want to add tags
     * @param nav - dynamic header ("fixed"), static header ("static")
     * @param foot - includes footer in body ("true")
     */
    public BootstrapBuilder(String nav, String sidebar, String foot) {
        this.nav = nav;
        this.sidebar = sidebar;
        this.foot = foot;
    }

    /**
     * Creates basic html code with basics and additionally wanted tags.
     * @return String of your html code
     */
    public String create() {
        String result = "<!doctype html>\n" +
                        "<html lang=\"pl\">\n"+
                        "<meta charset=\"utf-8\">\n"+
                        "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n"+
                        "<meta name=\"description\" content=\"\">\n"+
                        "<meta name=\"author\" content=\"\">\n"+
                        "<title>Starter Template for Bootstrap</title>\n"+
                        "<link rel=\"canonical\" href=\"https://getbootstrap.com/docs/4.0/examples/starter-template/\">\n"+
                        "<link href=\"../../dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n";

        Head head = new Head();
        result += head.toString();

        Body body = new Body();

        body.addComponent(new HtmlComponent("", "<main class=\"container\">\n</main>", new ArrayList<>()));
        if (this.nav.equals("static")) {
            body.addComponent(new Nav(false));
        }
        if (this.nav.equals("fixed")) {
            body.addComponent(new Nav(true));
        }
        if (this.sidebar.equals("true")){
            body.addComponent(new SideBar());
        }
        if (this.foot.equals("true")) {
            HtmlComponent footer = new HtmlComponent("footer", "", new ArrayList<>());
            body.addComponent(footer);
        }
        result += body.toString();

        result += "</html>";

        return result;
    }
}
