package com.mananluvtocode.weatherAPI.controller;

import com.mananluvtocode.weatherAPI.Model.SuperCurrent;
import com.mananluvtocode.weatherAPI.Model.SuperLocation;
import com.mananluvtocode.weatherAPI.service.WeatherAPIService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WeatherController {
    private final WeatherAPIService weatherAPIService;

    public WeatherController(WeatherAPIService weatherAPIService) {
        this.weatherAPIService = weatherAPIService;
    }

    @GetMapping("/")
    public String index(Model themodel) {
        themodel.addAttribute("countrySearchName", "India");
        themodel.addAttribute("current", weatherAPIService.getCurrentDetails(null).getCurrent());
        themodel.addAttribute("details", weatherAPIService.getDetails(null).getLocation());
        return "weather";
    }

    @GetMapping("/name")
    public String name(Model themodel, @RequestParam("countrySearch") String countrySearch) {
        themodel.addAttribute("countrySearchName", countrySearch);
        themodel.addAttribute("current", weatherAPIService.getCurrentDetails(countrySearch).getCurrent());
        themodel.addAttribute("details", weatherAPIService.getDetails(countrySearch).getLocation());
        return "weather";
    }

//    @GetMapping("/")
//    @ResponseStatus(HttpStatus.OK)
//    public SuperLocation weatherAPI() {
//        return weatherAPIService.getDetails("Karnataka");
//    }
}
