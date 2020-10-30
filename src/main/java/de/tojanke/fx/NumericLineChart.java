package de.tojanke.fx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.NumberAxis;

public class NumericLineChart extends javafx.scene.chart.LineChart<Number, Number> {

    ObservableList<Data<Number, Number>> xyList;
    private double range, tick;

    public void add(Number x, Number y){
        xyList.add(new Data(x,y));
        trim();
    }

    private void trim(){
        if(xyList.size()>0){
            double ub = xyList.get(xyList.size()-1).getXValue().doubleValue();
            ub += tick - (ub%tick);
            double lb = ub-range;

            if(lb<0){
                ub -=lb;
                lb = 0;
            }
            ((NumberAxis)getXAxis()).setLowerBound(lb);
            ((NumberAxis)getXAxis()).setUpperBound(ub);
            int lastBelow = 0;
            while(xyList.get(lastBelow).getXValue().doubleValue()<lb){
                lastBelow++;
            }
            xyList.remove(0, lastBelow-1);
        }

    }

    public void clear(){
        xyList.clear();
    }

    public NumericLineChart(String title, String lblX, String lblY, double aRange, double aTick){
        super(new NumberAxis(0, aRange, aTick), new NumberAxis());
        range = aRange;
        tick = aTick;
        range += tick - (range% tick);
        getXAxis().setLabel(lblX);
        getXAxis().setAutoRanging(false);

        setTitle(title);
        setAnimated(false);
        xyList = FXCollections.observableArrayList();
        Series<Number, Number> xySeries = new Series<Number, Number>(xyList);
        xySeries.setName(lblY);
        getData().add(xySeries);
        setCreateSymbols(false);
    }


}

