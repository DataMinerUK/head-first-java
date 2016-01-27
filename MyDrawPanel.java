import java.awt.*;
import javax.swing.*;

class MyDrawPanel extends JPanel {

  public void paintComponent(Graphics g) {
    Graphics2D g2d = (Graphics2D) g;

    int red = (int) (Math.random() * 256);
    int green = (int) (Math.random() * 256);
    int blue = (int) (Math.random() * 256);
    Color startColor = new Color(red, green, blue);

    red = (int) (Math.random() * 256);
    green = (int) (Math.random() * 256);
    blue = (int) (Math.random() * 256);
    Color endColor = new Color(red, green, blue);

    GradientPaint gradient = new GradientPaint(70,70,startColor,150,150,endColor);
    g2d.setPaint(gradient);
    g2d.fillOval(70,70,100,100);
  }

  public static void main(String[] args) {

    JFrame frame = new JFrame();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300,300);
    frame.getContentPane().add(new MyDrawPanel());
    frame.setVisible(true);
  }

}
