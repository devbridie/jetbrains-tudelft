package com.devbridie.tudelft.jetbrains.refactoring;

/**
 * Demonstrates EncapsulateFields.
 */
public class EncapsulateFields {
    // TODO: Move this class to package scope!
    static class Customer {
        int id;
        String name;

        public Customer(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Customer dereck = new Customer(1, "Dereck Bridie");
        dereck.name = "Daan";
        dereck.id = 2; // TODO: We don't want to allow ID changing!
    }
}
