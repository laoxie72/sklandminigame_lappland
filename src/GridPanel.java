import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GridPanel extends JPanel {
    private JPanel[][] panels = new JPanel[5][5];
    private CounterPanel counterPanel;  // 用于更新计数器

    public GridPanel() {
        setLayout(new GridLayout(5, 5));
        initializeGrid();
    }

    public void setCounterPanel(CounterPanel counterPanel) {
        this.counterPanel = counterPanel;
    }

    private void initializeGrid() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                JPanel panel = new JPanel();
                panel.setBackground(Color.WHITE);
                panel.setBorder(new LineBorder(Color.BLACK, 1));
                add(panel);
                panels[i][j] = panel;

                panel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        togglePanelColor(panel);
                    }
                });
            }
        }
    }

    private void togglePanelColor(JPanel panel) {
        if (panel.getBackground() == Color.WHITE) {
            panel.setBackground(Color.BLACK);
            counterPanel.increment();
        } else {
            panel.setBackground(Color.WHITE);
            counterPanel.decrement();
        }
    }

    public void clearGrid() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                panels[i][j].setBackground(Color.WHITE);
            }
        }
        counterPanel.reset();
    }
}
