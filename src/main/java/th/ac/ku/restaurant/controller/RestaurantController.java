package th.ac.ku.restaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import th.ac.ku.restaurant.model.Restaurant;
import th.ac.ku.restaurant.service.RestaurantService;

import java.util.List;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    @Autowired
    private RestaurantService service;

    @GetMapping
    public List<Restaurant> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Restaurant create(@RequestBody Restaurant restaurant) {
        System.out.println(restaurant);
        return service.create(restaurant);
    }

    @GetMapping("/{id}")
    public Restaurant getById(@PathVariable int id) {
        return service.getRestaurant(id);
    }

}
