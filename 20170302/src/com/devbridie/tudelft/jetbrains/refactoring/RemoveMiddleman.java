package com.devbridie.tudelft.jetbrains.refactoring;

import java.util.List;

class Package {
    int id;

    public int getId() {
        return id;
    }
}

class Order {
    //TODO we want to be able to ship to other countries.
    //TODO Street should become a new class "Destination".

    String street;
    Package aPackage;

    double price;

    //TODO this class has too many responsibilities;
    //TODO should expose Package instead
    public int getPackageID() {
        return aPackage.getId();
    }
}

/**
 * Demonstrates Remove Middleman.
 */
public class RemoveMiddleman {
    public void getStreets(List<Order> orders) {
        for (Order order : orders) {
            System.out.println("order.street = " + order.street);
        }
    }

    public void getPackageIDs(List<Order> orders) {
        for (Order order : orders) {
            System.out.println("order.packageid = " + order.getPackageID());
        }
    }
}
