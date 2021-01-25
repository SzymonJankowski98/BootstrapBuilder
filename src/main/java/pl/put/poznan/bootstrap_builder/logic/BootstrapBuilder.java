package pl.put.poznan.bootstrap_builder.logic;

import java.awt.*;
import java.util.ArrayList;

/**
 * Main class of Bootstrap Builder.
 */
public class BootstrapBuilder {

    private String nav = "";
    private String foot = "";
    private String sidebar = "";
    private String meta = "";
    /**
     * Constructor of Bootstrap Builder. In parameters you decide if you want to add tags
     * @param nav - dynamic header ("fixed"), static header ("static")
     * @param foot - includes footer in body ("true")
     */
    public BootstrapBuilder(String nav, String sidebar, String foot, String meta) {
        setNav(nav);
        setSidebar(sidebar);
        setFoot(foot);
        setMeta(meta);
    }
    /**
     * Creates basic html code with basics and additionally wanted tags.
     * @return String of your html code
     */
    public String create() {
        String result = "<!doctype html>\n" +
                        "<html lang=\"pl\">\n"+
                        "<meta charset=\"utf-8\">\n";

        Head head = new Head();

        String[] arrOfStr = getMeta().split(";");

        for (String a : arrOfStr) {
            if (a.equals("normal")) {
                head.addComponent(new Meta("description"));
                head.addComponent(new Meta("keywords"));
                head.addComponent(new Meta("author"));
                head.addComponent(new Meta("viewport"));
            }
            if (a.equals("tt")) {
                head.addComponent(new Meta("twitter:card"));
                head.addComponent(new Meta("twitter:creator"));
                head.addComponent(new Meta("twitter:url"));
                head.addComponent(new Meta("twitter:title"));
                head.addComponent(new Meta("twitter:description"));
                head.addComponent(new Meta("twitter:image"));
            }
            if (a.equals("og")) {
                head.addComponent(new Meta("og:url"));
                head.addComponent(new Meta("og:type"));
                head.addComponent(new Meta("og:title"));
                head.addComponent(new Meta("og:description"));
                head.addComponent(new Meta("og:image"));
            }
        }

        result += head.toString();

        Body body = new Body();

        body.addComponent(new HtmlComponent("", "<main class=\"container\">\n</main>", new ArrayList<>()));
        if (getNav().equals("static")) {
            body.addComponent(new Nav(false));
        }
        if (getNav().equals("fixed")) {
            body.addComponent(new Nav(true));
        }
        if (getSidebar().equals("true")){
            body.addComponent(new SideBar());
        }
        if (getFoot().equals("true")) {
            HtmlComponent footer = new HtmlComponent("footer", "", new ArrayList<>());
            body.addComponent(footer);
        }
        result += body.toString();

        result += "</html>";

        return result;
    }

    public String getNav() {
        return this.nav;
    }

    public void setNav(String nav) {
        this.nav = nav;
    }

    public String getFoot() {
        return this.foot;
    }

    public void setFoot(String foot) {
        this.foot = foot;
    }

    public String getSidebar() {
        return this.sidebar;
    }

    public void setSidebar(String sidebar) {
        this.sidebar = sidebar;
    }

    public String getMeta() {
        return this.meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

}
