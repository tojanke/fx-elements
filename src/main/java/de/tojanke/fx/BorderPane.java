package de.tojanke.fx;

import javafx.geometry.Insets;

public class BorderPane extends javafx.scene.layout.BorderPane {

    public BorderPane(){
        this.setPadding(new Insets(3 * GuiConfig.scale));
    }
}
