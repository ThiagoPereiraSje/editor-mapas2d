/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elements;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author thiago
 */
public class Keyboard extends KeyAdapter {
    public static boolean up = false;
    public static boolean down = false;
    public static boolean left = false;
    public static boolean right = false;
    public static boolean attack = false;
    public static boolean menu = false;
    
    private void toggleKey(int keyCode) {
    	up = (KeyEvent.VK_UP == keyCode);
    	down = (KeyEvent.VK_DOWN == keyCode);
    	left = (KeyEvent.VK_LEFT == keyCode);
    	right = (KeyEvent.VK_RIGHT == keyCode);
    	attack = (KeyEvent.VK_X == keyCode);
    	menu = (KeyEvent.VK_ESCAPE == keyCode);
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        toggleKey(e.getKeyCode());
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        toggleKey(-1);
    }
}
