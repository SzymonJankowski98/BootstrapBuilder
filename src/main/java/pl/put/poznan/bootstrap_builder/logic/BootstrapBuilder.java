package pl.put.poznan.bootstrap_builder.logic;

import java.awt.*;
import java.util.ArrayList;

/**
 * This is just an example to show that the logic should be outside the REST service.
 */
public class BootstrapBuilder {

    String nav = "";
    private String foot = "";

    public BootstrapBuilder(String nav, String foot) {
        this.nav = nav;
        this.foot = foot;
    }

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

        ArrayList<HtmlComponent> body_components = new ArrayList<HtmlComponent>();
        body_components.add(new Main());
        if (this.nav.equals("static")) {
            body_components.add(new Nav(false));
        }
        if (this.nav.equals("fixed")) {
            body_components.add(new Nav(true));
        }

        if (this.foot.equals("true")) {
            HtmlComponent footer = new HtmlComponent("footer", "", new ArrayList<>());
            body_components.add(footer);
        }
        Body body = new Body(body_components);
        result += body.toString();

        result += "</html>";

        return result;
    }
}
