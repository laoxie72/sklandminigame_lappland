import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class    ControlPanel extends JPanel {
    public ControlPanel(GridPanel gridPanel, CounterPanel counterPanel) {
        setLayout(new BorderLayout());

        JButton clearButton = new JButton("清空");
        clearButton.setPreferredSize(new Dimension(500, 100));
        add(clearButton, BorderLayout.NORTH);
        counterPanel.setPreferredSize(new Dimension(500,100));
        add(counterPanel, BorderLayout.SOUTH);

        // 设置清空按钮事件监听器
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gridPanel.clearGrid();
            }
        });

        gridPanel.setCounterPanel(counterPanel);  // 将计数面板关联到网格面板
    }
}
