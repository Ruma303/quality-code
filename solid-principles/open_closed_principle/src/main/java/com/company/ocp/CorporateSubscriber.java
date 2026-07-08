package com.company.ocp;

public class CorporateSubscriber extends Subscriber {
    @Override
    public double calculateBill() {
        // logica custom per aziende
        return getBaseRate() * 0.9; // esempio: sconto 10%
    }
}
