package de.tojanke.fx.elements;

import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class HBox extends javafx.scene.layout.HBox {

    public HBox(boolean border, int spacing, Node... n){
        this.setSpacing(spacing);
        this.setAlignment(Pos.CENTER);
        if(border){
            this.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        }
        add(n);
    }

    public HBox(boolean border, Node... n){
        this(border, GuiConfig.hSpacing,n);
    }
    public HBox(){
        this(false);
    }
    public HBox(Node... n){
        this(false, n);
    }

    public void add(Node n){
        this.getChildren().add(n);
    }

    public void add(Node... n){
        this.getChildren().addAll(n);
    }
}
