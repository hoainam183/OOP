/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import aimsproject.DigitalVideoDisc;
import aimsproject.Carts;

/**
 *
 * @author LENOVO
 */
public class CartTest {

    public static void main(String[] args) {
        Carts cart = new Carts();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 19.95f);
        cart.addDigitalVideoDisc(dvd3);

        cart.printCart();
    }
}
