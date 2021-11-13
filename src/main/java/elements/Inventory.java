/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elements;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.ImageIcon;

/**
 *
 * @author thiago
 */
public class Inventory {
    public static ItemType itemType = ItemType.TILE;
    public static File itemSelected;
    
    public static void tick() {   
        if (Mouse.leftButton) {
            Mouse.leftButton = false;

            int mx = (int)((Mouse.x) + Camera.x);
            int my = (int)((Mouse.y) + Camera.y);

            if (mx > Map.w_vts)
                return;

            if (my > Map.h_vts)
                return;

            int xx = mx/Tile.size;
            int yy = my/Tile.size;

            if (itemType == ItemType.TILE) {
                Image sprite = new ImageIcon(itemSelected.getPath()).getImage();

                Map.tiles[xx + (yy*Map.width)] = new Tile(
                    xx *Tile.size, 
                    yy *Tile.size, 
                    sprite
                );

            } else if (itemType == ItemType.ENTITY) {
            }
        }        
    }
    
    public static void render(Graphics g) {
    }
}
