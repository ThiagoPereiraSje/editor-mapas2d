/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiles;

import elements.Camera;
import elements.Tile;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author thiago
 */
public class Grid extends Tile {

    public Grid(int x, int y) {
        super(x, y);
    }    
    
    @Override
    public void render(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(x - Camera.x, y - Camera.y, size, size);
        
        g.setColor(Color.GRAY);
        g.drawRect(x - Camera.x, y - Camera.y, size, size);
    }
}
