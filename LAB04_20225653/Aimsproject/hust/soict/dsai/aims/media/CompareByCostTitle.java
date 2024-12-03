/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.dsai.aims.media;

/**
 *
 * @author LENOVO
 */
import java.util.Comparator;

public class CompareByCostTitle implements Comparator<Media> {
	
    @Override
    public int compare(Media media1, Media media2) {
        int costCompare = Float.compare(media2.getCost(), media1.getCost()); // Sắp xếp theo giá giảm dần
        if (costCompare != 0) {
            return costCompare;
        }
        return media1.getTitle().compareTo(media2.getTitle()); // Nếu giá giống nhau, sắp xếp theo tiêu đề
    }
}
