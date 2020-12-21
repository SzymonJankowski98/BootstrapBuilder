package pl.put.poznan.bootstrap_builder.logic;

import java.util.ArrayList;

public class Body extends HtmlComponent {

    public Body() {
        this(new ArrayList<HtmlComponent>());
    }
    public Body(ArrayList<HtmlComponent> components) {
        super("body", "", components);
    }

    @Override
    public String toString() {
        String result = super.toString();
        result = result.substring(0, result.length() - this.getTag().length() - 4);
        result += "<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n" +
                  "<script>window.jQuery || document.write('<script src=\"../../assets/js/vendor/jquery-slim.min.js\"></script>')</script>\n"+
                  "<script src=\"../../assets/js/vendor/popper.min.js\"></script>\n"+
                  "<script src=\"../../dist/js/bootstrap.min.js\"></script>\n" +
                  "</"+this.getTag()+">\n";
        return result;
    }
}
