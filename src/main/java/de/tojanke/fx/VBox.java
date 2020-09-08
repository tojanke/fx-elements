package de.tojanke.fx;

import javafx.geometry.Pos;
import javafx.scene.Node;

public class VBox extends javafx.scene.layout.VBox {

    public VBox(int spacing, Node... n){
        this.setAlignment(Pos.CENTER);
        this.setSpacing(spacing* GuiConfig.scale);
        add(n);
    }

    public VBox(Node... n){
        this(3,n);
    }

    public void add(Node n){
        this.getChildren().add(n);
    }

    public void add(Node... n){
        this.getChildren().addAll(n);
    }
}
