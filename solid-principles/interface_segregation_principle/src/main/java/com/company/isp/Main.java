package com.company.isp;

import com.company.noisp.Order;
import com.company.noisp.User;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserPersistenceService userService = new UserPersistenceService();
        userService.save(new User());
// Ricerca per nome solo dove ha senso
        List<User> users = userService.findByName("Mario");

        OrderPersistenceService orderService = new OrderPersistenceService();
        orderService.save(new Order());
// Non esiste findByName su ordine, perché non ha senso semantico
    }
}
