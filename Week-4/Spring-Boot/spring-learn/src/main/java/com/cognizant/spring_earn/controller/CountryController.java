package com.cognizant.spring_earn.controller;

import com.cognizant.spring_earn.model.Country;
import com.cognizant.spring_earn.service.CountryService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
public class CountryController {

    @RequestMapping("/country")
    public Country getCountryIndia() {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        return context.getBean("india", Country.class);
    }

    @GetMapping("/countries")
    public List<Country> getAllCountries() {

        CountryService service = new CountryService();
        return service.getAllCountries();
    }


    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {

        CountryService service = new CountryService();

        return service.getCountry(code);
    }


}