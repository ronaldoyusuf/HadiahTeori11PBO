import java.awt.*;
  public class HadiahTeori11 extends Panel{
 HadiahTeori11(){
}
public void paint (Graphics g) {
g.drawLine(350,400,550,400);
g.drawLine(450,350,450,500);
g.drawLine(450,500,350,550);
g.drawLine(450,500,550,550);
g.setColor(Color.YELLOW);
g.fillArc(400,270,100,100,0,360);
g.setColor(Color.RED);
g.fillArc(420,300,20,20,0,360);
g.fillArc(460,300,20,20,0,360);
g.setColor(Color.GREEN);
g.drawArc(420,330,60,20,0,-180);
g.drawArc(420,331,60,20,0,-180);
g.drawArc(420,332,60,20,0,-180);
g.setColor(Color.BLUE);
g.drawLine(450,270,490,250);
g.drawLine(450,270,480,250);
g.drawLine(450,270,455,250);


      }
public static void main(String[] args) {
Frame f = new Frame ("Testing Graphics Panel");
HadiahTeori11 gp = new HadiahTeori11();
  f.add (gp);
   f.setSize (900, 900); 
   f. setVisible(true);
   }
   }