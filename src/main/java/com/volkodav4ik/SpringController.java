package com.volkodav4ik;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class SpringController {

    @GetMapping
    public String test(
            @RequestParam(name = "title", required = false, defaultValue = "title") String title,
            @RequestParam(name = "text", required = false, defaultValue = "text") String text,
            Map<String, Object> model
    ) {

        model.put("title", title);
        model.put("text", text);
        return "test";
    }
}
