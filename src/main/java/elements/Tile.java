/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elements;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author thiago
 */
public class Tile {
    public static final int size = 32;        
    public int x,y;
    public String path;
    private Image sprite;
    
    public Tile(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Tile(int x, int y, String path) {
        this.x = x;
        this.y = y;
        this.path = path;
        this.sprite = new ImageIcon(path).getImage();
    }
    
    public void render(Graphics g) {
        g.drawImage(sprite, x - Camera.x, y - Camera.y, null);
    }
}
