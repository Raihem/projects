import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {
    public void paintComponent(Graphics g) {

        g.fillRect(0,0,this.getWidth(),this.getHeight());


        int red = (int) (Math.random() *255);
        int green = (int) (Math.random() *255);
        int blue = (int) (Math.random() *255);
        int red1 = (int) (Math.random() *255);
        int green1 = (int) (Math.random() *255);
        int blue1 = (int) (Math.random() *255);
        int red2 = (int) (Math.random() *255);
        int green2 = (int) (Math.random() *255);
        int blue2 = (int) (Math.random() *255);

        Color randomColor = new Color(red,green,blue);
            g.setColor(randomColor);
            g.fillOval(100,70,500,500);



        Color random2Color = new Color(red2,green2,blue2);
        g.setColor(random2Color);

        g.fillOval(140, 190, 152, 152);

        g.fillOval(405, 190, 152, 152);

        Color random1Color = new Color(red1,green1,blue1);
        g.setColor(random1Color);
        g.fillOval(220, 370, 215, 155);

        Color rando2Color = new Color(red1,green1,blue1);
        g.setColor(randomColor);
        g.fillOval(217,305,250,205);

        }
    }


