import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

public class SimpleGuil implements ActionListener {
    JFrame frame;



    public static void main(String[] args) {
        SimpleGuil gui = new SimpleGuil();
        gui.go();
    }

    public void go(){
    frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JButton button = new JButton("Press to change Smile colors");
    button.addActionListener(this);

    MyDrawPanel drawPanel = new MyDrawPanel();

            frame.getContentPane().add(BorderLayout.SOUTH,button);
            frame.getContentPane().add(BorderLayout.CENTER,drawPanel);
            frame.setSize(700,700);
            frame.setVisible(true);

    }
    public void actionPerformed(ActionEvent event){
       frame.repaint();
    }

}



