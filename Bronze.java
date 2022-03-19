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
public class Bronze extends Washing {

    public Bronze() {
        super(2);
    }

    public Bronze(int e) {
        super(e);
    }

    @Override
    public String washText() {

        String txt = "Plus: free wheel cleaning \n";
        return super.washText() + txt;
    }
}
