/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elements;

import java.awt.Graphics;

/**
 *
 * @author thiago
 */
public class World {    
    public static void tick() {
    }
    
    public static void render(Graphics g) {
        tileRender(g);
        
        for (int i = 0; i < Map.entities.size(); i++) {
            Map.entities.get(i).render(g);
        }
    }
    
    private static void tileRender(Graphics g) {		
        int sx = Camera.x >> 5;
        int sy = Camera.y >> 5;
        int fx = sx + (Canvas.width >> 5);
        int fy = sy + (Canvas.height >> 5);

        for (int x = sx; x <= fx; x++) {
            for (int y = sy; y <= fy; y++) {
                if (x < 0 || x >= Map.width || y < 0 || y >= Map.height)
                    continue;

                int index = x +(y*Map.width);
                Tile tile = Map.tiles[index];
                tile.render(g);
            }
        }
    }
}
