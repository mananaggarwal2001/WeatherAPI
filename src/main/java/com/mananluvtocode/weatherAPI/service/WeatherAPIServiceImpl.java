package com.mananluvtocode.weatherAPI.service;

import com.mananluvtocode.weatherAPI.Model.Location;
import com.mananluvtocode.weatherAPI.Model.SuperCurrent;
import com.mananluvtocode.weatherAPI.Model.SuperLocation;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class WeatherAPIServiceImpl implements WeatherAPIService {

    private final RestTemplate restTemplate;

    public WeatherAPIServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    private final static String uriString = "http://api.weatherapi.com/v1/current.json?key=31934736232b45fc95b75327240708";

    @Override
    public SuperLocation getDetails(String countryName) {
        if (countryName == null) {
            countryName = "India";
        }
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromUriString(uriString).queryParam("q", countryName);
        SuperLocation userData = restTemplate.getForObject(uriBuilder.toUriString(), SuperLocation.class);
        System.out.println(userData.getLocation().getName());
        return userData;
    }

    @Override
    public SuperCurrent getCurrentDetails(String countryName) {
        if (countryName == null) {
            countryName = "India";
        }
        try {
            UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromUriString(uriString).queryParam("q", countryName);
            SuperCurrent superCurrent = restTemplate.getForObject(uriBuilder.toUriString(), SuperCurrent.class);
            return superCurrent;
        } catch (Exception e) {
            throw new RuntimeException(countryName);
        }
    }
}
