package com.example.HelloInternet.models;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

public class NasaModel {
    @GetMapping("/apod")
    public NasaModel ApodInfo(RestTemplate restTemplate){
        String url = "https://api.nasa.gov/planetary/apod?api_key=W31YpYTRlYmygEgRbuxTcrCoV2fzEBGq9zIbIYvn";
        NasaModel apod = restTemplate.getForObject(url, NasaModel.class);
        return apod;
    }

}
