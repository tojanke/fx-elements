package de.tojanke.fx.elements;

import javafx.scene.control.ButtonType;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public class Alert extends javafx.scene.control.Alert {
    public Alert(String text, Stage stage) {
        super(javafx.scene.control.Alert.AlertType.CONFIRMATION, text, ButtonType.YES, ButtonType.NO);
        this.getDialogPane().setStyle(GuiConfig.uStyle);
        this.initOwner(stage);
        this.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
    }

    public boolean confirm() {
        this.showAndWait();
        return (this.getResult() == ButtonType.YES);
    }
}
