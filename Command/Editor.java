package main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class Editor{
    public JTextArea textField;
    public JScrollPane scrollPane_1;
    public String clipboard;
    public JButton ctrlC;
    public JButton ctrlX;
    public JButton ctrlV;
    public JButton ZW;
    public JButton ZS;
    public JButton ctrlZ;
    public MultiKeyPressListener keys;



    public void init() {

        JFrame frame = new JFrame("Text this");
        frame.setFocusable(true);

        JPanel content = new JPanel();
        frame.setContentPane(content);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        scrollPane_1 = new JScrollPane();
        textField = new JTextArea();
        textField.setLineWrap(true);
        textField.setEditable(false);
        scrollPane_1.setViewportView(textField);
        content.add(scrollPane_1);
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        ctrlC = new JButton("Ctrl+C");
        ctrlX = new JButton("Ctrl+X");
        ctrlV = new JButton("Ctrl+V");
        ctrlZ = new JButton("Ctrl+Z");
        ZW = new JButton("ZW");
        ZS = new JButton("ZS");

        Editor editor = this;
        ctrlC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand(new CopyCommand(editor));
            }
        });
        ctrlX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand(new CutCommand(editor));
            }
        });
        ctrlV.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand(new PasteCommand(editor));
            }
        });
        ZW.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand(new FontUpCommand(editor));
            }
        });
        ZS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand(new FontDownCommand(editor));
            }
        });
        ctrlZ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand(new UndoCommand(editor));
            }
        });

        ctrlC.setFocusable(false);
        ctrlX.setFocusable(false);
        ctrlV.setFocusable(false);
        ctrlZ.setFocusable(false);
        ZW.setFocusable(false);
        ZS.setFocusable(false);

        buttons.add(ctrlC);
        buttons.add(ctrlX);
        buttons.add(ctrlV);
        buttons.add(ctrlZ);
        buttons.add(ZW);
        buttons.add(ZS);

        content.add(buttons);
        keys = new MultiKeyPressListener(this);
        frame.addKeyListener(keys);
        frame.setSize(600, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        this.textField.append("Possible commands:\n"
                + "ctrl + c\n"
                + "ctrl + v\n"
                + "ctrl + x\n"
                + "ctrl + z\n"
                + "z + w\n"
                + "z + s\n"
                + "Macros:\n"
                + "ctrl + a + w: copy and paste 5 times\n"
                + "ctrl + w: increase font size 5 times\n"
                + "ctrl + s: decrease font size 5 times\n");
    }



    protected void executeCommand(Command command) {
        command.execute();
    }

}
