import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by java on 27.12.2016.
 */
public class Main {

 static int counter=0;

    public static void main(String[]args) throws InterruptedException {

        MyFrame frame = new MyFrame();
        frame.setSize(500,500);
        frame.setTitle("This is my title");
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BorderLayout layout = new BorderLayout();

        LabelPanel labelPanel = new LabelPanel();
        Menu menu = new Menu();

//        layout.addLayoutComponent(labelPanel, BorderLayout.CENTER);
        layout.addLayoutComponent(menu ,BorderLayout.PAGE_START);
        //frame.add(new LabelPanel());

        frame.add(menu);
        frame.add(labelPanel);

        frame.setLayout(layout);
        //frame.add(menu);

        JLabel label = new JLabel();
        label.setText("0");
        layout.addLayoutComponent(label,BorderLayout.LINE_START);
        frame.add(label);


        JButton button=new JButton("Click me");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               label.setText((++counter) +"");
            }
        });
        JPanel btnPamel = new JPanel();
        btnPamel.setPreferredSize(new Dimension(30,15));
        btnPamel.add(button);


        layout.addLayoutComponent(btnPamel,BorderLayout.CENTER);


        frame.add(btnPamel);


        frame.setVisible(true);


//        Thread.sleep(2000);
//
//        frame.setState(Frame.ICONIFIED);
//
//        Thread.sleep(2000);
//
//        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
//
//        Thread.sleep(2000);
//
//        frame.setExtendedState(Frame.NORMAL);
    }
}
