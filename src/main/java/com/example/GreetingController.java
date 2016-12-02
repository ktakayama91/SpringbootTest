package com.example;

import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Kei Takayama
 * Created on 12/1/16.
 */
public interface GreetingController {

    Greetings greeting(@RequestParam(value="name", defaultValue="World") String name);
}
