/*
    GridBagLayout：网络包布局管理器
    最灵活、最复杂的布局管理器
    不需要组件的尺寸一致，允许组件扩展到多行多列
 */

import javax.swing.*;
import java.awt.*;

public class LayoutGridBagDemo {
    //添加按钮
    public static void makeButton(String title, JFrame frame, GridBagLayout gridBagLayout, GridBagConstraints constraints){
        JButton button=new JButton(title);    //创建Button对象
        gridBagLayout.setConstraints(button,constraints);
        frame.add(button);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("拨号盘");
        GridBagLayout gridBagLayout = new GridBagLayout();
        frame.setLayout(gridBagLayout);

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 0.0;
        constraints.gridwidth = GridBagConstraints.REMAINDER;

        JTextField textField = new JTextField("123456789");
        gridBagLayout.setConstraints(textField, constraints);
        frame.add(textField);
        constraints.weightx = 0.5;
        constraints.weighty = 0.2;
        constraints.gridwidth = 1;

        makeButton("7",frame,gridBagLayout,constraints);      //调用方法，添加按钮组件
        makeButton("8",frame,gridBagLayout,constraints);
        constraints.gridwidth = GridBagConstraints.REMAINDER;      //结束行
        makeButton("9",frame,gridBagLayout,constraints);
        constraints.gridwidth = 1;                                 //重新设置gridwidth的值

        makeButton("4",frame,gridBagLayout,constraints);
        makeButton("5",frame,gridBagLayout,constraints);
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        makeButton("6",frame,gridBagLayout,constraints);
        constraints.gridwidth = 1;

        makeButton("1",frame,gridBagLayout,constraints);
        makeButton("2",frame,gridBagLayout,constraints);
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        makeButton("3",frame,gridBagLayout,constraints);
        constraints.gridwidth = 1;

        makeButton("返回",frame,gridBagLayout,constraints);
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        makeButton("拨号",frame,gridBagLayout,constraints);
        constraints.gridwidth = 1;

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400,400,400,400);
        frame.setVisible(true);
    }
}
