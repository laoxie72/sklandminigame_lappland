import javax.swing.*;
import java.awt.*;

public class CounterPanel extends JPanel {
    private JLabel countLabel;
    private int blackCount = 0;

    public CounterPanel() {
        countLabel = new JLabel("黑色格子数量: 0");
        //countLabel.setPreferredSize(new Dimension(300, 30)); // 宽度300px，高度30px

        // 设置字体大小为16px
        countLabel.setFont(new Font(countLabel.getFont().getName(), Font.PLAIN, 24));
        add(countLabel);
    }

    public void increment() {
        blackCount++;
        updateLabel();
    }

    public void decrement() {
        blackCount--;
        updateLabel();
    }

    public void reset() {
        blackCount = 0;
        updateLabel();
    }

    private void updateLabel() {
        countLabel.setText("灰色格子数量: " + blackCount);
    }
}
