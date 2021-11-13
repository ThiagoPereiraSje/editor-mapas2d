/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elements;

import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author thiago
 */
public class Tile {
    public static final int size = 32;        
    public int x,y;
    public Image sprite;
    
    public Tile(int x, int y, Image sprite) {
        this.x = x;
        this.y = y;
        this.sprite = sprite;
    }
    
    public void render(Graphics g) {
        g.drawImage(sprite, x - Camera.x, y - Camera.y, null);
    }
}
