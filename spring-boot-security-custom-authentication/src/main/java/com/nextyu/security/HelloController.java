package com.nextyu.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 2017-12-04 21:24
 *
 * @author nextyu
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public Object hello() {
        return "hello";
    }
}
