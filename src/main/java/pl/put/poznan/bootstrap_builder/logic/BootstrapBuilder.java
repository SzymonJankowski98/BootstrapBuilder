package pl.put.poznan.bootstrap_builder.logic;

/**
 * This is just an example to show that the logic should be outside the REST service.
 */
public class BootstrapBuilder {

    public String create(){
        Head head = new Head();
        Body body = new Body();
        return "<html>"+ head.toString() + body.toString() + "</html>";
    }
}
