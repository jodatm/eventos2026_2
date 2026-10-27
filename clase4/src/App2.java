import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Container;

public class App2 extends JFrame implements MouseListener{

    Container contenedor;
    int x1,x2,y1,y2;
    boolean flagPrimerClick = true;

    public App2(){
        contenedor = getContentPane();
        addMouseListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setSize(getContentPane().getMaximumSize());
        setSize(600,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        App2 app2 = new App2();
    }

    @Override 
    public void paint(Graphics g){
        g.drawLine(100,10,150,100);
        g.setColor(Color.RED);
        g.drawLine(400, 250, 600, 350);
        g.drawRect(250,250,75,50);
        g.fillRect(300,500,100,100);
        g.setColor(Color.BLUE);
        g.drawOval(50,50, 100,400);
        g.fillOval(150,150, 100,400);

        if(x2!=0 && y2!=0){
            g.setColor(Color.GREEN);
            g.drawLine(x1, y1, x2, y2);
        }
    }   

    @Override 
    public void mouseClicked(MouseEvent e){
        if(flagPrimerClick){
            x1 = e.getX();
            y1 = e.getY();
            x2=0;
            y2=0;
            flagPrimerClick=!flagPrimerClick;
        }else{
            x2 = e.getX();
            y2 = e.getY();
            repaint();
            flagPrimerClick=!flagPrimerClick;
        }
        
    }
     
    @Override 
    public void mousePressed(MouseEvent e){

    }

    @Override 
    public void mouseReleased(MouseEvent e){

    }

    @Override 
    public void mouseEntered(MouseEvent e){
        //contenedor.setBackground(Color.YELLOW);
    }

    @Override 
    public void mouseExited(MouseEvent e){
        //contenedor.setBackground(Color.GREEN);
    }

}