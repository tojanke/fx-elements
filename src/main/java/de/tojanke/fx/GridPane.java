package de.tojanke.fx;

import javafx.geometry.Pos;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class GridPane extends javafx.scene.layout.GridPane {
    public GridPane(boolean border) {
        this.setHgap(GuiConfig.hSpacing);
        this.setVgap(4 * GuiConfig.scale);
        this.setAlignment(Pos.CENTER);
        if (border) {
            this.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        }
    }

    public GridPane() {
        this(false);
    }
}
