/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json;

/**
 *
 * @author thiago
 */
public class JsonTile {
    private int x,y;
    private String path;  
    
    public JsonTile(int x, int y, String path) {
        this.x = x;
        this.y = y;
        this.path = path;
    }
}
