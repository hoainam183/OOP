/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aimsproject;

/**
 *
 * @author LENOVO
 */
public class Carts {

    public static final int MAX_NUMBERS_ORDERS = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERS];
    int qtyOrdered;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERS) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
        }
    }
    
    // Method Overloading
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (int i = 0; i < dvdList.length; i++) {
            if (qtyOrdered >= MAX_NUMBERS_ORDERS) {
                System.out.println("The cart is almost full");
                break;
            }
            itemsOrdered[qtyOrdered++] = dvdList[i];
            System.out.println("The disc " + i + " has been added");
        }
    }
    // Method Overloading
    public void addDigitalVideoDisc(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
        if (qtyOrdered < MAX_NUMBERS_ORDERS) {
            itemsOrdered[qtyOrdered] = disc1;
            qtyOrdered++;
        }
        if (qtyOrdered < MAX_NUMBERS_ORDERS) {
            itemsOrdered[qtyOrdered] = disc2;
            qtyOrdered++;
        }
    }
    
    //

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                break;
            }
        }
    }

    public void view() {
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println(itemsOrdered[i].getTitle());
        }
    }

    public float totalCost() {
        float total = 0.0f;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
    // prtint cart
    public void printCart() {
    System.out.println("***********************CART***********************");
    System.out.println("Ordered Items:");
    for (int i = 0; i < itemsOrdered.length; i++) {   
      if(itemsOrdered[i] != null) {
        System.out.println((i + 1) + ". DVD - " + itemsOrdered[i].toString());
      }        
    }
    System.out.println("Total cost: " + this.totalCost());
    System.out.println("**************************************************");
  }
}
