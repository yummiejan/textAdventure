package View;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by janpa on 12.09.2016.
 */
public class GUI extends JFrame {
    private JPanel panel;
    private JEditorPane editorPane1;
    private JButton dialogue1;
    private JButton dialogue3Button;
    private JButton dialogue4Button;
    private JButton dialogue1Button;
    private JButton dialogue2Button;
    public String text;
    private Timer timer;


    public GUI() {
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        this.setResizable(false);
        this.setTitle("Text Adventure");

        dialogue1Button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                textAusgeben("Test1");
            }
        });

        dialogue2Button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                textAusgeben("Test2");
            }
        });

        dialogue3Button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                textAusgeben("Test3");
            }
        });

        dialogue4Button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                textAusgeben("Test4");
            }
        });
    }


    //Gibt den gegebenen Text nacheinander(wie in Pokemon aus)

    private void textAusgeben(String text)
    {
        char c = text.toCharArray()[0];
        ActionListener taskPerformer = new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                //TODO Text nacheinander in EditorPane ausgeben
                String tmpText = editorPane1.getText() + c;

                editorPane1.setText(tmpText);
            }
        };
        new Timer(200, taskPerformer).start();

    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panel = new JPanel();
        panel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(5, 1, new Insets(10, 10, 10, 10), -1, -1));
        panel.setFont(new Font("Comic Sans MS", Font.BOLD, panel.getFont().getSize()));
        panel.setMaximumSize(new Dimension(600, 400));
        panel.setMinimumSize(new Dimension(600, 400));
        panel.setOpaque(true);
        panel.setPreferredSize(new Dimension(600, 400));
        panel.setVisible(true);
        panel.setBorder(BorderFactory.createTitledBorder(null, "", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font(panel.getFont().getName(), panel.getFont().getStyle(), panel.getFont().getSize()), new Color(-4473925)));
        editorPane1 = new JEditorPane();
        editorPane1.setEditable(false);
        panel.add(editorPane1, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        dialogue1Button = new JButton();
        dialogue1Button.setText(" ");
        panel.add(dialogue1Button, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        dialogue2Button = new JButton();
        dialogue2Button.setText(" ");
        panel.add(dialogue2Button, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        dialogue3Button = new JButton();
        dialogue3Button.setText(" ");
        panel.add(dialogue3Button, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        dialogue4Button = new JButton();
        dialogue4Button.setOpaque(true);
        dialogue4Button.setText(" ");
        panel.add(dialogue4Button, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel;
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */

}
