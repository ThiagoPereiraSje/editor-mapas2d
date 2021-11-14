/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elements;

import java.util.ArrayList;
import java.util.List;
import tiles.Grid;

/**
 *
 * @author thiago
 */
public class Map {
    public static int width;
    public static int height;
    public static int w_vts;
    public static int h_vts;
    public static Tile[] tiles;
    public static List<Entity> entities = new ArrayList<Entity>();
    
    public Map(int w, int h) {
        width = (int) w/Tile.size;
        height = (int) h/Tile.size;
        w_vts = (int) width * Tile.size;
        h_vts = (int) height * Tile.size;
        tiles = new Tile[width * height];
        
        fill();
    }
    
    private void fill() {        
        for (int xx = 0; xx < width; xx++) {
            for (int yy = 0; yy < height; yy++) {
                int index = xx + (yy * width);
                tiles[index] = new Grid(xx * Tile.size, yy * Tile.size);
            }
        }
    }
    
    public static int contains(int x, int y) {
        for(int i=0; i < entities.size(); i++) {
            Entity e = entities.get(i);
            
            if (x == e.x && y == e.y){
                return i;
            }
        }
        
        return -1;
    }
    
    public static boolean isEmpty() {
        return (tiles == null || tiles.length == 0);
    }
}
