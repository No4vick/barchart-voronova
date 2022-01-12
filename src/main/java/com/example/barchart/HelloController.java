package com.example.barchart;

import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;

public class HelloController {
    @FXML
    public BarChart<String, Number> barChartTotalRemove;
    public BarChart<String, Number> barChartTotalAdd;
    public BarChart<String, Number> barChartAvgRemove;
    public BarChart<String, Number> barChartAvgAdd;

    public void initialize(){
        XYChart.Series<String, Number> arrayListSeriesAdds = new XYChart.Series<>();
        arrayListSeriesAdds.setName("ArrayList");
        arrayListSeriesAdds.getData().add(new XYChart.Data<>("10 Items", 240));
        arrayListSeriesAdds.getData().add(new XYChart.Data<>("100 Items", 225));
        arrayListSeriesAdds.getData().add(new XYChart.Data<>("10000 Items", 243.67));
        arrayListSeriesAdds.getData().add(new XYChart.Data<>("100000 Items", 119.269));

        XYChart.Series<String, Number> arrayListSeriesRemoves = new XYChart.Series<>();
        arrayListSeriesRemoves.setName("ArrayList");
        arrayListSeriesRemoves.getData().add(new XYChart.Data<>("10 Items", 4800));
        arrayListSeriesRemoves.getData().add(new XYChart.Data<>("100 Items", 1710));
        arrayListSeriesRemoves.getData().add(new XYChart.Data<>("10000 Items", 1629.45));
        arrayListSeriesRemoves.getData().add(new XYChart.Data<>("100000 Items", 5330.16));

        XYChart.Series<String, Number> arrayListSeriesAddsTotal = new XYChart.Series<>();
        arrayListSeriesAddsTotal.setName("ArrayList");
        arrayListSeriesAddsTotal.getData().add(new XYChart.Data<>("10 Items", 2400));
        arrayListSeriesAddsTotal.getData().add(new XYChart.Data<>("100 Items", 22500));
        arrayListSeriesAddsTotal.getData().add(new XYChart.Data<>("10000 Items", 4873400));
        arrayListSeriesAddsTotal.getData().add(new XYChart.Data<>("100000 Items", 1.19269E7));

        XYChart.Series<String, Number> arrayListSeriesRemovesTotal = new XYChart.Series<>();
        arrayListSeriesRemovesTotal.setName("ArrayList");
        arrayListSeriesRemovesTotal.getData().add(new XYChart.Data<>("10 Items", 4800));
        arrayListSeriesRemovesTotal.getData().add(new XYChart.Data<>("100 Items", 17100));
        arrayListSeriesRemovesTotal.getData().add(new XYChart.Data<>("10000 Items", 3258900));
        arrayListSeriesRemovesTotal.getData().add(new XYChart.Data<>("100000 Items", 5.33016E7));

        /*
        *                                  LINKED LIST
        */

        XYChart.Series<String, Number> linkedListSeriesAdds = new XYChart.Series<>();
        linkedListSeriesAdds.setName("LinkedList");
        linkedListSeriesAdds.getData().add(new XYChart.Data<>("10 Items", 190.0));
        linkedListSeriesAdds.getData().add(new XYChart.Data<>("100 Items", 239.0));
        linkedListSeriesAdds.getData().add(new XYChart.Data<>("10000 Items", 242.825));
        linkedListSeriesAdds.getData().add(new XYChart.Data<>("100000 Items", 87.809));

        XYChart.Series<String, Number> linkedListSeriesRemoves = new XYChart.Series<>();
        linkedListSeriesRemoves.setName("LinkedList");
        linkedListSeriesRemoves.getData().add(new XYChart.Data<>("10 Items", 9300.0));
        linkedListSeriesRemoves.getData().add(new XYChart.Data<>("100 Items", 1500.0));
        linkedListSeriesRemoves.getData().add(new XYChart.Data<>("10000 Items", 4252.35));
        linkedListSeriesRemoves.getData().add(new XYChart.Data<>("100000 Items", 41056.88));

        XYChart.Series<String, Number> linkedListSeriesAddsTotal = new XYChart.Series<>();
        linkedListSeriesAddsTotal.setName("LinkedList");
        linkedListSeriesAddsTotal.getData().add(new XYChart.Data<>("10 Items", 1900.0));
        linkedListSeriesAddsTotal.getData().add(new XYChart.Data<>("100 Items", 23900.0));
        linkedListSeriesAddsTotal.getData().add(new XYChart.Data<>("10000 Items", 4856500.0));
        linkedListSeriesAddsTotal.getData().add(new XYChart.Data<>("100000 Items", 8780900.0));

        XYChart.Series<String, Number> linkedListSeriesRemovesTotal = new XYChart.Series<>();
        linkedListSeriesRemovesTotal.setName("LinkedList");
        linkedListSeriesRemovesTotal.getData().add(new XYChart.Data<>("10 Items", 9300.0));
        linkedListSeriesRemovesTotal.getData().add(new XYChart.Data<>("100 Items", 15000.0));
        linkedListSeriesRemovesTotal.getData().add(new XYChart.Data<>("10000 Items", 8504700.0));
        linkedListSeriesRemovesTotal.getData().add(new XYChart.Data<>("100000 Items", 4.105688E8 / 100));

        barChartAvgAdd.getData().add(arrayListSeriesAdds);
        barChartAvgAdd.getData().add(linkedListSeriesAdds);

        barChartAvgRemove.getData().add(arrayListSeriesRemoves);
        barChartAvgRemove.getData().add(linkedListSeriesRemoves);

        barChartTotalAdd.getData().add(arrayListSeriesAddsTotal);
        barChartTotalAdd.getData().add(linkedListSeriesAddsTotal);

        barChartTotalRemove.getData().add(arrayListSeriesRemoves);
        barChartTotalRemove.getData().add(linkedListSeriesRemovesTotal);
    }
}