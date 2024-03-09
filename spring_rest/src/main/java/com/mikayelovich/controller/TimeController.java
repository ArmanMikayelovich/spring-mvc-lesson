package com.mikayelovich.controller;

import com.mikayelovich.model.TimeObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
public class TimeController {

    @RequestMapping(path = "/time")
    public TimeObject time(@RequestHeader(name = "Accept") String acceptHeader) {

        TimeObject timeObject = new TimeObject();
        timeObject.setTitle(acceptHeader);

        timeObject.setTimestamp(LocalDateTime.now().toString());
        return timeObject;
    }


}
