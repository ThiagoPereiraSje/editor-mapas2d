/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elements;

import java.io.File;
import tiles.Grid;

/**
 *
 * @author thiago
 */
public class Inventory {
    public static ItemType itemType = ItemType.TILE;
    public static int itemSize = 32;
    public static File itemSelected;
    
    private static void insertElement(int xx, int yy) {        
        if (itemType == ItemType.TILE) {
            Map.tiles[xx + (yy*Map.width)] = new Tile(
                xx *Tile.size, 
                yy *Tile.size, 
                itemSelected.getPath()
            );
            
        } else if (itemType == ItemType.ENTITY) {
            if (Map.contains(xx *Tile.size, yy *Tile.size) == -1) {
                Map.entities.add(new Entity(
                    xx *Tile.size, 
                    yy *Tile.size, 
                    itemSelected.getPath()
                ));
            }
        }
        
        Cursor.size = itemSize;
        Cursor.move(xx *Tile.size, yy *Tile.size);
        //Cursor.x = xx *Tile.size;
        //Cursor.y = yy *Tile.size;
    }
    
    private static void removeElement(int xx, int yy) {
        if (itemType == ItemType.TILE) {
            Map.tiles[xx + (yy*Map.width)] = new Grid(
                xx *Tile.size,
                yy *Tile.size
            );
        } else if (itemType == ItemType.ENTITY) {
            int index = Map.contains(xx *Tile.size, yy *Tile.size);
            
            if (index > -1) {
                Map.entities.remove(index);
            }
        }
        
        Cursor.size = itemSize;
        Cursor.move(xx *Tile.size, yy *Tile.size);
        //Cursor.x = xx *Tile.size;
        //Cursor.y = yy *Tile.size;
    }
    
    public static void tick() {
        if (itemSelected == null)
            return;
        
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
            
            insertElement(xx, yy);            
                        
        } else if (Mouse.rightButton) {
            Mouse.rightButton = false;
            
            int mx = (int)((Mouse.x) + Camera.x);
            int my = (int)((Mouse.y) + Camera.y);
            
            if (mx > Map.w_vts)
                return;

            if (my > Map.h_vts)
                return;
            
            int xx = mx/Tile.size;
            int yy = my/Tile.size;
            
            removeElement(xx, yy);
            
        } else if (Keyboard.ctrl) {
            int cx = Cursor.x;
            int cy = Cursor.y;
            
            if (cx > Map.w_vts)
                return;

            if (cy > Map.h_vts)
                return;
            
            int xx = cx/Tile.size;
            int yy = cy/Tile.size;
            
            insertElement(xx, yy);
            
        } else if (Keyboard.shift) {
            int cx = Cursor.x;
            int cy = Cursor.y;
            
            if (cx > Map.w_vts)
                return;

            if (cy > Map.h_vts)
                return;
            
            int xx = cx/Tile.size;
            int yy = cy/Tile.size;
            
            removeElement(xx, yy);
        }
    }
}
