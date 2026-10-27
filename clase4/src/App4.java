import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.awt.Container;

public class App4 extends JFrame implements MouseListener, KeyListener{

    Container contenedor;
    int x1,x2,y1,y2;
    boolean flagPrimerClick = true;

    public App4(){
        contenedor = getContentPane();
        addMouseListener(this);
        addKeyListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setSize(getContentPane().getMaximumSize());
        setSize(600,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        App4 app4 = new App4();
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
        System.out.println("ENTRA");
    }
     
    @Override 
    public void mousePressed(MouseEvent e){
        System.out.println(e.getX() + "," + e.getY());
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

    public void keyTyped(KeyEvent e){
    }

    public void keyPressed(KeyEvent e){
        JOptionPane.showMessageDialog(null,e.getKeyChar());
        if(e.getKeyChar()=='a'){
            System.out.println("voy a pintar tal cosa");
        }
    }

    public void keyReleased(KeyEvent e){

    }

}