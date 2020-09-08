package de.tojanke.fx;

import javafx.event.EventHandler;
import javafx.geometry.Pos;

public class Button extends javafx.scene.control.Button {


    public Button(String text, EventHandler action, double width){
        this.setText(text);
        this.setStyle(GuiConfig.bStyle);
        this.setOnAction(action);
        this.setMinWidth(width * GuiConfig.defaultWidth * GuiConfig.scale);
        this.setMaxWidth(width * GuiConfig.defaultWidth * GuiConfig.scale);
        this.setAlignment(Pos.CENTER);
    }

    public Button(String text, EventHandler action){
        this(text,action,1);
    }

}
