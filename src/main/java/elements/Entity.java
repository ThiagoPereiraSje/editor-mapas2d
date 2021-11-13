/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elements;

import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author thiago
 */
public class Entity {
    public int x,y;
    public int width, height;
    private Image sprite;
    
    public Entity(int x, int y, Image sprite) {
        this.x = x;
        this.y = y;
        this.width = 32;
        this.height = 32;
        this.sprite = sprite;
    }
    
    public Entity(int x, int y, int w, int h, Image sprite) {
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
        this.sprite = sprite;
    }
    
    public void tick() {
    }
    
    public void render(Graphics g) {
        g.drawImage(sprite, x - Camera.x, y - Camera.y, width, height, null);
    }
}
