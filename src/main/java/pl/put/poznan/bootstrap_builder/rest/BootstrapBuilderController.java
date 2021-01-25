package pl.put.poznan.bootstrap_builder.rest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.bootstrap_builder.logic.BootstrapBuilder;

@RestController
public class BootstrapBuilderController {

    private static final Logger logger = LoggerFactory.getLogger(BootstrapBuilderController.class);

    @GetMapping(value = "/template")
    public String test(@RequestParam(value="nav", defaultValue="none") String nav,
                       @RequestParam(value="sidebar", defaultValue="false") String sidebar,
                       @RequestParam(value="footer", defaultValue="false") String foot) {
        BootstrapBuilder bootstrapBuilder = new BootstrapBuilder(nav, sidebar, foot);
        return bootstrapBuilder.create();
    }
}


