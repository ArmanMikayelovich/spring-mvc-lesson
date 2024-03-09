package com.mikayelovich.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
public class TimeController {
    /**
     * Handles the "/time" request and provides the current time to the view.
     * <p>
     * This method is mapped to the "/time" URL path through the {@code @RequestMapping} annotation.
     * When invoked, it adds the current {@code LocalDateTime} to the provided {@code ModelMap} instance
     * under the attribute named "time". The method then returns a view name, "time", which is resolved by
     * the view resolver and rendered to the client.
     * </p>
     * <p>
     * The {@code ModelMap} is a Spring MVC specific extension of the {@code Model} interface. It allows
     * for the complete abstraction of the view technology and is used for passing attributes to the view.
     * <p>
     * Example Usage:
     * <pre>
     * GET /time
     * </pre>
     * <p>
     * The above HTTP GET request to "/time" would be handled by this method, displaying the current time on
     * the page associated with the "time" view.
     * </p>
     *
     * @param model the {@code ModelMap} object used for storing attributes needed by the view.
     *              It's not created by the caller but rather by the Spring Framework before
     *              the method is called, and it will be passed to the view for rendering.
     * @return the name of the view to be rendered, in this case "time".
     * @see org.springframework.ui.ModelMap
     */
    @RequestMapping("/time")
    public String time(ModelMap model) {
        model.put("time", LocalDateTime.now());
        return "time";
    }


}
