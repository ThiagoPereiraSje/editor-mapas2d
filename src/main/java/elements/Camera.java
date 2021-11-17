/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elements;

//import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author thiago
 */
public class Camera {
    public static final int width = 32*33;
    public static final int height = 32*18;
    public static int x = 0;
    public static int y = 0;
    
    public static void tick() {
        if (Cursor.x >= (x+width)) {
            x += Tile.size;
        } else if (Cursor.x <= (x - Tile.size)) {
            x -= Tile.size;
        }
        
        if (Cursor.y >= (y+height)) {
            y += Tile.size;
        } else if (Cursor.y <= (y - Tile.size)) {
            y -= Tile.size;
        }
    }
    
    public static void render(Graphics g) {        
        //g.setColor(Color.CYAN);
        //g.drawRect(x - Camera.x, y - Camera.y, width, height);
    }
}
