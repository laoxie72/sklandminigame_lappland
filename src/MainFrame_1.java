import javax.swing.*;
import java.awt.*;

public class MainFrame_1 extends JFrame {
    public MainFrame_1() {
        setTitle("5x5 白色格子区域");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 700);

        // 创建组件
        GridPanel gridPanel = new GridPanel();
        CounterPanel counterPanel = new CounterPanel();
        ControlPanel controlPanel = new ControlPanel(gridPanel, counterPanel);

        // 设置布局
        setLayout(new BorderLayout());
        add(gridPanel, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);

        setVisible(true);
    }
}
