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
public class Track implements Playable {
	
	private String title;
	private int length;
	
	public Track(String title, int length) {

		this.title = title;
		this.length = length;
	}

	public String getTitle() {
		return title;
	}

	public int getLength() {
		return length;
	}
	
	public void play() {
        System.out.println("Playing track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true; // Kiểm tra tham chiếu
	    if (obj == null || getClass() != obj.getClass()) return false; // Kiểm tra kiểu đối tượng

	    Track track = (Track) obj; // Ép kiểu
	    return this.title.equals(track.title) && this.length == track.length; // So sánh title và length
	}

}