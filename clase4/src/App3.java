import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Container;

public class App3 extends JFrame implements MouseListener{

    Container contenedor;
    int x1,x2,y1,y2;
    boolean flagPrimerClick = true;

    public App3(){
        contenedor = getContentPane();
        addMouseListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setSize(getContentPane().getMaximumSize());
        setSize(600,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        App3 app3 = new App3();
    }

    @Override 
    public void paint(Graphics g){
        
        if(x2!=0 && y2!=0){
            if(y2>y1&&x2>x1){
                g.setColor(Color.GREEN);
                g.fillRect(x1, y1, x2-x1, y2-y1);
            }
            else if(y1>y2&&x2>x1){
                g.setColor(Color.RED);
                g.fillRect(x1, y2, x2-x1, y1-y2);
            }
            else if(y2>y1&&x1>x2){
                g.setColor(Color.YELLOW);
                g.fillRect(x2, y1, x1-x2, y2-y1);
            }else if(y1>y2&&x1>x2){
                g.setColor(Color.BLUE);
                g.fillRect(x2, y2, x1-x2, y1-y2);
            }
            
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