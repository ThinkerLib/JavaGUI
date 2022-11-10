import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
public class JFrameDemo {
    public JFrameDemo() {
        JFrame frame = new JFrame();
        frame.setTitle("Java 第一个 GUI 程序");    //设置显示窗口标题
        frame.setSize(400, 300);    //设置窗口的大小
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //设置窗口是否可以关闭

        JLabel label = new JLabel("这是使用JFrame类创建的窗口");  //创建一个标签
        Container container = frame.getContentPane();              //获取当前窗口的内容窗格
        container.add(label);      //将标签组件添加到内容窗格上
        frame.setVisible(true);    //设置窗口是否可见
    }

    public static void main(String[] agrs) {
        new JFrameDemo();          //创建一个实例化对象
    }
}