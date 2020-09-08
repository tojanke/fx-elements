package de.tojanke.fx.elements;

public class ScrollPane extends javafx.scene.control.ScrollPane {
    public ScrollPane(double width){
        this.setVbarPolicy(javafx.scene.control.ScrollPane.ScrollBarPolicy.ALWAYS);
        this.setHbarPolicy(javafx.scene.control.ScrollPane.ScrollBarPolicy.AS_NEEDED);
        this.setMinWidth(width * GuiConfig.defaultWidth * GuiConfig.scale);
        this.setMaxWidth(width * GuiConfig.defaultWidth * GuiConfig.scale);
        this.setMinHeight(10*GuiConfig.scale);
    }

    public ScrollPane(){
        this(1);
    }

    public void scrollDown(){
        this.setVvalue(1.0d);
    }
    public void scrollUp(){
        this.setVvalue(0d);
    }
}
