package testFrame;

/**
 * Created by Дмитрий on 06.05.2017.
 */import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

@SuppressWarnings({"serial", "rawtypes", "unchecked"})
public class SimpleTextPad extends JFrame implements ItemListener {

    private JComboBox fontFace;
    private JComboBox fontSize;
    private JCheckBox fontBold;
    private JCheckBox fontItalic;
    private JTextArea textArea;
    private JButton colorButton;
    private Color color = Color.BLACK;

    public SimpleTextPad() {
        JPanel fontPanel = new JPanel();

        fontFace = new JComboBox(new String[] { "Monospaced", "Dialog", "Serif" });
        fontSize = new JComboBox(new String[] { "8", "10", "12", "14" });
        fontBold = new JCheckBox("Bold");
        fontItalic = new JCheckBox("Italic");

        colorButton = new JButton("Color");
        colorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                color = JColorChooser.showDialog(SimpleTextPad.this, "Choose font color", color);
                textArea.setForeground(color);
            }
        });

        JLabel faceLabel = new JLabel("Font face: ");
        JLabel sizeLabel = new JLabel("Font size: ");

        fontFace.addItemListener(this);
        fontSize.addItemListener(this);
        fontBold.addItemListener(this);
        fontItalic.addItemListener(this);

        fontPanel.add(faceLabel);
        fontPanel.add(fontFace);
        fontPanel.add(sizeLabel);
        fontPanel.add(fontSize);
        fontPanel.add(fontBold);
        fontPanel.add(fontItalic);
        fontPanel.add(colorButton);

        textArea = new JTextArea();

        add(fontPanel, BorderLayout.NORTH);
        add(textArea, BorderLayout.CENTER);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String face = (String) fontFace.getSelectedItem();
        int size = Integer.valueOf((String) fontSize.getSelectedItem());
        int style = (fontBold.isSelected() ? Font.BOLD : 0) + (fontItalic.isSelected() ? Font.ITALIC : 0);
        textArea.setFont(new Font(face, style, size));
        textArea.repaint();
    }

    public static void main(String[] args) {
        JFrame f = new SimpleTextPad();
        f.setPreferredSize(new Dimension(600, 400));
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

}
