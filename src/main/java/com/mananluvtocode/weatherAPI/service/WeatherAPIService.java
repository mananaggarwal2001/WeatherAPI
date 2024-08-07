package com.mananluvtocode.weatherAPI.service;

import com.mananluvtocode.weatherAPI.Model.Location;
import com.mananluvtocode.weatherAPI.Model.SuperCurrent;
import com.mananluvtocode.weatherAPI.Model.SuperLocation;

public interface WeatherAPIService {
    SuperLocation getDetails(String countryName);

    SuperCurrent getCurrentDetails(String countryName);
}
