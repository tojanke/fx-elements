package de.tojanke.fx.elements;

import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class Title extends javafx.scene.layout.HBox {
    public Title(String text){
        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(5*GuiConfig.scale));
        this.getChildren().add(new Label(text,3, Label.Orientation.Centered,GuiConfig.tStyle));
    }
}
