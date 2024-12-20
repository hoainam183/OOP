package hust.soict.dsai.aims.store;

import java.util.ArrayList;

import javax.naming.LimitExceededException;

import hust.soict.dsai.aims.media.Media;

public class Store {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public int addMedia(Media media) throws LimitExceededException {
        int numberOfAddedMedia = 0;
        if (this.getItemsInStore().size() == MAX_NUMBERS_ORDERED) {
            throw new LimitExceededException("The cart is already full. No media was added.");
        } else {
            this.getItemsInStore().add(media);
            numberOfAddedMedia = 1;
            System.out.printf("%d media, '%s', has been added to the cart.%n", numberOfAddedMedia, media.getTitle());
        }
        return numberOfAddedMedia;
    }

    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println("Media item removed!");
            return;
        }
        System.out.println("Media item not found!");
        return;
    }

    public boolean removeMedia(String mediaName) {
        for (int i = 0; i < itemsInStore.size(); i++) {
            Media item = itemsInStore.get(i);
            if (item.getTitle().equalsIgnoreCase(mediaName)) {
                itemsInStore.remove(i);
                System.out.println("Media item removed!");
                return true;
            }
        }
        System.out.println("Media item not found!");
        return false;
    }

    public Media searchMedia(String title) {
        for (Media medium : this.itemsInStore) {
            if (medium.getTitle().toLowerCase().equals(title.toLowerCase())) {
                return medium;
            }
        }
        return null;
    }

    public ArrayList<Media> getItemsInStore() {
        return (ArrayList<Media>) this.itemsInStore;
    }

    public void print() {
        for (Media e : itemsInStore) {
            System.out.println(e.toString());
        }
    }
}