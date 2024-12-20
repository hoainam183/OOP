package hust.soict.dsai.aims;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import javax.naming.LimitExceededException;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.exception.PlayerException;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.screen.StoreScreen;
import hust.soict.dsai.aims.store.Store;

public class Aims {
    // Store
    public static Store store = new Store();
    public static Cart cart = new Cart();

    public static void showMenu() throws PlayerException, LimitExceededException {
        int x = 1;
        while (x == 1) {
            System.out.println("AIMS: ");
            System.out.println("--------------------------------");
            System.out.println("1. View store");
            System.out.println("2. Update store");
            System.out.println("3. See current cart");
            System.out.println("0. Exit");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3");
            int choose;
            Scanner keyboard = new Scanner(System.in);
            choose = keyboard.nextInt();
            switch (choose) {
                case 0:
                    System.out.println("Xin chao, hen gap lai!");
                    break;
                case 1:
                    storeMenu();
                    break;
                case 2:
                    updateStore();
                    break;
                case 3:
                    cartMenu();
                    break;
                default:
                    System.out.println("Nhap sai Menu!");
                    ;
                    break;
            }

            if (choose == 0)
                break;
            keyboard.close();
        }

    }

    public static void storeMenu() throws PlayerException {
        int x = 1;
        while (x == 1) {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. See a media’s details");
            System.out.println("2. Add a media to cart");
            System.out.println("3. Play a media");
            System.out.println("4. See current cart");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3-4");
            int choose;
            Scanner keyboard = new Scanner(System.in);
            choose = keyboard.nextInt();
            switch (choose) {
                case 0:
                    System.out.println("Tro ve menu truoc!");
                    break;
                case 1:
                    mediaDetailsMenu();
                    break;
                case 2:
                    addCart();
                    break;
                case 3:
                    Play(store.getItemsInStore());
                    break;
                case 4:
                    cartMenu();
                    break;
                default:
                    System.out.println("Nhap sai Menu!");
                    ;
                    break;
            }

            if (choose == 0)
                break;
            keyboard.close();
        }
    }

    public static void mediaDetailsMenu() throws PlayerException {
        int x = 1;
        while (x == 1) {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Add to cart");
            System.out.println("2. Play");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2");
            int choose;
            Scanner keyboard = new Scanner(System.in);
            choose = keyboard.nextInt();
            switch (choose) {
                case 0:
                    System.out.println("Tro ve menu truoc!");
                    break;
                case 1:
                    addCart();
                    break;
                case 2:
                    Play(store.getItemsInStore());
                    break;

                default:
                    System.out.println("Nhap sai Menu!");
                    ;
                    break;
            }

            if (choose == 0)
                break;
            keyboard.close();
        }
    }

    public static void cartMenu() throws PlayerException {
        int x = 1;
        while (x == 1) {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Filter medias in cart");
            System.out.println("2. Sort medias in cart");
            System.out.println("3. Remove media from cart");
            System.out.println("4. Play a media");
            System.out.println("5. Place order");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3-4-5");
            int choose;
            Scanner keyboard = new Scanner(System.in);
            choose = keyboard.nextInt();
            switch (choose) {
                case 0:
                    System.out.println("Tro ve menu truoc!");
                    break;
                case 1:
                    filtercart();
                    break;
                case 2:
                    sortmedia();
                    break;
                case 3:
                    removeCart();
                    break;
                case 4:
                    Play(cart.getItemsOrdered());
                    break;
                case 5:
                    order();
                    break;
                default:
                    System.out.println("Nhap sai Menu!");
                    ;
                    break;
            }

            if (choose == 0)
                break;
            keyboard.close();
        }
    }

    // update store
    public static void updateStore() throws LimitExceededException {
        int i = 1;
        while (i == 1) {

            System.out.println("Add or Remove Media!");
            System.out.println("1. Add Media.");
            System.out.println("2. Remove Media");
            System.out.println("0.back");
            int choose;
            Scanner keyboard = new Scanner(System.in);
            choose = keyboard.nextInt();
            switch (choose) {
                case 0:
                    System.out.println("Tro ve menu truoc!");
                    break;
                case 1:
                    menu1();
                    break;
                case 2:
                    menu2();
                    break;

                default:
                    System.out.println("Nhap sai Menu!");
                    ;
                    break;
            }

            if (choose == 0)
                break;
            keyboard.close();
        }
    }

    // add media vao store
    public static void menu1() throws LimitExceededException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tilte disc:");
        String t = sc.nextLine();
        System.out.println("Nhap category");
        String c = sc.nextLine();
        System.out.println("Nhap cost");
        float co = sc.nextFloat();
        DigitalVideoDisc dvd = new DigitalVideoDisc(t, c, co);
        store.addMedia(dvd);
        sc.close();
    }

    // remove media store
    public static void menu2() {
        int kt = 0;
        System.out.println("nhap title can remove");
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        for (Media dvd : store.getItemsInStore()) {
            if (dvd.getTitle().equals(t)) {
                store.removeMedia(dvd);
                System.out.println("removed");
                break;
            }
        }
        if (kt == 0)
            System.out.println("Khong ton tai Media " + t);
        sc.close();
    }

    // Play disc
    public static void Play(List<Media> x) throws PlayerException {
        for (Media dvd : x) {
            DigitalVideoDisc dvd1 = (DigitalVideoDisc) dvd;
            dvd1.play();
        }

    }

    // add Cart
    public static void addCart() {
        Scanner sc = new Scanner(System.in);
        for (Media dvd : store.getItemsInStore()) {
            System.out.println("add Media" + dvd.getTitle() + " ?");
            System.out.println("1. Yes\n2.No");
            int x = sc.nextInt();
            if (x == 1) {
                cart.addMedia(dvd);
                System.out.println("added!");
            }
        }
        sc.close();
    }

    // remove Cart
    public static void removeCart() {
        Scanner sc = new Scanner(System.in);
        for (Media dvd : cart.getItemsOrdered()) {
            System.out.println("remove Media " + dvd.getTitle() + " ?");
            System.out.println("1. Yes\n2.No");
            int x = sc.nextInt();
            if (x == 1) {
                cart.removeMedia(dvd);
                System.out.println("removed!");
            }
        }
        sc.close();
    }

    // order cart
    public static void order() {
        System.out.println("ban da dat hang thanh cong\n tong so tien la: " + cart.totalCost());
        cart = new Cart();
    }

    // sort media for cart
    public static void sortmedia() {
        int i = 1;
        while (i == 1) {

            System.out.println("Sort by title or Sort by cost");
            System.out.println("1. Sort by title");
            System.out.println("2. Sort by cost");
            System.out.println("0.back");
            int choose;
            Scanner keyboard = new Scanner(System.in);
            choose = keyboard.nextInt();
            switch (choose) {
                case 0:
                    System.out.println("Tro ve menu truoc!");
                    break;
                case 1:
                    Collections.sort(cart.getItemsOrdered(), Media.COMPARE_BY_TITLE_COST);
                    cart.print();
                    break;
                case 2:
                    Collections.sort(cart.getItemsOrdered(), Media.COMPARE_BY_COST_TITLE);
                    cart.print();
                    break;

                default:
                    System.out.println("Nhap sai Menu!");
                    ;
                    break;
            }

            if (choose == 0)
                break;
            keyboard.close();
        }
    }

    // filter for cart
    public static void filtercart() {
        int i = 1;
        while (i == 1) {

            System.out.println("filter by id or filter by title");
            System.out.println("1. Filter by id");
            System.out.println("2. Filter by title");
            System.out.println("0.back");
            int choose;
            Scanner keyboard = new Scanner(System.in);
            choose = keyboard.nextInt();
            switch (choose) {
                case 0:
                    System.out.println("Tro ve menu truoc!");
                    break;
                case 1:
                    cart.searchCartId();
                    break;
                case 2:
                    cart.searchCartTitle();
                    break;

                default:
                    System.out.println("Nhap sai Menu!");
                    ;
                    break;
            }

            if (choose == 0)
                break;
            keyboard.close();
        }
    }

    public static void main(String[] args) throws PlayerException, LimitExceededException {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Kazetachime",
                "Anime", "Miyazaki Hayao", 120, 20.00f);

        store.addMedia(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Shameless",
                "Comedy", "William H", 55, 10.95f);
        store.addMedia(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Youjitsu",
                "Anime", 3.99f);
        store.addMedia(dvd3);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Oregairu",
                "wataru watari", 15.99f);
        store.addMedia(dvd4);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Deadpool and Wolverine",
                "MCU", 30.799f);
        store.addMedia(dvd6);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("I CANT STOP THE LONELINESS",
                "Song", 2.99f);
        store.addMedia(dvd5);
        DigitalVideoDisc dvd7 = new DigitalVideoDisc("Dramaturgy",
                "Eve song", 2.99f);
        store.addMedia(dvd7);

        // lab05 Application
        new StoreScreen(store);

        // lab04 console menu
        // showMenu();

    }

}