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
public class JsonMap {
    private int width;
    private int height;
    private int w_vts;
    private int h_vts;
    
    public JsonMap(int w, int h, int w_vts, int h_vts) {
        this.width = w;
        this.height = h;
        this.w_vts = w_vts;
        this.h_vts = h_vts;
    }
}
