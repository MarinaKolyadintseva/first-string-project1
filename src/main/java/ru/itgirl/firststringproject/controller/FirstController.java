package ru.itgirl.firststringproject.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    DayOfWeek monday = DayOfWeek.MONDAY;


    @GetMapping("/dayOfWeek")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format(String.valueOf(monday));
    }

}


