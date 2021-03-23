import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;


public class Main extends Frame{
  
  public static void main(String args[]) {
    new Main();
  }

  public Main(){
    super("Japan Flag");
    
    setSize(400, 300);
    setVisible(true);

  }


public void paint(Graphics g){
    
    g.setColor(Color.white);
    g.fillRect(50, 50, 300, 200);
    
    Graphics2D g2 = (Graphics2D) g;
    g2.setColor(Color.red);
    g2.fillOval(115, 75, 150, 150);

  }
  
  
  

}
