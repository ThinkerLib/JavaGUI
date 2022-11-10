/*
    CradLayout：卡片布局管理器
    帮助用户实现多个成员共享同一个显示空间，并且一次只显示一个容器组件的内容
 */

import javax.swing.*;
import java.awt.*;

public class LayoutCardDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java 第五个 GUI程序");

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        panel1.add(new JButton("登录按钮"));
        panel1.add(new JButton("注册按钮"));
        panel1.add(new JButton("找回密码按钮"));
        panel2.add(new JTextField("用户名文本框"));
        panel2.add(new JTextField("密码文本框"));
        panel2.add(new JTextField("验证码文本框"));

        JPanel cards = new JPanel(new CardLayout());
        cards.add(panel1, "card1");
        cards.add(panel2, "card2");
        CardLayout cardLayout = (CardLayout) (cards.getLayout());
        cardLayout.show(cards, "card1");

        frame.add(cards);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300,200,400,200);
        frame.setVisible(true);
    }
}
