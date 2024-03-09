package com.mikayelovich.controller;

import com.mikayelovich.model.TimeObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
public class TimeController {

    @RequestMapping("/time")
    public TimeObject time() {
        TimeObject timeObject = new TimeObject();
        timeObject.setTitle("here is the timestamp");

        timeObject.setTimestamp(LocalDateTime.now().toString());
        return timeObject;
    }


}
