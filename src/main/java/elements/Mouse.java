/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elements;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author thiago
 */
public class Mouse extends MouseAdapter {
    public static int x,y;
    public static boolean pressed=false; 
    public static boolean rightButton=false;
    public static boolean leftButton=false;
    
    @Override
    public void mouseClicked(MouseEvent e) {
        x = e.getX();
	y = e.getY();
	leftButton = e.getButton() == MouseEvent.BUTTON1;
	rightButton = e.getButton() == MouseEvent.BUTTON3;
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
        pressed = true;
    }
    
    @Override
    public void mouseReleased(MouseEvent e) {
        pressed = false;
    }
}
