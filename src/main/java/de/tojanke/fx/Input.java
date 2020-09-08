package de.tojanke.fx;

import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public class Input extends TextInputDialog {
	public Input(String text, Stage stage) {
        super("");
		super.setTitle(text);
		super.setHeaderText(text);
		super.setContentText("");
        this.getDialogPane().setStyle(GuiConfig.uStyle);
        this.initOwner(stage);
        this.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
    }

    public String getAnswer() {
        this.showAndWait();
        return (this.getResult());
    }
}
