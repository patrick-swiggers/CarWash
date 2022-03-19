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
public class Bike extends Washing {

    public Bike() {
        super(10);
    }

    @Override
    public String washText() {
        String txt = "Contact our frontdesk to make an appointment.\n";
        txt += "Our specialists will detail your bike with care.\n";
        return txt;
    }
}
