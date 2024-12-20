package hust.soict.dsai.aims.screen;

import javax.naming.LimitExceededException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import hust.soict.dsai.aims.Aims;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AddDVDController {

    @FXML
    private TextField tfCost;

    @FXML
    private TextField tfTitle;

    @FXML
    private TextField tfCategory;

    @FXML
    private TextField tfID;

    @FXML
    void OkPressed(ActionEvent event) throws LimitExceededException {
        DigitalVideoDisc dvd = new DigitalVideoDisc();
        dvd.setTitle(tfTitle.getText());
        dvd.setCategory(tfCategory.getText());
        dvd.setId(Integer.parseInt(tfID.getText()));
        dvd.setCost(Float.parseFloat(tfCost.getText()));
        Aims.store.addMedia(dvd);
        JFrame frame = new JFrame("JOptionPane showMessageDialog example");
        JOptionPane.showMessageDialog(frame,
                "Update Store",
                dvd.getTitle() + " Added to Store",
                JOptionPane.INFORMATION_MESSAGE);

        new StoreScreen(Aims.store);
        StoreScreen.sc.setVisible(false);
    }

    @FXML
    void e8e408(ActionEvent event) {

    }

}