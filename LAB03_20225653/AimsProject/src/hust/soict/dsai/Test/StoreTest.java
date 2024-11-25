package test;

import aimsproject.DigitalVideoDisc;
import aimsproject.Store;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class StoreTest {
    public static void main(String[] args) {
    Store store = new Store();
    DigitalVideoDisc dvd = new DigitalVideoDisc("Test");
    store.addDVD(dvd);
    store.removeDVD(dvd);
  }
}
