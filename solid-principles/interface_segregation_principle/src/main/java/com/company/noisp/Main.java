package com.company.noisp;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        Order order = new Order();

        User u = userPersistenceService.findByName("Mario");
        // ERROR: NON HA SENSO
        // Order o = orderPersistenceService.findByName("Mario");
    }
}
