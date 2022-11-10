import javax.swing.*;
import java.awt.*;
public class JPanelDemo
{
    public static void main(String[] agrs)
    {
        JFrame frame=new JFrame("Java第二个GUI程序");          //创建一个JFrame对象
        frame.setBounds(300, 100, 400, 200);   //设置窗口的大小和位置

        JPanel panel=new JPanel();                              //创建一个JPanel对象
        panel.setBackground(Color.green);                       //设置面板的背景色

        JLabel label=new JLabel("这是放在JPanel上的标签");    //创建一个标签
        Font font = new Font("仿宋", Font.PLAIN, 30);
        label.setFont(font);                                    //设置标签的字体
        label.setForeground(Color.blue);                        //设置标签的字体颜色
        label.setHorizontalAlignment(SwingConstants.LEFT);      //设置标签的字体对齐方式

        panel.add(label);    //将标签添加到面板
        frame.add(panel);    //将面板添加到窗口
        frame.setVisible(true);             //设置窗口可见
        frame.setLocationRelativeTo(null);  //设置窗口居中
    }
}
