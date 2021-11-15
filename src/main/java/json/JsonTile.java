/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json;

import elements.Tile;

/**
 *
 * @author thiago
 */
public class JsonTile {
    private int x,y;
    private String path;
    
    public JsonTile() {
    }
    
    public JsonTile(Tile tile) {
        this.x = tile.x;
        this.y = tile.y;
        this.path = tile.path;
    }
}
