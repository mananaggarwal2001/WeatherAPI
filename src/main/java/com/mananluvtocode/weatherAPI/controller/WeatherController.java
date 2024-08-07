package com.mananluvtocode.weatherAPI.controller;
import com.mananluvtocode.weatherAPI.service.WeatherAPIService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WeatherController {
    private final WeatherAPIService weatherAPIService;

    public WeatherController(WeatherAPIService weatherAPIService) {
        this.weatherAPIService = weatherAPIService;
    }
    private String lastTime(String result){
        return result.split(" ")[1];
    }
    @GetMapping("/")
    public String index(Model themodel) {
        themodel.addAttribute("countrySearchName", "India");
        themodel.addAttribute("current", weatherAPIService.getCurrentDetails(null).getCurrent());
        themodel.addAttribute("details", weatherAPIService.getDetails(null).getLocation());
        themodel.addAttribute("time", lastTime(weatherAPIService.getCurrentDetails(null).getCurrent().getLast_updated()));
        return "weather";
    }

    @GetMapping("/name")
    public String name(Model themodel, @RequestParam("countrySearch") String countrySearch) {
        themodel.addAttribute("countrySearchName", countrySearch);
        themodel.addAttribute("current", weatherAPIService.getCurrentDetails(countrySearch).getCurrent());
        themodel.addAttribute("details", weatherAPIService.getDetails(countrySearch).getLocation());
        themodel.addAttribute("time", lastTime(weatherAPIService.getCurrentDetails(countrySearch).getCurrent().getLast_updated()));
        return "weather";
    }

//    @GetMapping("/")
//    @ResponseStatus(HttpStatus.OK)
//    public SuperLocation weatherAPI() {
//        return weatherAPIService.getDetails("Karnataka");
//    }
}
