package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {
    @Override
    public int compare(Media m1, Media m2) {
        // Sắp xếp theo title trước
        int titleComparison = m1.getTitle().compareTo(m2.getTitle());
        if (titleComparison == 0) {
            // Nếu title giống nhau, so sánh theo cost
            return Float.compare(m1.getCost(), m2.getCost());
        }
        return titleComparison;
    }
}
