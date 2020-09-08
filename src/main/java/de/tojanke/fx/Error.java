package de.tojanke.fx;

import javafx.scene.control.Alert;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public class Error extends Alert {

	public Error(String context, String detail, Stage stage) {
        super(javafx.scene.control.Alert.AlertType.ERROR);
        this.getDialogPane().setStyle(GuiConfig.uStyle);
        this.setTitle(context);
        this.setHeaderText(context);
        this.setContentText(detail);
        this.initOwner(stage);
        this.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);        
    }	
}
