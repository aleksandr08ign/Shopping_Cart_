package ru.skypro.ShoppingCart.service;

import org.springframework.stereotype.Service;
import ru.skypro.ShoppingCart.ShoppingCart;

import java.util.List;

@Service

public class StoreServiceimpl implements StoreService{

    private final ShoppingCart shoppingCart;

    public StoreServiceimpl(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public List<Integer> add(List<Integer> purchases) {
        return shoppingCart.add(purchases);
    }

    @Override
    public List<Integer> get() {
        return shoppingCart.getPurchases();
    }
}
