package blablacar.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import blablacar.domain.Home;

@RestController
public class HomeRestController {

    private static final String template = "WELCOME ON FUNKY BLABLACAR, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Home home(@RequestParam(value="name", defaultValue="World") String name) {
        return new Home(counter.incrementAndGet(),
                            String.format(template, name));
    }
}
