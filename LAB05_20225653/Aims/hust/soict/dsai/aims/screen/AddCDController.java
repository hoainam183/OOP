package hust.soict.dsai.aims.screen;

import javax.naming.LimitExceededException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import hust.soict.dsai.aims.Aims;
import hust.soict.dsai.aims.media.CompactDisc;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AddCDController {

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
        CompactDisc cd = new CompactDisc();
        cd.setTitle(tfTitle.getText());
        cd.setCategory(tfCategory.getText());
        cd.setId(Integer.parseInt(tfID.getText()));
        cd.setCost(Float.parseFloat(tfCost.getText()));
        Aims.store.addMedia(cd);
        JFrame frame = new JFrame("JOptionPane showMessageDialog example");
        JOptionPane.showMessageDialog(frame,
                "Update Store",
                cd.getTitle() + " Added to Store",
                JOptionPane.INFORMATION_MESSAGE);

        new StoreScreen(Aims.store);
        StoreScreen.sc1.setVisible(false);
    }

    @FXML
    void e8e408(ActionEvent event) {

    }

}