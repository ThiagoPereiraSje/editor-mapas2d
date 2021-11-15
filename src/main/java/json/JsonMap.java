/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json;

import elements.Map;

/**
 *
 * @author thiago
 */
public class JsonMap {
    private int width;
    private int height;
    private int w_vts;
    private int h_vts;
    private JsonTile[] tiles;
    private JsonEntity[] entities;
    
    public JsonMap() {
    }
    
    public JsonMap(Map map) {
        this.width = map.width;
        this.height = map.height;
        this.w_vts = map.w_vts;
        this.h_vts = map.h_vts;
        this.tiles = new JsonTile[map.tiles.length];
        this.entities = new JsonEntity[map.entities.size()];
        
        for (int i = 0; i < map.tiles.length; i++) {
            this.tiles[i] = new JsonTile(map.tiles[i]);
        }
        
        for (int i = 0; i < map.entities.size(); i++) {
            this.entities[i] = new JsonEntity(map.entities.get(i));
        }
    }
}
