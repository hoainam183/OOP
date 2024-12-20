package hust.soict.dsai.aims.cart;

import java.util.Scanner;

import hust.soict.dsai.aims.media.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Cart {
    private static final int MAX_NUMBERS_ORDERED = 20;
    private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
    private ObservableList<Media> viewFilter;

    public void addMedia(Media m) {

        if ((itemsOrdered.size() < MAX_NUMBERS_ORDERED) && (!itemsOrdered.contains(m))) {
            itemsOrdered.add(m);
            System.out.println("added");
        } else
            System.out.println("Can not add!");

    }

    public void removeMedia(Media m) {
        if (itemsOrdered.contains(m)) {
            itemsOrdered.remove(m);
            System.out.println("removed!");
        } else
            System.out.println("media not found!");
    }

    public float totalCost() {
        float cost = 0.0f;
        for (Media medium : itemsOrdered) {
            cost += medium.getCost();
        }
        return cost;
    }

    public void print() {
        System.out.println("\n***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < this.itemsOrdered.size(); i++) {
            System.out.println(Integer.toString(i + 1) + "." + "\t" + this.itemsOrdered.get(i).getDetails() + "\n");
        }
        System.out.println("Total cost: " + "$" + this.totalCost());
        System.out.println("***************************************************");
        System.out.println("\n");
    }

    public void searchCartId() {
        int id, sum = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("nhap ID: ");
        id = keyboard.nextInt();
        for (Media dvd : itemsOrdered) {
            if (id == dvd.getId()) {
                System.out.println(dvd.toString());
                sum++;
                break;
            }
        }

        if (sum == 0) {
            System.out.println("Found\n");
        }
        keyboard.close();
    }

    // tìm theo tiêu đề
    public void searchCartTitle() {
        String title1;
        int sum = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("nhap title: ");
        title1 = keyboard.nextLine();
        for (Media dvd : itemsOrdered) {
            if (dvd.getTitle().equals(title1)) {
                System.out.println(dvd.toString());
                sum++;
                break;
            }
        }
        if (sum == 0) {
            System.out.println("Found!");
        }
        keyboard.close();
    }

    public Media searchMedia(String title) {
        for (Media medium : this.itemsOrdered) {
            if (medium.getTitle().toLowerCase().equals(title.toLowerCase())) {
                return medium;
            }
        }
        return null;
    }

    public void sortByTitle() {
        FXCollections.sort(this.itemsOrdered, Media.COMPARE_BY_TITLE_COST);
    }

    public void sortByCost() {
        FXCollections.sort(this.itemsOrdered, Media.COMPARE_BY_COST_TITLE);
    }

    public int getSize() {
        return this.itemsOrdered.size();
    }

    public ObservableList<Media> getItemsOrdered() {
        return this.itemsOrdered;
    }

    public ObservableList<Media> filterId(String str) {
        viewFilter = FXCollections.observableArrayList();
        for (int i = 0; i < this.itemsOrdered.size(); i++) {
            if (str.length() > String.valueOf(this.itemsOrdered.get(i).getId()).length()) {
                continue;
            } else if (String.valueOf(this.itemsOrdered.get(i).getId()).substring(0, str.length()).equals(str)) {
                viewFilter.add(this.itemsOrdered.get(i));
            }
        }
        return viewFilter;
    }

    public ObservableList<Media> filterTitle(String str) {
        viewFilter = FXCollections.observableArrayList();
        for (int i = 0; i < this.itemsOrdered.size(); i++) {
            if (str.length() > String.valueOf(this.itemsOrdered.get(i).getTitle()).length()) {
                continue;
            } else if (this.itemsOrdered.get(i).getTitle().substring(0, str.length()).equals(str)) {
                viewFilter.add(this.itemsOrdered.get(i));
            }
        }
        return viewFilter;
    }

    public void empty() {
        this.itemsOrdered.clear();
    }
}