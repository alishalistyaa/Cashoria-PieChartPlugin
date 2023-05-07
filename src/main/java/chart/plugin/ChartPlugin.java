package chart.plugin;

import chart.plugin.ChartPluginInterface;
import controller.MainController;
import controller.fixedbill.FixedBillAdapterXML;
import model.FixedBill;
import model.Member;
import model.VIP;
import org.knowm.xchart.XChartPanel;
import util.PieChartPlugin;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ChartPlugin implements ChartPluginInterface {
    @Override
    public JPanel loadPanel(MainController mainController) {
        List<FixedBill> temp = mainController.getFixedBillDataIO().getAll();
        return new XChartPanel<>(new PieChartPlugin(temp).getChart());
    }
}