package de.tojanke.fx;

import javafx.geometry.Pos;

public class Label extends javafx.scene.control.Label {

    public enum Orientation {
        Centered,
        Left
    }

    public Label(String text, double width, Orientation o, String style) {
        this.setText(text);
        this.setStyle(style);
        this.setMinWidth(width * GuiConfig.defaultWidth * GuiConfig.scale);
        this.setMaxWidth(width * GuiConfig.defaultWidth * GuiConfig.scale);
        this.setAlignment(o==Orientation.Left ? Pos.CENTER_LEFT : Pos.CENTER);        
    }

    public Label(String text, double width, Orientation o) {
        this(text,width,o, GuiConfig.bStyle);
    }

    public Label(String text) {
        this(text, 1,Orientation.Centered);
    }

    public Label(String text, String style) {
        this(text, 1,Orientation.Centered, style);
    }

    public Label() {
        this("");
    }
}
