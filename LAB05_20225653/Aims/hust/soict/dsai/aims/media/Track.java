package hust.soict.dsai.aims.media;

import java.util.Objects;

public class Track implements Playable {
    private String title;
    private int length;

    // Constructor
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    // Getter
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    // Implement play() từ giao diện Playable
    @Override
    public void play() {
        System.out.println("Playing Track: " + title + " (" + length + " minutes)");
    }

    @Override
    public boolean equals(Object obj) {
        // Kiểm tra xem đối tượng có phải là một instance của Track không
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Track track = (Track) obj;
        return length == track.length && Objects.equals(title, track.title); // So sánh title và length
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, length); // Hashcode cần phải tương thích với equals
    }

    @Override
    public String toString() {
        return "Track - " + title + " (" + length + " mins)";
    }
}
