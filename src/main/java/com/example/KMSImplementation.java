package com.example;

public class KMSImplementation implements KMS {
    // Implement all the methods from the KMS interface

    @Override
    public void addBeenzToEmployee(Employee employee, int points) {
        employee.getBeenzAccount().addBeenz(points);
    }

    @Override
    public boolean redeemBeenzFromEmployee(Employee employee, int points) {
        return employee.getBeenzAccount().redeemBeenz(points);
    }

    // Implementations for other methods...
}
