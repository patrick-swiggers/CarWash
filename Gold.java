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
public class Gold extends Washing {

    public Gold() {
        super(6);
    }

    @Override
    public String washText() {

        String txt = "Plus: free wheel cleaning \n";
        txt += "Extra: wax protection \n";
        txt += "Extra: chassis cleaning \n";
        return super.washText() + txt;
    }
}
