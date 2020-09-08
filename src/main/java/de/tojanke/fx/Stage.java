package de.tojanke.fx;

import javafx.scene.Parent;

public class Stage extends javafx.stage.Stage {

    public Stage(){
        this.setFullScreen(true);
    }

    public Stage(javafx.stage.Stage s){
        super(s.getStyle());
        this.setFullScreen(true);
    }

    public void set(Parent p){
        this.getScene().setRoot(p);
        this.setFullScreen(true);
    }
}

