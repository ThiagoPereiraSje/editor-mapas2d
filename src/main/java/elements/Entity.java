/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elements;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author thiago
 */
public class Entity {
    public int x,y;
    public int width, height;
    public String path;
    private Image sprite;
    
    public Entity(int x, int y, String path) {
        this.x = x;
        this.y = y;
        this.width = 64;
        this.height = 64;
        this.path = path;
        this.sprite = new ImageIcon(path).getImage();
    }
    
    public Entity(int x, int y, int w, int h, String path) {
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
        this.path = path;
        this.sprite = new ImageIcon(path).getImage();
    }
    
    public void tick() {
    }
    
    public void render(Graphics g) {
        g.drawImage(sprite, x - Camera.x, y - Camera.y, width, height, null);
    }
}
