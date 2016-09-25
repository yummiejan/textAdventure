package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.*;

/**
 * Created by 204g01 on 19.09.2016.
 */
public class AuswahlGUI extends JFrame
{
    //GUI zum auswählen welche GUI benutz wird
    private JLabel topLabel;
    private JButton konsolenButton;
    private JButton guiButton;
    private JPanel panel;
    //Variable um abzufragen welcher Knopf gedrückt wurde
    private int auswahl;

    public AuswahlGUI()
    {
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        this.setSize(600, 400);
        this.setResizable(false);

        konsolenButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                auswahl = 1;
                dispose();

            }

        });
        guiButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                auswahl = 2;
                dispose();
            }
        });
    }
    //Get Methode für auswahl variable
    public int getAuswahl()
    {
        return auswahl;
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
    private void $$$setupUI$$$()
    {
        panel = new JPanel();
        panel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));
        topLabel = new JLabel();
        topLabel.setHorizontalAlignment(0);
        topLabel.setHorizontalTextPosition(0);
        topLabel.setText("Möchten Sie das Spiel über die Konsole oder über ein seperates Fenster spielen?");
        panel.add(topLabel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        konsolenButton = new JButton();
        konsolenButton.setText("Konsole");
        konsolenButton.setToolTipText("Spiele über die Konsole die sich im unteren Rand des Bildschirms befindet.");
        panel.add(konsolenButton, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        guiButton = new JButton();
        guiButton.setText("Fenster");
        guiButton.setToolTipText("Spiele über ein eigenes Fenster auf deinem Bildschirm.");
        panel.add(guiButton, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$()
    {
        return panel;
    }
}
