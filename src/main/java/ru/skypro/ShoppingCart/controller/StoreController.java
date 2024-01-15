package ru.skypro.ShoppingCart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.ShoppingCart.service.StoreService;

import java.util.List;

@RequestMapping("order")
@RestController
public class StoreController {

    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("add")
    public List<Integer> add(@RequestParam("purchases") List<Integer> purchases) {
        return storeService.add(purchases);
    }

    @GetMapping("get")
    public List<Integer> get() {
        return storeService.get();
    }

}
