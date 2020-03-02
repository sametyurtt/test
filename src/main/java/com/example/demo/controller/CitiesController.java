package com.example.demo.controller;

import com.example.demo.entity.Cities;
import com.example.demo.repository.CitiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CitiesController {

    private final CitiesRepository citiesRepository;

    @Autowired
    public CitiesController(CitiesRepository citiesRepository) {
        this.citiesRepository = citiesRepository;
    }


    @GetMapping("/getCity")
    public Iterable<Cities> getAllCities(){
        return citiesRepository.findAll();
    }

    @PostMapping(path = "/addNewCity")
    public String addNewUser (@RequestBody Cities cities) {
        citiesRepository.save(cities);
        return "Saved";
    }

    @DeleteMapping(path = "/deleteCity/{id}")
    public String deleteCity(@PathVariable Long id){
        citiesRepository.deleteById(id);
        return "deleted";
    }

    @PutMapping(path = "/updateCity")
    public String updateCity(@RequestParam(name = "id") long id,
                             @RequestBody Cities cities){
        citiesRepository.save(cities);
        return "update";
    }
}
