/*
    GridLayout：网格布局管理器
    将区域分割成行数和列数的网格状布局
    组件按照由左至右、由上而下的次序填充到各个单元格中
    忽略组件的最佳大小，而是根据提供的行和列进行平分
 */

import javax.swing.*;
import java.awt.*;

public class LayoutGridDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout布局管理器");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,4,5,5));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        panel.add(new JButton("/"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("*"));
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("-"));
        panel.add(new JButton("0"));
        panel.add(new JButton("."));
        panel.add(new JButton("="));
        panel.add(new JButton("+"));

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300,200,200,150);
        frame.setVisible(true);
    }
}
