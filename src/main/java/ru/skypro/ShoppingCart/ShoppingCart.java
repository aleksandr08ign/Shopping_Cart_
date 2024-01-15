package ru.skypro.ShoppingCart;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class ShoppingCart {

    private final List<Integer> purchases = new ArrayList<>();

    public List<Integer> add(List<Integer> purchases) {
        this.purchases.addAll(purchases);
        return purchases;
    }

    public List<Integer> getPurchases() {
        return purchases;
    }
}
