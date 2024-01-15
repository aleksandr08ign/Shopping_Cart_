package ru.skypro.ShoppingCart.service;

import java.util.List;

public interface StoreService {
    List<Integer> add (List<Integer> purchases);
    List<Integer> get();
}
