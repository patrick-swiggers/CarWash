/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject.carwash;

/**
 *
 * @author pswigge
 */
public class Washing {

    static final int basePrice = 5;
    protected int totalPrice = 0;

    public Washing(int extraPrice) {
        totalPrice = basePrice + extraPrice;
    }

    public String washText() {
        return "Standard car washing program. \n";
    }
}
