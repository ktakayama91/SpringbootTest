package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Kei Takayama
 * Created on 12/1/16.
 */

@RestController
public class GreetingControllerImpl implements GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong  counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greetings greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new GreetingsImpl(counter.incrementAndGet(),
                String.format(template, name));
    }
}
