package de.tojanke.fx.elements;


public class TextField extends javafx.scene.control.TextField {
    public TextField(double width){
        this.setStyle(GuiConfig.bStyle);
        this.setMinWidth(width * GuiConfig.defaultWidth * GuiConfig.scale);
        this.setMaxWidth(width * GuiConfig.defaultWidth * GuiConfig.scale);
    }

    public TextField(){
        this(1);
    }

    public int getInt(){
        try{
            int nr = Integer.parseInt(this.getText());
            return Math.abs(nr);
        }
        catch(NumberFormatException nx){
            return -1;
        }
    }

    public double getDouble(){
        try{
            double nr = new Double(this.getText());
            return Math.abs(nr);
        }
        catch(Exception ex){
            if(this.getText().contains(",")){
                this.setText(this.getText().replace(',', '.'));
                return getDouble();
            }
            else {
                return .1d;
            }
        }
    }
}
