/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elements;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author thiago
 */
public class Cursor {
    public static int size = 32;
    public static int x=0,y=0;
    
    public static void move(int xx, int yy) {
        if ((yy >= 0) && (yy <= (Map.h_vts - size))) {
            y = yy;
        }
        
        if ((xx >= 0)&&(xx <= (Map.w_vts - size))){
            x = xx;
        }
    }
    
    public static void tick() {
        if (Keyboard.up) {
            move(x, y-size);
        } else if (Keyboard.down) {
            move(x, y+size);
        }
        
        if (Keyboard.left) {
            move(x-size, y);
        } else if (Keyboard.right) {
            move(x+size, y);
        }
    }
    
    public static void render(Graphics g) {
        g.setColor(Color.RED);
        g.drawRect(x -Camera.x, y -Camera.y, size, size);
    }
}
