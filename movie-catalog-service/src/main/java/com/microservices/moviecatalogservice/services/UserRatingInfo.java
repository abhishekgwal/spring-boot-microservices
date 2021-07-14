package com.microservices.moviecatalogservice.services;

import com.microservices.moviecatalogservice.models.Rating;
import com.microservices.moviecatalogservice.models.UserRating;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class UserRatingInfo {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getFallBackUserRating")
    public UserRating getUserRating(String userId) {
        return restTemplate.getForObject("http://ratings-data-service/ratingsdata/user/" + userId, UserRating.class);
    }

    // Fall back method for getUserRating
    public UserRating getFallBackUserRating (String userId) {
        UserRating userRating = new UserRating();
        userRating.setUserId("No user");
        userRating.setRatings(Arrays.asList(new Rating("0", 0)));
        return userRating;
    }

}
