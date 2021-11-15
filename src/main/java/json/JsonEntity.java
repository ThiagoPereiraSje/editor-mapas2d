/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json;

import elements.Entity;

/**
 *
 * @author thiago
 */
public class JsonEntity {
    private int x,y;
    private int width, height;
    private String path;
    
    public JsonEntity(Entity e) {
        this.x = e.x;
        this.y = e.y;
        this.width = e.width;
        this.height = e.height;
        this.path = e.path;
    }
}
