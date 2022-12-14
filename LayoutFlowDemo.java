/*
    FlowLayout：流式布局管理器
    将组件按照从上到下、从左到右的放置规律逐行定位
 */

import javax.swing.*;
import java.awt.*;

public class LayoutFlowDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java 第四个 GUI程序");

        JPanel panel = new JPanel();
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.setLayout(new FlowLayout(FlowLayout.LEADING,5,20));
        panel.setBackground(Color.gray);

        frame.add(panel);
        frame.setBounds(300,200,300,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
